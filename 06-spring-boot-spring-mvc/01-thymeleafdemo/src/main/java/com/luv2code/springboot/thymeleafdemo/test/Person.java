package com.luv2code.springboot.thymeleafdemo.test;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class Person {

    private String name;

    private int age;

    private Head head;

    private ArrayList<String> subjects;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.subjects = new ArrayList<>();
    }

    public Person() {
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public List<String> getSubjects() {
        return Collections.unmodifiableList(subjects);
    }

    public void addSubject(String... subjects) {
        for (String tmp : subjects) {
            this.subjects.add(tmp);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String sayHi() {
        return "Hi I am Person.";
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
