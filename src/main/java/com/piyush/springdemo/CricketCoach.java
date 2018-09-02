package com.piyush.springdemo;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg contructor");
    }

    public void setFortuneService(FortuneService theFortuneService){
        System.out.println("CricketCoach: inside setter method");
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getDailyWorkOut(){
        return "Spend 30 min on Batting Practice";
    }
}
