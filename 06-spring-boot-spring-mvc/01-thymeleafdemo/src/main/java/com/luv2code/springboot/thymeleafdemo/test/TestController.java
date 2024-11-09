package com.luv2code.springboot.thymeleafdemo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    private Person person;

    @GetMapping("/test1")
    public String person(){
        return person.sayHi();
    }

    @GetMapping("/test2")
    public Person person1() {
        Person per = new Person("Pave", 20);
        Head head = new Head(20, 2);
        per.addSubject("Per", "Pera");
        per.setHead(head);
        return per;
    }

    @GetMapping("/test")
    public List<String> test() {
        List<String> list = new ArrayList<>();
        list.add("Pabel");
        list.add("Adam");
        list.add("Adamafd");
        return Collections.unmodifiableList(list);
    }

}
