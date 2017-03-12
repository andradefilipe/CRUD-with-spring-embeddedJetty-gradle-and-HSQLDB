package com.andrade.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.andrade.dao.UserDao;
import com.andrade.model.User;

@Controller
public class WelcomeController {

	private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

	@Autowired
	UserDao userDao;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(Model model) {

		logger.debug("andrade");

		//User user = userDao.findByName("mkyong");

		List<User> users = userDao.findAll();

		System.out.println(users);

		model.addAttribute("user", users);

		return "welcome";

	}

}