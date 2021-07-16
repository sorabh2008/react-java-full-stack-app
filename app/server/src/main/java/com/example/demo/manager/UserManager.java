package com.example.demo.manager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.model.dto.UserDTO;
import com.example.demo.model.to.UserTO;

@Component
public class UserManager {
	public List<UserTO> getUsers() throws InterruptedException {
		List<UserTO> resp = new ArrayList<UserTO>();
		Thread.sleep(2*1000);
		UserDTO userDto = new UserDTO();
		userDto.setEmail("email@test.com");
		userDto.setName("Tester");
		userDto.setPhone("0412345678");
		UserTO userTo = new UserTO();
		userTo.setEmail(userDto.getEmail());
		resp.add(userTo);
		return resp;
	}
}
