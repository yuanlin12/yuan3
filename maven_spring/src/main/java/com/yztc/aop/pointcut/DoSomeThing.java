package com.yztc.aop.pointcut;

import org.springframework.stereotype.Repository;

//�������Ŀ����
@Repository("dst")
public class DoSomeThing {

	public void doThings(){
		System.out.println("���ڸ�����");
		int i = 1/0;
	}

	public void doThings2() {
		System.out.println("���ڸ�����2");
	}
}
