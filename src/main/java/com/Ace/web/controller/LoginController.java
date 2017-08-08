package com.Ace.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {
	
	
	
	@RequestMapping(value={"/","/index","/index.jsp"})
    public String home() {
        return "index";
    }

	@RequestMapping(value={"/gngl"})
    public String gngl() {
        return "gngl";
    }
    
}
