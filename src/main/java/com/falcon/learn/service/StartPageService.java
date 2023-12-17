package com.falcon.learn.service;

import org.springframework.stereotype.Service;

@Service
public class StartPageService {

	public String welcome() {
		return "Dude! You're welcome to AWS Elastic BeanStalk";
	}
}
