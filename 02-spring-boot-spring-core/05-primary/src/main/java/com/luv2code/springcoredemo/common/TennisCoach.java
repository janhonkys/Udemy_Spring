package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practise your backhand volley.";
    }
}
