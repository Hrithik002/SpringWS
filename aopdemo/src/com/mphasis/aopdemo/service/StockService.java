package com.mphasis.aopdemo.service;

import java.util.Random;

import com.mphasis.aopdemo.aspect.LoginAspect;

public class StockService {
	private LoginAspect loginAspect = new LoginAspect();

	
	public int getStock(String id) {
		loginAspect.before();
		loginAspect.after();
		return new Random(100).nextInt();
	}

}
