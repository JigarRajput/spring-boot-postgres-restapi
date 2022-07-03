package bookESell.RestAPI.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import bookESell.RestAPI.model.User;
import bookESell.RestAPI.model.status;

public interface UserService {

	status registerUser(User user);
	User  loginUser(User user);
	
}
