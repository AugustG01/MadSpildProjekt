package com.example.madspildminiprojekt.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/company")
    public String company(){
        return "company";
    }

    @GetMapping("/consumer")
    public String consumer(){
        return "consumer";
    }
}
