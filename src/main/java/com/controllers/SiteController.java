package com.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Site;

@RestController
public class SiteController {

	@RequestMapping("/site")
	public Site location(){
		return new Site(1,"Pekin");
	}
}
