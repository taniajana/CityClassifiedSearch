package com.zensar.repository;


import org.springframework.data.repository.CrudRepository;

import com.zensar.bean.City;

public interface CityRepository extends CrudRepository<City, Integer> {

}
