package com.zensar.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zensar.bean.AdminLogin;
@Repository
public interface AdminLoginRepository  extends CrudRepository<AdminLogin,String>{

}
