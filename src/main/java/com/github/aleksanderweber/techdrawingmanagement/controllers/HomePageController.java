package com.github.aleksanderweber.techdrawingmanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomePageController {

    @GetMapping("/hello")
    public String showHomepage() {

        return "hello";
    }
}
