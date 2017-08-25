package com.kj.top20hub.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kj.top20hub.bo.UserBO;
import com.kj.top20hub.dao.ContactUsDAO;
import com.kj.top20hub.dto.ContactUs;
import com.kj.top20hub.dto.User;


@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserBO userService;
	
	@Autowired
	private ContactUsDAO contactUsService;
	
	
	@GetMapping(value="/")
	public List<User> listUsers()
	{
		List<User> users = userService.getAllUsers();
		return users;
	}
	
	@GetMapping(value="/{id}")
	public User getUser(@PathVariable int id)
	{
		User user = userService.getUser(id);
		return user;
		
	}
	
	@PostMapping(value="/createUser")
	public int creatUser(@RequestBody User user)
	{
		int result = userService.createUser(user);
		return result;
	}
	
	@PutMapping(value="/updateUser")
	public void updateUser(@RequestBody User user)
	{
		int id = user.getUser_id();
		userService.updateUser(user);
		
	}
	
	@DeleteMapping(value="/deleteUser/{id}")
	public void deleteUser(@PathVariable int id)
	{
		userService.deleteUser(id);
	}
	
	
	
	
	@RequestMapping("/contactUs")
	public String contactUs(Model theModel)
	{
		
		ContactUs contactUs = new ContactUs();
		theModel.addAttribute("contactUs", contactUs);
		
		return "contact_page";
	}
	
	@PostMapping(value="/saveContactUs")
	public String SaveContactUsMsg(@ModelAttribute("contactUs") ContactUs contactUs)
	{
		
		contactUsService.create(contactUs);
		
		return "redirect:/users/contactus/messages";
	}
	
	@RequestMapping(value="/contactUsMessages")
	public String contactUsMessages()
	{
		
		return "contactUsMessages";
	}
	
	@GetMapping(value="/contactus/messages")
	public List<ContactUs> contactUsMsg()
	{
		List<ContactUs> contactUs = contactUsService.getAllMessages();
		return contactUs;
		
	}

	
	
}
