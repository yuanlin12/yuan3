package com.yztc.aop.annotation;

import org.springframework.stereotype.Repository;

//�������Ŀ����
@Repository("dst")
public class DoSomeThing {

	public void doThings() {
		System.out.println("���ڸ�����");
	}

	public void doThings2() {
		System.out.println("���ڸ�����2");
	}
}
