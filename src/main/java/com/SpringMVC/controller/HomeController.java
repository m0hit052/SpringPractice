package com.SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String getHome() {
        return "home";
    }

    @RequestMapping("/add")
    public String Addition(@RequestParam("Input 1") Integer first, @RequestParam("Input 2") Integer second, Model model) {
        int result = first+second;
        model.addAttribute("result",result);
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
