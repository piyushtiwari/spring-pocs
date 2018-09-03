package com.piyush.springdemo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    private String emailAddress;
    private String team;

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg contructor");
    }

    public void setFortuneService(FortuneService theFortuneService){
        System.out.println("CricketCoach: inside setter method");
        this.fortuneService = theFortuneService;
    }


    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
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
