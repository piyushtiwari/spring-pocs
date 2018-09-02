package com.piyush.springdemo;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;

    public void setFortuneService(FortuneService theFortuneService){
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyFortune() {
        return null;
    }

    @Override
    public String getDailyWorkOut(){
        return "Spend 30 min on Batting Practice";
    }
}
