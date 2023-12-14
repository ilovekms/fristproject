package com.example.fristproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloHtmlController {

    @GetMapping("/hellohtml")
    public String homepage() {
        return "hello.html";
    }
}
