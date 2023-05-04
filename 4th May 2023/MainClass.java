package com.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainClass {
	public static void main(String... args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e1 = (Employee) context.getBean("empl");
		System.out.println(e1);
		}
	}


