package com.six.autowire;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args)  {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/six/primitive/config.xml");
		
			
		Student st = context.getBean("pooja" ,Student.class);
		
		System.out.println(st);
		
		/*
		 * Employee employee = context.getBean("emp" , Employee.class);
		 * System.out.println(employee);
		 */
	
	}

}
