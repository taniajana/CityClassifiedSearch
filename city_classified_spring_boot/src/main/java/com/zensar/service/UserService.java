package com.zensar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.bean.City;
import com.zensar.repository.CityRepository;

@Service
public class UserService {
	
	@Autowired
	CityRepository cityRepository;
	
	@Autowired
	City city;
	
	
	public  City addCity(City city) {
		
		City city1=cityRepository.save(city);
		
		return city1;
		
	}

}
