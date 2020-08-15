package com.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="WOOF_SIGN_UP")
public class WoofCustomer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "FULL_NAME",columnDefinition="VARCHAR2(100)")
	private String name;
	
	@Column(name = "USERNAME",columnDefinition="VARCHAR2(100)")
	private String username;
	
	@Column(name = "EMAIL_ID",columnDefinition="VARCHAR2(100)")
	private String email_id;
	
	@Column(name = "PASSWORD",columnDefinition="VARCHAR2(100)")
	private String password;
	
	@Column(name = "MOBILE",columnDefinition="NUMBER(10,0)")
	private Long mobile;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	
	
	

}
