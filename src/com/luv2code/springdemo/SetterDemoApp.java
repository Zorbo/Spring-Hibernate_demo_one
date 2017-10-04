package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean from spring config
		
		BoxingCoach theCoach = context.getBean("myBoxingCoach", BoxingCoach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
	    System.out.println(theCoach.getEmailAddress());
	    System.out.println(theCoach.getTeam());
		
		// close the context
        context.close();
	}

}
