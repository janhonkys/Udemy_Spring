package com.luv2code.springcoredemo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private Company company;

    @Autowired
    public TestController(Company company) {
        this.company = company;
    }

    @GetMapping("/test")
    public String test() {
        return company.getPerson().toString();
    }

}
