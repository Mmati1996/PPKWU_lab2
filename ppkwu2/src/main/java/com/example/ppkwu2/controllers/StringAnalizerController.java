package com.example.ppkwu2.controllers;

import com.example.ppkwu2.StringAnalizer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringAnalizerController {

    // == http://localhost:8080/stringinfo?string=12345qwer ==
    @GetMapping("/stringinfo")
    public StringAnalizer analize(@RequestParam String string){
        return new StringAnalizer(string);
    }
}
