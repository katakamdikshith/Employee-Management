package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Admins")
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adminId;
	
	@Column(name = "user_name",unique = true)
	private String userName;
	
	@Column(nullable = false)
	private String password;
	
	public Admin() {
		
	}

	public Admin(int adminId, String userName, String password) {
		super();
		this.adminId = adminId;
		this.userName = userName;
		this.password = password;
	}

	public Admin(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
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
		return "Admin [adminId=" + adminId + ", userName=" + userName + ", password=" + password + "]";
	}

	
}
