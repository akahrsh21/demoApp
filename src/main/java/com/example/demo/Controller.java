package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/get")
    public String testGetMapping(){
        return "Hello Akahrsh";
    }
}
