package com.yztc.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Repository;

//��֪ͨ�������DoSomeThing�����洦����
@Repository("advices")
@Aspect
public class Advices {
	@Before("execution(* com.yztc.aop.annotation.DoSomeThing.*(..))")
	public void before(){
        System.out.println("----------������֮ǰ----------");
    }
	
    @After("execution(* com.yztc.aop.annotation.DoSomeThing.*(..))")
    public void after(JoinPoint jp){
        System.out.println("----------������֮��----------");
    }
}
