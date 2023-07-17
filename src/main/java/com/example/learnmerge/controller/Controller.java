package com.example.learnmerge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public void getMethod(){
        System.out.println("controller method");
    }
    @GetMapping
    public void getMethod2(){
        System.out.println("controller method merge now");
    }
}
