package com.ltts.ShadowWelcome.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
