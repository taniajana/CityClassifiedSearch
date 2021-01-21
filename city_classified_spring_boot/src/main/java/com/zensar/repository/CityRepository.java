package com.zensar.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zensar.bean.City;
@Repository
public interface CityRepository extends CrudRepository<City, Integer> {

}
