package com.mphasis.secondspringapp.aspect;

import java.time.LocalDateTime;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoginAspect {
	
	@Before("execution(* com.mphasis.secondspringapp.service.*.*(..))")
	public void before() {
		System.out.println("Login Metrics..");
		System.out.println("Befor: "+ LocalDateTime.now());
	}
	
	@After("execution(* com.mphasis.secondspringapp.service.*.*(..))")
	public void after() {
		System.out.println("After: "+ LocalDateTime.now());

	}

}
