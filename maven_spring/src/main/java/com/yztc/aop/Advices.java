package com.yztc.aop;

import org.aspectj.lang.JoinPoint;

//��֪ͨ�������DoSomeThing�����洦����
public class Advices {
	
	public void before(JoinPoint jp){
        System.out.println("----------������֮ǰ----------");
        //�õ�������ǩ��������
        System.out.println(jp.getSignature().getName());
    }
    
    public void after(JoinPoint jp){
        System.out.println("----------������֮��----------");
    }
    
}
