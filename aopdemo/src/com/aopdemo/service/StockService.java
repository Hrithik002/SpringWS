package com.aopdemo.service;

import java.util.Random;

import com.aopdemo.aspect.LoggingAspect;

public class StockService {
	private LoggingAspect loggingAspect = new LoggingAspect();

public int getStock(String id) {
	loggingAspect.before();
	 loggingAspect.after();
	 
	 return new Random(100).nextInt();

}
}
