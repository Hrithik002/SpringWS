package com.bank.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {

	@Pointcut("execution(* *..service.*.*(..))")
	public void serviceMethods() {}
	
    @Before("serviceMethods()")
    public void logBefore(JoinPoint jp) {
        System.out.println("[LOG] Entering method: " +
                jp.getSignature().getName() +
                " with args: " + Arrays.toString(jp.getArgs()));
    }

    @After("serviceMethods()")
    public void logAfter(JoinPoint jp) {
        System.out.println("[LOG] Method " +
                jp.getSignature().getName() +
                " executed");
    }

    @AfterReturning(pointcut = "serviceMethods()", returning = "result")
    public void logReturn(Object result) {
        if (result != null) {
            System.out.println("[LOG] Returned: " + result);
        }
    }

    @AfterThrowing(pointcut = "serviceMethods()", throwing = "ex")
    public void logException(Exception ex) {
        System.out.println("[LOG] Exception: " + ex.getMessage());
    }
}