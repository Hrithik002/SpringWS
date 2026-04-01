package com.mphasis.firstspringapp.service;

public class GreetService {
	private String message;
	public void init() {
		System.out.println("GreetService Initialized");

	}
	
	public GreetService(String message) {
		this.message = message;
	}

	public void greet() {
		System.out.println(message);
	}
	
	public void destroy() {
		System.out.println("GreetService destroyed");

	}

}
