package bookESell.RestAPI.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;
import bookESell.RestAPI.model.User;
import bookESell.RestAPI.model.status;
import bookESell.RestAPI.repository.UserRepository;
import bookESell.RestAPI.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public status registerUser(User user) {

		List<User> users = userRepository.findAll();
		
		for(User aUser : users)
		{
			if((aUser.getEmail()).equals(user.getEmail()))
				return status.USER_ALREADY_EXISTS;
		}
		
		userRepository.save(user);
		return status.SUCCESS;
	}

	@Override
	public User loginUser(User user) {
		// TODO Auto-generated method stub
		
		List<User> users = userRepository.findAll();
		for(User aUser : users)
		{
			if((aUser.getEmail()).equals(user.getEmail()) && (aUser.getPassword()).equals(user.getPassword()))
				return aUser;
				System.out.println(aUser.getfName());
//			status.SUCCESS;
		}
		
			return null;
		
		
	}

}


