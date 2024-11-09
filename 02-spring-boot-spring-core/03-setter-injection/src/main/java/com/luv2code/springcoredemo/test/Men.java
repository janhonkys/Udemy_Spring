package com.luv2code.springcoredemo.test;

import org.springframework.stereotype.Component;

@Component
public class Men extends Person {
    public Men() {
        super("Pavel", 30);
    }

    public void sayHi() {
        System.out.println("I am men.");
    }

    @Override
    public String toString() {
        return "Men{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }

}
