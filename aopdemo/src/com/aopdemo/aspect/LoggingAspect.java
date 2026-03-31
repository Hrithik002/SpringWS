package com.aopdemo.aspect;
 
import java.time.LocalDateTime;
 
public class LoggingAspect {
 
	public void before() {
		System.out.println("Befor: "+ LocalDateTime.now());
	}
	public void after() {
		System.out.println("After: "+ LocalDateTime.now());
	}
}
 
 