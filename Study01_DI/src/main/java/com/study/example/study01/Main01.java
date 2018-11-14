package com.study.example.study01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main01 {

	public static void main(String[] args) {
		System.out.println("===========> 1. Application Start");
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext01.xml");
		
		System.out.println("===========> 2. ApplicationContext 생성");
		//Sample01 sample = factory.getBean(Sample01.class);
		//Sample01 sample = (Sample01) factory.getBean("sample");
		Sample01 sample = factory.getBean("sample", Sample01.class);
		
		System.out.println("===========> 3. Sample getBean");
		sample.setId("aaa");
		sample.setNum(10);
		System.out.println(sample.toString());
		
		factory.close();
		System.out.println("===========> 4. Application Stop");
	}

}
