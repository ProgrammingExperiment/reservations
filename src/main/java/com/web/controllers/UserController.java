package com.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import com.web.models.*;

@Controller
@RequestMapping(value = "/web")
public class UserController {

	public static List<User> userRepo = new ArrayList<>();

    public void recallUserRepo(){
        if(userRepo.isEmpty()){
            userRepo.add(new User(1,"alfredo"));
            userRepo.add(new User(2,"luis"));
            userRepo.add(new User(3,"shawn"));

        }

    }

	@RequestMapping(value = "/user")
	public String getUser(Model model) {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());

		model.addAttribute("username", "Alfredo");
		model.addAttribute("btn", "I call this Submit");
		model.addAttribute("variableTimeStamp", timestamp);

		return "User";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String createUser(Model model) {
		model.addAttribute("username", "Alfredo");
		model.addAttribute("btn", "I call this Submit");
		return "User";
	}
}
