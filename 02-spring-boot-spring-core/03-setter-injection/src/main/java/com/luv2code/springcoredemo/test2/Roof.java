package com.luv2code.springcoredemo.test2;

import org.springframework.stereotype.Component;

@Component
public class Roof {

    private int age;

    public Roof() {
    }

    public Roof(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
