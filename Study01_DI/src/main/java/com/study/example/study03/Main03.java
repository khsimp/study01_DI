package com.study.example.study03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main03 {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext03.xml");
		Sample03List sample_p = factory.getBean("sample03_p", Sample03List.class);
		Sample03List sample_c = factory.getBean("sample03_c", Sample03List.class);
		
		System.out.println(sample_p.toString());
		System.out.println(sample_c.toString());
		
		factory.close();
	}

}
