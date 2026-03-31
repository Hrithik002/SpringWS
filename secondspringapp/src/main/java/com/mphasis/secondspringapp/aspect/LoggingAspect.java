package com.mphasis.secondspringapp.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.mphasis.secondspringapp.service.*.*(..))")
    public void serviceLayer() {}

    @Before("serviceLayer()")
    public void logEntry(JoinPoint jp) {
        System.out.println("[LOG] Entering " + jp.getSignature().getName()
                + " args=" + Arrays.toString(jp.getArgs()));
    }

    @AfterThrowing(pointcut = "serviceLayer()", throwing = "ex")
    public void logException(JoinPoint jp, Exception ex) {
        System.out.println("[LOG] Exception in "
                + jp.getSignature().getName()
                + " : " + ex.getMessage());
    }
}