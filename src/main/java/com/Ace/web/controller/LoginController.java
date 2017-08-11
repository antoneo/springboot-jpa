package com.Ace.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {
	
	@RequestMapping(value={"/","/login","/login.jsp"})
    public String login() {
        return "login";
    }
	
    
}
