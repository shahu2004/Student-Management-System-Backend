package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mycontroller {
	
	@RequestMapping("/hu")
	public String view() {
		return "home";
	}

}
