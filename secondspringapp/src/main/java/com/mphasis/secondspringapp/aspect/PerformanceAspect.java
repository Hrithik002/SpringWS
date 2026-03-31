package com.mphasis.secondspringapp.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceAspect {

    @Around("execution(* com.mphasis.secondspringapp.service.*.*(..))")
    public Object monitor(ProceedingJoinPoint pjp) throws Throwable {

        long start = System.currentTimeMillis();
        Object result = pjp.proceed();
        long time = System.currentTimeMillis() - start;

        System.out.println("[PERFORMANCE] "
                + pjp.getSignature().getName()
                + " took " + time + "ms");

        return result;
    }
}
