package com.ProEstimates.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ProEstimates.models.User;

@Controller
@RequestMapping({"/","/users"})
public class UsersController {
	@GetMapping()
	public String getAllUsers (Model model) {
		List<User> users = new ArrayList<User>();
		model.addAttribute("users", users);
		return "users";
	}
}
