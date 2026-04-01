package com.mphasis.aopdemo;

import com.mphasis.aopdemo.service.OrderService;
import com.mphasis.aopdemo.service.StockService;

public class MainApp {
	
	public static void main(String args[]) {
		
		OrderService os = new OrderService();
		os.placeOrder();
		StockService ss = new StockService();
		System.out.println(ss.getStock("p1"));
	}

}
