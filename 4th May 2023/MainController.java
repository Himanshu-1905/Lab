package com.spring.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
@RequestMapping("/hello")
public String display() { 
	return "index";
}
}
