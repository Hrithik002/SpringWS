package com.mphasis.secondspringapp.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("greetService")
@Scope("singleton")
public class GreetService {
	
	public void greet() {
		System.out.println("welcome Mphasis");
	}

}
