package com.kj.top20hub.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kj.top20hub.bo.UserBO;
import com.kj.top20hub.dto.User;


@Controller
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserBO userService;

	@RequestMapping("/list")
	public String listUsers(Model theModel)
	{
		
		List<User> users = userService.getAllUsers();
		
		theModel.addAttribute("users",users);
		
		return "users_details";
	}
	
	
	
}
