package com.example.javaremoteee21spring.controller.rest;


import com.example.javaremoteee21spring.dto.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MyFirstController {

    @GetMapping("/name")
    public String showMeMyName(){
        return "Erki";
    }

    @GetMapping("/me")
    public Person justMe() {
        return new Person("Erki", "Sirak", 32);
    }

    @GetMapping("/me-and-friend")
    public List<Person> meAndFriend(){
        List<Person> persons = new ArrayList<>();
        return List.of(
                new Person("Erki", "Sirak", 32),
                new Person("Tonis", "Sirak", 32)
        );
    }
}
