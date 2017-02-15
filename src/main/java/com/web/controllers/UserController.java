package com.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.Timestamp;
import java.time.Instant;

@Controller
@RequestMapping(value = "/web")
public class UserController {

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
