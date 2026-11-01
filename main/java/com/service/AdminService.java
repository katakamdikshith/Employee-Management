package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.AdminDAO;
import com.entity.Admin;

@Component
public class AdminService {
	
	@Autowired
	AdminDAO adminDAO;
	
	public Admin loginAdmin(String userName,String password) {
		
		Admin admin = adminDAO.findAdminByUsingName(userName);
		
		
		if(admin!=null && admin.getPassword().equals(password)) {
			return admin;
		}else {
			return null;
		}
		
	}
	
	public String signupAdmin(String userName, String password) {
		
		Admin admin = new Admin(userName, password);
		
		return adminDAO.signup(admin);
		
	}

}
