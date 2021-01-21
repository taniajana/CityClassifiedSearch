package com.zensar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.bean.AdminLogin;
import com.zensar.bean.BusinessListing;
import com.zensar.bean.CategoryMaster;
import com.zensar.bean.City;
import com.zensar.repository.AdminLoginRepository;
import com.zensar.repository.BusinessListingRepository;
import com.zensar.repository.CategoryMasterRepository;
import com.zensar.repository.CityRepository;

@Service
public class AdminService {

	@Autowired
	CityRepository cityRepository;
	@Autowired
	AdminLoginRepository adminLoginRepository;
	@Autowired
	BusinessListingRepository businessListingRepository;
	@Autowired
	CategoryMasterRepository categoryMasterRepository;

	
	
	
	
	public AdminLogin findbyId(String userName)
	{
		AdminLogin adminLogin1=adminLoginRepository.findById(userName).orElse(null);
		return adminLogin1;
	}
	

	public City addCity(City city) {

		City city1 = cityRepository.save(city);

		return city1;

	}

	public CategoryMaster addCategoryMaster(CategoryMaster categoryMaster) {

		CategoryMaster categoryMaster1 = categoryMasterRepository.save(categoryMaster);

		return categoryMaster1;
	}
	
	
	public BusinessListing addBusinessListing(BusinessListing businessListing) {

		BusinessListing businessListing1 = businessListingRepository.save(businessListing);

		return businessListing1;
	}
	
	 
	public List<City> findAll(){
		
	return (List<City>) cityRepository.findAll();
	
	}
	
	
}

