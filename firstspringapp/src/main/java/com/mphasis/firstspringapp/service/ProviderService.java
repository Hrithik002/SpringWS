package com.mphasis.firstspringapp.service;
 
import org.springframework.stereotype.Service;
 
@Service("providerService")
public class ProviderService {
	private String operator ="JIO";
	public String getOperator() {
		
		 return Operator();
	}
	
	private String Operator() {
		// TODO Auto-generated method stub
		return null;
	}
 
	public void setOperator(String operator) {
		this.operator=operator;
		
	}
	public void configureProvider() {
		System.out.println("Provider Configured to"+operator);
	}
 
}
 
 