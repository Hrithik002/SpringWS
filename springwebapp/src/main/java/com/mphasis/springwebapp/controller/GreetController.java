package com.mphasis.springwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetController {
@RequestMapping(value="/greet",method = RequestMethod.GET)
public String greetPage(@RequestParam("name")String name, @RequestParam("city") String city, Model model ){
	model.addAttribute("name",name);
	model.addAttribute("city",city);

	return "greetpage";
}
}
