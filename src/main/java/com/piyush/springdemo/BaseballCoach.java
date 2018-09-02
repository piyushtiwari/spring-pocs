package com.piyush.springdemo;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    BaseballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Practice Baseball skills..";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
