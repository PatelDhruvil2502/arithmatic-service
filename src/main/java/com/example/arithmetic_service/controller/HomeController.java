package com.example.arithmetic_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class HomeController {

    @GetMapping
    public String greeting() {
        return "Welcome to Arithmetic Service";
    }

    @GetMapping("/add/{n}/{m}")
    public int add(@PathVariable int n, @PathVariable int m) {
        return n + m;
    }
}

