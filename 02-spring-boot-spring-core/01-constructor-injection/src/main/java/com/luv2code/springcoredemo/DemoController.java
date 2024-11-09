package com.luv2code.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define a private field for the dependency
    private Coach myCoach;

    //define a constructor field for the dependency injection
    @Autowired
    public DemoController(Coach theCoach){      //CricketCoach jako @Component, to znamená, že se automaticky vytvoří instance a sem se přidá (DemoController demo = new Democontroller(new CricketCoach()))
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();       // after it it will be called like dome.getDailyWorkout()
    }
}
