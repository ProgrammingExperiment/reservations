package com.web.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping(value = "/web")
public class UserController {

    @RequestMapping(value = "/user")
    public String user(Model model){
        model.addAttribute("username", "Alfredo");
        return "User";
    }
}
