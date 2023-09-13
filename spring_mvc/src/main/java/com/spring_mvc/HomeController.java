package com.spring_mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring_mvc.entity.RegisterEntity;



@Controller
public class HomeController {

	@RequestMapping("home")
	public String home(Model m) {
		m.addAttribute("name", "Pooja Mourya");
		m.addAttribute("roll", 123456);
		List<String> list = new ArrayList<String>();
		
		list.add("P");
		list.add("O");
		list.add("O");
		list.add("J");
		list.add("A");
		
		m.addAttribute("listName",list);
		return "home" ;
	}
 
	@RequestMapping("/login")
	public ModelAndView login() {
		
		ModelAndView model = new ModelAndView();
		model.addObject("name" , "model name");
		
		List<String> list = new ArrayList<String>();
		list.add("name");
		list.add("className");
		model.addObject("list",list);
		model.setViewName("login");
		return model;
	}
	
	@RequestMapping("/signup")
	public String signUp() {
		return "register";
	}
	
	@RequestMapping(path = "/createUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute RegisterEntity registerEntity, @RequestParam("img") String img) {
		System.out.println("requestParam name" + img);
		System.out.println("user register success " + registerEntity);
		return "register";
	}

}
