package com.luv2code.springcoredemo.test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContorleer2 {

    @Autowired
    private Roof roof;

    @GetMapping("/house")
    public House house() {
        Roof roof = new Roof(10);
        House house = new House("Prostějov", roof);

        return house;
    }

    @GetMapping("/roof")
    public Roof roof() {
        roof.setAge(20);
        return roof;
    }

}
