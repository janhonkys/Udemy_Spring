package com.luv2code.springcoredemo.test;

import org.springframework.stereotype.Component;

@Component
public class Women extends Person {
    public Women() {
        super("Default Name", 25);
    }

    public void sayHi() {
        System.out.println("I am women.");
    }

    @Override
    public String toString() {
        return "Women{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }

}
