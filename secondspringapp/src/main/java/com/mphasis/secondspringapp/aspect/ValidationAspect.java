package com.mphasis.secondspringapp.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ValidationAspect {

    @Pointcut(
      "execution(* com.mphasis.secondspringapp.service.BankingService.deposit(..)) || " +
      "execution(* com.mphasis.secondspringapp.service.BankingService.withdraw(..))"
    )
    public void validateTx() {}

    @Before("validateTx()")
    public void validateAmount(JoinPoint jp) {
        double amount = (double) jp.getArgs()[1];

        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
    }
}