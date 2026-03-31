package com.aopdemo;
 
import com.aopdemo.service.OrderService;
import com.aopdemo.service.StockService;
 
public class MainApp {
	
	public static void main(String args[]) {
		
		OrderService os = new OrderService();
		os.placeOrder();
		StockService ss = new StockService();
		System.out.println(ss.getStock("p1"));
	}
 
}
 
 