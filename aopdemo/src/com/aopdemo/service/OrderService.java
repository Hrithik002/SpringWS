package com.aopdemo.service;

import com.aopdemo.aspect.LoggingAspect;

public class OrderService {
private LoggingAspect loggingAspect = new LoggingAspect();

	public void placeOrder() {
		loggingAspect.before();
		System.out.println("Order Placed");
		loggingAspect.after();
	}
}
