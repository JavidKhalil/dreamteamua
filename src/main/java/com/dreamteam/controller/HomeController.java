package com.dreamteam.controller;

import com.dreamteam.bean.Person;
import com.dreamteam.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/")
    public List<Person> index(){
       return personRepository.findAll();
    }
}
