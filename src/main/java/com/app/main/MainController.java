package com.app.main;

import java.security.Principal;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.models.WoofCustomer;
import com.app.service.WoofService;

@Controller
public class MainController {

	@Inject
	WoofService woofService;
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String homePage()
	{
		return "home";
	}
	
	@RequestMapping(value="/success", method = RequestMethod.GET)
	public String loginPage(Principal author,ModelMap model)
	{
		if(author != null )
		{
			model.addAttribute("author",author.getName());
		}
		return "homeLoggedIn";
	}
	
	@RequestMapping(value="/fail2login", method = RequestMethod.GET)
	public String loginFailPage()
	{
		return "home";
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutPage()
	{
		return "home";
	}
	
	@RequestMapping(value="/signUp", method = RequestMethod.GET)
	public String signUpPage()
	{
		return "signUp";
	}
	
	@RequestMapping(value="/signUpSave", method = RequestMethod.GET)
	public String save(@ModelAttribute("command") WoofCustomer customer ,ModelMap model)
	{
		System.out.println("Customer"+customer.getEmail_id());
		woofService.addNewUser(customer);
		return "home";
		
	}
	

}
