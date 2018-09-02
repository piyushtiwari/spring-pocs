package com.piyush.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from container
        Coach cricCoach = context.getBean("myCricketCoach", Coach.class);

        // call method on the bean
        System.out.println(cricCoach.getDailyWorkOut());
        System.out.println(cricCoach.getDailyFortune());


        // context close
        context.close();
    }
}
