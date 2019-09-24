package com.antai.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Coach theTennisCoach = context.getBean("tennisCoach", Coach.class);
		Coach theBaseballCoach = context.getBean("baseballCoach", Coach.class);
		
		//call a method on the bean
		System.out.println(theTennisCoach.getDailyWorkout());
		System.out.println(theTennisCoach.getDailyFortune());
		System.out.println(theBaseballCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}
}
