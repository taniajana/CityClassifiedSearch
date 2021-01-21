package com.zensar.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zensar.bean.CategoryMaster;
@Repository
public interface CategoryMasterRepository extends CrudRepository<CategoryMaster, Integer> {

}
