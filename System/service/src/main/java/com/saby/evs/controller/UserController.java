package com.saby.evs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.saby.evs.exception.ServiceException;
import com.saby.evs.request.UserRequest;
import com.saby.evs.response.UserResponse;
import com.saby.evs.service.IUserService;


/**
 * @author Sabyasachi
 *
 */
@RestController
@RequestMapping("/system/saby")
public class UserController {

	@Autowired
	IUserService logInService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public UserResponse loginUser(
			@RequestBody UserRequest userRequest){
		UserResponse response =null;
		try{		
			response = logInService.loginUser(userRequest);
			return response;
		}catch(ServiceException e){
			return response;
		}
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public UserResponse registerUser(
			@RequestBody UserRequest userRequest){
		UserResponse response =null;
		try{		
			response = logInService.registerUser(userRequest);
			return response;
		}catch(ServiceException e){
			return response;
		}
	}
}
