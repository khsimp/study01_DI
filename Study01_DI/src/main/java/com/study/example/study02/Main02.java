package com.study.example.study02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main02 {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext02.xml");
		Sample02 sample_p = factory.getBean("sample02_p", Sample02.class);
		Sample02 sample_c = factory.getBean("sample02_c", Sample02.class);
		
		System.out.println(sample_p.toString());
		System.out.println(sample_c.toString());
		
		factory.close();
	}

}
