package com.example.spring.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {


    @GetMapping(value = "/")
    public String defaultAPI (){
        return "<h1> Hello world</h1>";
    }
}
