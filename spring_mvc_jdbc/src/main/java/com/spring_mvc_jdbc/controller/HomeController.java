package com.spring_mvc_jdbc.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring_mvc_jdbc.entity.UserEntity;
import com.spring_mvc_jdbc.service.UserService;
import com.spring_mvc_jdbc.service.UserSrviceImpl;


@Controller
public class HomeController {

	@Autowired
	private UserSrviceImpl userSrviceImpl ;
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/register")
	public String signup() {
		return "register";
	}

	@RequestMapping(path = "/createUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute UserEntity user, Model m) {
		m.addAttribute("msg",  "Register Successfully");
    userSrviceImpl.registerUser(user);
		return "redirect:/register";
	}

}