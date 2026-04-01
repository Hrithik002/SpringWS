package com.mphasis.aopdemo.service;

import com.mphasis.aopdemo.aspect.LoginAspect;

public class OrderService {
	private LoginAspect loginAspect = new LoginAspect();
	
	public void placeOrder() {
		loginAspect.before();
		System.out.println("Order placed...");
		loginAspect.after();

	}

}
