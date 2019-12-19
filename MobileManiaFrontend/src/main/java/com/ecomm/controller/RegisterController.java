package com.ecomm.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ecomm.dao.UserDAO;
import com.ecomm.dao.UserDAOImpl;
import com.ecomm.model.UserDetail;

@Controller
public class RegisterController 
{
	@Autowired
	UserDAO userDao;

	String r;
	Scanner scan = new Scanner(System.in);

	@RequestMapping (value = "/Register", method = RequestMethod.GET)
	public ModelAndView getRegisterPage() {
		ModelAndView view = new ModelAndView ();
		view.addObject("user", new UserDetail());
		view.setViewName("Register");
		return view;
	}

	@RequestMapping (value = "/saveregister", method = RequestMethod.POST)
	public ModelAndView saveRegister (@ModelAttribute("user") UserDetail user, BindingResult result)
	{
		ModelAndView view = new ModelAndView();
		if (result.hasErrors())
		{
			view.setViewName("Register");
			return view;
		}
		else
		{
			System.out.println("Enter the Role: ROLE_ADMIN or USER_ROLE");
			r = scan.next();
			user.setRole(r);
			userDao.registerUser(user);
			view.setViewName("redirect:/login");
			return view;
		}
	}
}
