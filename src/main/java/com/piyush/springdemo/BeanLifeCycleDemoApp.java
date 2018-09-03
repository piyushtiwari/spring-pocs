package com.piyush.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

    public static void main(String[] args) {

        // Load the spring configuration
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // retrieve the bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println( theCoach.getDailyWorkOut() );

        context.close();
    }
}
