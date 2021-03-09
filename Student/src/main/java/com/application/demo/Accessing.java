package com.application.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Accessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext context = new ClassPathXmlApplicationContext(" Newbeanxml.xml ");
     
     Student student = context.getBean("student", Student.class);
    
     student.cheating(); 
	}
}
