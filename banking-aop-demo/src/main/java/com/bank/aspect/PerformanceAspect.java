package com.bank.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceAspect {

    @Around("execution(* com.bank.service.*.*(..))")
    public Object monitor(ProceedingJoinPoint pjp) throws Throwable {

        long start = System.currentTimeMillis();
        Object result = pjp.proceed();
        long timeTaken = System.currentTimeMillis() - start;

        if (timeTaken > 100) {
            System.out.println("[PERFORMANCE] WARNING: " +
                    pjp.getSignature().getName() +
                    " took " + timeTaken + "ms");
        } else {
            System.out.println("[PERFORMANCE] " +
                    pjp.getSignature().getName() +
                    " executed in " + timeTaken + "ms");
        }

        return result;
    }
}