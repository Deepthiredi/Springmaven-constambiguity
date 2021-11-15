package com.testyanthra.constructor_ambiguity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("com/testyanthra/constructor_ambiguity/config.xml");
     Employee emp=(Employee) context.getBean("employee");
     System.out.println(emp);
	}

}
