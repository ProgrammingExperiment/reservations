package com.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.models.Member;


@RestController
@RequestMapping(value = "/api")
public class MemberController {
	
	@RequestMapping("/Member")
	public Member member() {
		Member member =  new Member(
		321,
		"Emilia",
		"V",
		"Herrear",
		"2064 E. Indian Wells dr. chandler AZ",
		"480-555-5552",
		"480-555-5555",
		"sample@email.com"
		);
	return member;
}

}
