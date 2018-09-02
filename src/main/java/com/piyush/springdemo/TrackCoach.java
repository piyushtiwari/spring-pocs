package com.piyush.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(){

    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Run a hard 5 km";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it....: " + fortuneService.getFortune() ;
    }
}
