package com.luv2code.springboot.thymeleafdemo.test;

public class Head {

    private int age;

    private int numOfEyes;

    public Head(int age, int numOfEyes) {
        this.age = age;
        this.numOfEyes = numOfEyes;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumOfEyes() {
        return numOfEyes;
    }

    public void setNumOfEyes(int numOfEyes) {
        this.numOfEyes = numOfEyes;
    }

    @Override
    public String toString() {
        return "Head{" +
                "age=" + age +
                ", numOfEyes=" + numOfEyes +
                '}';
    }
}
