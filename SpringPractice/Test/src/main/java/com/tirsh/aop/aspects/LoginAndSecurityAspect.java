package com.tirsh.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoginAndSecurityAspect {
//    @Pointcut("execution(* com.tirsh.aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){}
//    @Pointcut("execution(* com.tirsh.aop.UniLibrary.return*())")
//    private void allReturnMethodsToUniLibrary(){}
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsToUniLibrary()")
//    private void allGetAndReturnMethodsToUniLibrary(){}
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoginAdvice(){
//        System.out.println("beforeGetLoginAdvice: write log #1");
//    }
//    @Before("allReturnMethodsToUniLibrary()")
//    public void beforeReturnLoginAdvice(){
//        System.out.println("beforeReturnLoginAdvice: write log #2");
//    }
//    @Before("allGetAndReturnMethodsToUniLibrary()")
//    public void beforeGetAndReturnLoginAdvice(){
//        System.out.println("beforeGetAndReturnLoginAdvice: write log #3");
//    }

//
    @Pointcut("execution(* get*())")
    private void getAllMethods(){}
    @Before("getAllMethods()")
    public void beforeGetLoginAdvice(){
        System.out.println("beforeGetBookAdvice trying to take book");
    }
    @Before("getAllMethods()")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice check rules");
    }

}
