package com.zensar.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class AdminLogin {
	@Id
	@Column(name="user_name")
	private String userName;
	@Column(name="password")
	private String password;
	
	public AdminLogin(String userName, String password)
	{
		super();
		this.userName=userName;
		this.password=password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AdminLogin [userName=" + userName + ", password=" + password + "]";
	}
	
	

}
