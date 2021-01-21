package com.zensar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zensar.bean.BusinessListing;
@Repository
public interface BusinessListingRepository extends CrudRepository<BusinessListing, Integer> {

}
