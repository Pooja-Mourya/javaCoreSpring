package com.spring_mvc_orm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring_mvc_orm.entity.UserEntity;

@Controller
public class Homecontroller {

	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/register")
	public String signup() {
		return "register";
	}

	@RequestMapping(path = "/createUser", method = RequestMethod.POST)
	public void registerUser(@ModelAttribute UserEntity user, Model m) {
		m.addAttribute("msg", "Register Successfully");
		System.out.println(user);
	}

}
