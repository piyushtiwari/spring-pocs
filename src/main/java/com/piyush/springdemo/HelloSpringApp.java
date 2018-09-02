package com.piyush.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {

        // load the spring confiuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve the bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call methods on the beans
        System.out.println( theCoach.getDailyWorkOut() );

        System.out.println( theCoach.getDailyFortune() );

        // close the context
        context.close();
    }
}
