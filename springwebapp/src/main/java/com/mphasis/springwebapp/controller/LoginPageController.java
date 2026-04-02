package com.mphasis.springwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mphasis.springwebapp.service.LoginService;

@Controller
public class LoginPageController {
	@Autowired
	private LoginService loginService;
	
	
	
	@RequestMapping( value="/login",method = RequestMethod.GET)
	public String LoginPage() {
		return "loginPage";
	}
	
	@RequestMapping( value="/dologin",method = RequestMethod.POST)
	public String dologin(@RequestParam("lg")String login, @RequestParam("pw") String password,Model model){
		if (loginService.checkLogin(login,password))
		{
			model.addAttribute("user",login);
			
		
			return "successpage"; 
		}
		else {
			model.addAttribute("msg","Invalid login/password");
		return "loginPage";
	}

	}
}
