package com.kj.top20hub.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kj.top20hub.bo.ContactUsBO;
import com.kj.top20hub.bo.UserBO;
import com.kj.top20hub.dao.ContactUsDAO;
import com.kj.top20hub.dto.ContactUs;
import com.kj.top20hub.dto.User;


@Controller
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserBO userService;
	
	@Autowired
	private ContactUsDAO contactUsService;
	
	
	@RequestMapping("/list")
	public String listUsers(Model theModel)
	{
		
		List<User> users = userService.getAllUsers();
		
		theModel.addAttribute("users",users);
		
		return "users_details";
	}
	
	@RequestMapping("/contactUs")
	public String contactUs(Model theModel)
	{
		
		ContactUs contactUs = new ContactUs();
		theModel.addAttribute("contactUs", contactUs);
		
		return "contact_page";
	}
	
	@PostMapping("/saveContactUs")
	public String SaveContactUsMsg(@ModelAttribute("contactUs") ContactUs contactUs)
	{
		
		contactUsService.create(contactUs);
		
		return "redirect:/users/contactus/messages";
	}
	
	@RequestMapping("/contactUsMessages")
	public String contactUsMessages()
	{
		
		return "contactUsMessages";
	}
	
	@RequestMapping("/contactus/messages")
	public String contactUsMsg(Model theModel)
	{
		
		List<ContactUs> contactUs = contactUsService.getAllMessages();
		theModel.addAttribute("Messages", contactUs);
		return "messages";
		
	}

	
	
}
