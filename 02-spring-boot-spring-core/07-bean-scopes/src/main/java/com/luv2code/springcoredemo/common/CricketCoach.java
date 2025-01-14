package com.luv2code.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)    // change to PROTOTYPE (will create instance for each one) Singleton will create 1 instance.
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In constructor: "+getClass().getSimpleName());
    }

    @Override
    public String gedDailyWorkout() {
        return "Practise fast bowling for 15 minutes..";
    }
}
