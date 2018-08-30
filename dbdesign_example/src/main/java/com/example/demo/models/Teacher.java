package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teacher {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int teaId;
	
	@Column(nullable = false)
	private String teaPassword;
	
	@Column(nullable = false)
	private String teaName;
	
	private String teaSex;
	
	@Column(nullable = false)
	private String teaCollege;
	
	@Column(nullable = false)
	private String teaEmail;
	
	private String teaAddress;
	
	private String teaPhone;
	
	private String teaTitle;
	
	private String teaWorkState;

	public Teacher() {
		super();
	}

	public int getTeaId() {
		return teaId;
	}

	public void setTeaId(int id) {
		this.teaId = id;
	}
	
	public String getTeaPassword() {
		return teaPassword;
	}

	public void setTeaPassword(String password) {
		this.teaPassword = password;
	}

	public String getTeaName() {
		return teaName;
	}

	public void setTeaName(String name) {
		this.teaName = name;
	}

	public String getTeaSex() {
		return teaSex;
	}

	public void setTeaSex(String sex) {
		this.teaSex = sex;
	}

	public String getTeaCollege() {
		return teaCollege;
	}

	public void setTeaCollege(String college) {
		this.teaCollege = college;
	}
	
	public String getTeaEmail() {
		return teaEmail;
	}

	public void setTeaEmail(String email) {
		this.teaEmail = email;
	}
	
	public String getTeaAddress() {
		return teaAddress;
	}

	public void setTeaAddress(String address) {
		this.teaAddress = address;
	}
	
	public String getTeaPhone() {
		return teaPhone;
	}

	public void setTeaPhone(String phone) {
		this.teaPhone = phone;
	}
	
	public String getTeaTitle() {
		return teaTitle;
	}

	public void setTeaTitle(String title) {
		this.teaTitle = title;
	}
	
	public String getTeaWorkState() {
		return teaWorkState;
	}

	public void setTeaWorkState(String worktitle) {
		this.teaWorkState = worktitle;
	}
	
}
