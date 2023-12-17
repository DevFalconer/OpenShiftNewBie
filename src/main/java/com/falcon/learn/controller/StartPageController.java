package com.falcon.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.falcon.learn.service.StartPageService;

@RestController
public class StartPageController {
	
	@Autowired
	private StartPageService startPageService;
	
	@GetMapping("/welcome")
	public String welcome() {
		return startPageService.welcome();
	}

}
