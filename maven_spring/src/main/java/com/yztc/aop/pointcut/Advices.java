package com.yztc.aop.pointcut;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Repository;

//��֪ͨ�������DoSomeThing�����洦����
@Repository("advices")
@Aspect
public class Advices {
	//�����
	@Pointcut("execution(* com.yztc.aop.pointcut.DoSomeThing.doThings(..))")
	public void pointCut(){
	}
	
	//ǰ��
	@Before("pointCut()")
	public void before(JoinPoint jp){
        System.out.println("----------������֮ǰ----------");
    }
	
	//����֪ͨ
    @After("pointCut()")
    public void after(JoinPoint jp){
        System.out.println("----------������֮��----------");
    }
    
    //����
    @Around("execution(* com.yztc.aop.pointcut.DoSomeThing.doThings(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
    	System.out.println(pjp.getSignature().getName());
        System.out.println("----------����ǰ��----------");
        Object result=pjp.proceed();  //����ʵ�ʵķ���
        System.out.println("----------���ƺ���----------");
        return result;
    }
    
    //���ؽ��֪ͨ
    @AfterReturning(pointcut="execution(* com.yztc.aop.pointcut.DoSomeThing.doThings(..))",returning="result")
    public void afterReturning(JoinPoint jp,Object result){
        System.out.println(jp.getSignature().getName());
        //System.out.println("����ǣ�"+result);
        System.out.println("----------���ؽ��----------");
    }
    
    //�쳣��֪ͨ
    @AfterThrowing(pointcut="execution(* com.yztc.aop.pointcut.DoSomeThing.doThings(..))",throwing="exp")
    public void afterThrowing(JoinPoint jp,Exception exp){
        System.out.println(jp.getSignature().getName());
        System.out.println("�쳣��Ϣ��"+exp.getMessage());
        System.out.println("----------�쳣֪ͨ----------");
    }
}
