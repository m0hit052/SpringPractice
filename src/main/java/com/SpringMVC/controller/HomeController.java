package com.SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String getHome() {
        return "home";
    }

    @RequestMapping("/add")
    public ModelAndView Addition(HttpServletRequest request,HttpServletResponse response) {
        int first = Integer.parseInt(request.getParameter("Input 1"));
        int second = Integer.parseInt(request.getParameter("Input 2"));
        int result = first+second;

        ModelAndView view = new ModelAndView();
        view.setViewName("add");
        view.addObject("result",result);
        return view;
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
