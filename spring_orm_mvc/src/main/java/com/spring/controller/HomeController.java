package com.spring.controller;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import com.spring.entity.UserEntity;
import com.spring.service.UserService;
import com.spring.service.UserServiceImpl;

import org.springframework.ui.Model;

@Controller
public class HomeController {

	/**
	 * @return
	 */
	@Autowired

	public UserServiceImpl userServiceI;

	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@ExceptionHandler(Exception.class)
	public String allException() {
		return "error";
	}
	@RequestMapping("/register")
	public String signup() {
		return "register";
	}

	@RequestMapping(path = "/createUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute UserEntity user, Model m) {
//		m.addAttribute("msg", "Register Successfully");
//		m.addAttribute(user);
		userServiceI.saveMyUser(user);
		System.out.println("create;User" + user);
		return "success";
	}

	@RequestMapping(path = "/google")
	public String googlePass() {
		return "redirect:https://www.google.co.in/";
	}

	@RequestMapping(path = "/yahoo")
	public RedirectView yahooPass() {
		RedirectView rd = new RedirectView();
		rd.setUrl("https://www.google.co.in/");

		return rd;
	}

	@RequestMapping(path = "/searchUrl", method = RequestMethod.POST)
	public String search(@RequestParam("keyword") String keyword) {
		String url = "https://www.google.com/search?q=" + keyword;
		System.out.println(url);
		return "redirect:" + url;
	}

	@RequestMapping(path = "/user/{id}/{name}")
	public String demo(@PathVariable("id") int id, @PathVariable("name") String name) {
		System.out.print(id);
		System.out.print(name);
		return "register";
	}

	@RequestMapping("/load_image")
	public String loaduploadImage() {
		return "file_upload";
	}

	@RequestMapping(path = "/uploadImage", method = RequestMethod.POST)
	public String uploadImage(@RequestParam("img") CommonsMultipartFile file, Model m, HttpServletRequest req) {
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getName());

		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getContentType());
		System.out.println(file.getSize());
		
		byte[] bytes = file.getBytes();

		String path = req.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources"
				+ File.separator + "img" + File.separator + file.getOriginalFilename();

		System.out.println(path);
		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(bytes);
			fos.close();
			System.out.println("File Uploaded");
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("imgname", file.getOriginalFilename());
		return "success";
	}

}