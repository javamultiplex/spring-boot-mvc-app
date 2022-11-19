package com.github.javamultiplex.controller;

import com.github.javamultiplex.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Rohit Agarwal on 14/11/22 11:42 pm
 * @copyright github.com/javamultiplex
 */
@Controller
public class HelloWorldController {

    @PostMapping(value = "/save")
    public ModelAndView hello(@ModelAttribute User user) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @GetMapping(value = "/")
    public String root() {
        return "index";
    }

    @GetMapping(value = "/fun")
    public String fun() {
        return "fun";
    }


}
