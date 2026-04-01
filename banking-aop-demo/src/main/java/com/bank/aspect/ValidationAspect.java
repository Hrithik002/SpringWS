package com.bank.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ValidationAspect {

    @Before("execution(* *..service.*.deposit(..)) || execution(* *..service.*.withdraw(..))")
    public void validateAmount(JoinPoint jp) {

        Object[] args = jp.getArgs();
        double amount = (double) args[1];

        if (amount <= 0) {
            System.out.println("[VALIDATION] ERROR: Amount must be positive");
            throw new IllegalArgumentException("Amount must be positive");
        }

        System.out.println("[VALIDATION] Amount validated");
    }
}
