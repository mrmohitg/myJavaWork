package com.springboot.demo.mycoolapp.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoThymeleafController {

	@GetMapping("/helloThymeleafs")
	public String sayHelloThymeleaf(Model model) {
		model.addAttribute("theDate", java.time.LocalDateTime.now());
		return "helloThymeleafWorld";
	}

}
