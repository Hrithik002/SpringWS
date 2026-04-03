package com.mpahsis.springrestapp.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	@RequestMapping(value = "/greet",method=RequestMethod.GET)
	public String greet() {
		return "Hello Mphasis!!!, Happy Learning!!!";
	}
	
	
	@RequestMapping(value = "/greet/{name}",method=RequestMethod.GET)
	public String greetName(@PathVariable("name")String name) {
		return "Hello " + name + "!!, Happy Learning!!!";
	}
	
	@RequestMapping(value = "/greet",method = RequestMethod.POST)
	public String greetNameBody(@RequestBody String name) {
		return "Hello " + name + "!!, Happy Learning!!!";
	}
	
}