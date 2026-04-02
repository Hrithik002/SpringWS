package com.mphasis.springwebapp.service;

import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginService {
	public boolean checkLogin(String login,String password) {
		
		if(login.equals("tom") && password.equals("123")) {
			return true;
			
		} else {
			return false;
		}
		
	}

}
