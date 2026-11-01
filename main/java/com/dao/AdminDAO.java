package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.SelectionQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entity.Admin;

import jakarta.transaction.Transactional;

@Component
public class AdminDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public String login(Admin admin) {
		
		Session session = sessionFactory.getCurrentSession();
		
		return null;
		
	}
	
	@Transactional
	public String signup(Admin admin) {
		
		Session session = sessionFactory.getCurrentSession();
		
		session.persist(admin);
		return admin.getUserName();
	}
	
	@Transactional
	public Admin findAdminByUsingName(String userName) {
		
		Session session = sessionFactory.getCurrentSession();
		
		SelectionQuery<Admin> query = session.createSelectionQuery("FROM Admin where userName=?1",Admin.class);
		query.setParameter(1,userName);
		
		Admin admin = query.uniqueResult();
		
		return admin;
		
	}

}
