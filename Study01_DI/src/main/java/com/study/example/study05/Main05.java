package com.study.example.study05;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main05 {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext05.xml");
		Sample05 sample = factory.getBean("sample05", Sample05.class);
		
		System.out.println(sample.toString());
		
		factory.close();
	}

}
