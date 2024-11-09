package com.luv2code.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("CricketCoach: "+getClass());
    }

    @Override
    public String getDailyWorkout() {
        return "Practise fast bowling for 15 minutes. NOW!!!!";
    }
}
