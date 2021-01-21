package com.zensar.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.zensar.bean.AdminLogin;
import com.zensar.bean.BusinessListing;
import com.zensar.bean.CategoryMaster;
import com.zensar.bean.City;
import com.zensar.repository.CityRepository;
import com.zensar.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	City city;
	@Autowired
	AdminLogin adminLogin;
	@Autowired
	BusinessListing businessListing;
	@Autowired
	CategoryMaster categoryMaster;

	@Autowired
	AdminService adminService;

	@RequestMapping("/login")
	public ModelAndView checkLogin(@RequestParam("userName") String userName,
			@RequestParam("password") String password) {
		System.out.println("I am inside checkLogin() method...");
		System.out.println("username:" + userName);
		System.out.println("password:" + password);
		adminLogin.setUserName(userName);
		adminLogin.setPassword(password);
		System.out.println(adminLogin);
		// connect to db and check the validity of credentials
		AdminLogin adminLogin1 = adminService.findbyId(userName);
		ModelAndView modelAndView;
		if (adminLogin != null && adminLogin.getPassword().equals(password)) {
			// forward to success.jsp
			modelAndView = new ModelAndView("login.jsp");
		} else {
			// forward back to index.jsp page with the error message
			modelAndView = new ModelAndView("index.jsp");
			modelAndView.addObject("errorMessage", "Invalid Login or Password credentials Please try again!!");
		}
		return modelAndView;
	}

	@RequestMapping("/addCity")
	public ModelAndView addCity(City city) {
		System.out.println("I add()");
		adminService.addCity(city);
		ModelAndView modelAndView = new ModelAndView("index.jsp");
		return modelAndView;

	}

	@RequestMapping("/addBusinessListing")
	public ModelAndView addBusinessListing(BusinessListing businessListing) {
		System.out.println("I add()");
		adminService.addBusinessListing(businessListing);
		ModelAndView modelAndView = new ModelAndView("index.jsp");
		return modelAndView;

	}

	@RequestMapping("/addCategoryMaster")
	public ModelAndView addCategoryMaster(CategoryMaster categoryMaster) {
		System.out.println("I add()");
		adminService.addCategoryMaster(categoryMaster);
		ModelAndView modelAndView = new ModelAndView("index.jsp");
		return modelAndView;

	}

	@RequestMapping("/viewAllCites")
	public ModelAndView getAllCities() {
		System.out.println("hello");
		List<City> city1 = new ArrayList<City>();
		city1 = (List<City>) adminService.findAll();
		ModelAndView modelAndView = new ModelAndView("viewAllCities.jsp");
		modelAndView.addObject("employeeInfo", city);
		return modelAndView;

	}
}