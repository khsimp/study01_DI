package com.study.example.study04;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main04 {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext04.xml");
		Sample04Object sample04_p = factory.getBean("sample04_p", Sample04Object.class);
		Sample04Object sample04_c = factory.getBean("sample04_c", Sample04Object.class);
		
		System.out.println(sample04_p.toString());
		System.out.println(sample04_c.toString());
		
		factory.close();
	}

}
