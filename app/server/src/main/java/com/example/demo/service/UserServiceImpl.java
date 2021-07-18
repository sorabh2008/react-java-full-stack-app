package com.example.demo.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.ErrorConstants;
import com.example.demo.manager.UserManager;
import com.example.demo.model.to.UserResponse;

@RestController
public class UserServiceImpl implements IService{
	
	@Autowired(required = true)
	UserManager usrMgr;
	private UserResponse response;
	@CrossOrigin(origins="http://localhost:3000")
	@GetMapping(value="/")
	public UserResponse getUsers() {
		Date startTime = new Date();
		response = new UserResponse();
		try {
			response.response = usrMgr.getUsers();
			response.statusCode = ErrorConstants.CODE_200.value;
			response.statusMsg = ErrorConstants.MESSAGE_200.label;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		Date endTime = new Date();
		System.out.print(endTime.getTime() - startTime.getTime());
		return response;
	}
}
