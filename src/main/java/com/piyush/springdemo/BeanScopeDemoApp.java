package com.piyush.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        // Load the spring configuration
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve the bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check if these are the same
        boolean result = (theCoach == alphaCoach);

        System.out.println("Point to the same Object: " + result);

        System.out.println("memory location of theCoach: " + theCoach);
        System.out.println("memory location of alphaCoach: " + alphaCoach);

    }
}
