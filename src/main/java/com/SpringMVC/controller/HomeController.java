package com.SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String getHome() {
        return "home";
    }

    @RequestMapping("/add")
    public String Add() {
        return "add";
    }

    @RequestMapping("/showForm")
    public String getForm() {
        return "NameForm";
    }

    @RequestMapping("/processForm")
    public String getName() {
        return "NameDetails";
    }
}
