package com.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.models.Membership;

@RestController
@RequestMapping(value = "/api")
public class MembershipController {

	@RequestMapping("/Membership")
	public Membership getMembership() {
		return new Membership(1, "Cancun", "Paris");
	}
}
