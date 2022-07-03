package bookESell.RestAPI.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bookESell.RestAPI.model.Book;
import bookESell.RestAPI.model.User;
import bookESell.RestAPI.model.status;
import bookESell.RestAPI.service.BookService;
import bookESell.RestAPI.service.UserService;

import java.util.*;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	
	//creating Register rest api
	
	@PostMapping("/user/register")
	public ResponseEntity<String> registerUser(@RequestBody User user){
		
		status registerStatus = userService.registerUser(user);
		if(registerStatus == status.USER_ALREADY_EXISTS)
			return new ResponseEntity<>(registerStatus.toString(),HttpStatus.ALREADY_REPORTED);
		
		else
			return new ResponseEntity<>(registerStatus.toString(),HttpStatus.OK);
	
	}
	
	//creating login rest api
	
	@PostMapping("/user/login")
	public ResponseEntity<User> loginUser(@RequestBody User user){
		
//		status loginStatus = userService.loginUser(user);
		User loginStatus = userService.loginUser(user);
//		if(loginStatus == status.SUCCESS)
		if(loginStatus != null)
			return new ResponseEntity<>(loginStatus,HttpStatus.OK);
//		HttpStatus.OK
		
		else
			return new ResponseEntity<>(loginStatus,HttpStatus.UNAUTHORIZED);
	
	}
	

}
