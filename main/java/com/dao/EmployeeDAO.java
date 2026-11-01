package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.SelectionQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entity.Employee;

import jakarta.transaction.Transactional;

@Component
public class EmployeeDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public String saveEmployee(Employee employee) {
		Session session = sessionFactory.getCurrentSession();
		
		session.persist(employee);
		return employee.getEmployeeName();
	}
	
	@Transactional
	public List<Employee> getAllEmployees(){
		Session session = sessionFactory.getCurrentSession();
		
		SelectionQuery<Employee> query = session.createSelectionQuery("FROM Employee" , Employee.class);
		List<Employee> list = query.list();
		
		return list;
	}
	
	@Transactional
	public void deleteEmployee(Employee emp) {
		Session session = sessionFactory.getCurrentSession();
		
		session.remove(emp);
	}
	
	@Transactional
	public Employee findEmployeeById(int id) {
		Session session = sessionFactory.getCurrentSession();
		
		Employee employee = session.find(Employee.class, id);
		return employee;
	}
	
	@Transactional
	public void updateEmployee(Employee emp) {
		Session session = sessionFactory.getCurrentSession();
		
		session.merge(emp);
	}

}
