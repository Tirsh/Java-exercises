package com.tirsh.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoginAspect {
    @Before("execution(public void com.tirsh.aop.UniLibrary.get*())")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice trying to take book");
    }
    @Before("execution(public void return*())")
    public void beforeReturnBookAdvice(){
        System.out.println("beforeReturnBookAdvice trying to return book");
    }
}
