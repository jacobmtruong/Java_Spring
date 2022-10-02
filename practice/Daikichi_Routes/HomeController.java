package com.jacob.daikichiRoutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping ("/daikichi")
public class HomeController {
	
	public String name = "Jisoo";
	
	@RequestMapping ("")
	public String index() {
		return ("Welcome, " + name);
	}
	
	@RequestMapping ("/today") 
	public String today() {
		return ("Today you will find luck in all you endeavors, " + name + "!");
	}
	
	@RequestMapping ("/tomorrow")
	public String tomorrow() {
		return ("Tomorrow, an opportunity will arise, so be sure to be open to new idea, " + name + "!");
	}
	
	
}
