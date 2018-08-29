package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int stuId;
	
	private String stuPassword;
	
	private String stuName;
	
	private String stuSex;
	
	private String stuMajor;
	
	private String stuEmail;
	
	private String stuAddress;
	
	private String stuPhone;

	public Student() {
		super();
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int id) {
		this.stuId = id;
	}
	
	public String getStuPassword() {
		return stuPassword;
	}

	public void setStuPassword(String password) {
		this.stuPassword = password;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String name) {
		this.stuName = name;
	}

	public String getStuSex() {
		return stuSex;
	}

	public void setStuSex(String sex) {
		this.stuSex = sex;
	}

	public String getStuMajor() {
		return stuMajor;
	}

	public void setStuMajor(String major) {
		this.stuMajor = major;
	}
	
	public String getStuEmail() {
		return stuEmail;
	}

	public void setStuEmail(String email) {
		this.stuEmail = email;
	}
	
	public String getStuAddress() {
		return stuAddress;
	}

	public void setStuAddress(String address) {
		this.stuAddress = address;
	}
	
	public String getStuPhone() {
		return stuPhone;
	}

	public void setStuPhone(String phone) {
		this.stuPhone = phone;
	}
	
}
