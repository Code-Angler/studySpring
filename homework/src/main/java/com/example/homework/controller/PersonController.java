package com.example.homework.controller;

import com.example.homework.prac.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PersonController {

    @GetMapping("/myinfo")
    public Person getPersons(){

        Person person = new Person();
        person.setName("이동욱");
        person.setJob("저승사자");
        person.setAge(140);

        Person person1 = new Person();
        person1.setName("공유");
        person1.setJob("도꺠비");
        person1.setAge(153);
        return person;

    }
}
