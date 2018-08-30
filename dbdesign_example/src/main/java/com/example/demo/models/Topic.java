package com.example.demo.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Topic {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String introduction;
	
	@Column(nullable = true)
	private int studentId;
	
	@Column(nullable = false)
	private int teacherId;
	
	@Column(nullable = false)
	private Date releaseTime;
	
	@Column(nullable = true)
	private Date chosenTime;
	
	@Column(nullable = false)
	private int isChosen;


	public int getId() {
		return id;
	}

	public Topic() {
		super();
	}


	public void setId(int id) {
		this.id = id;
	}

	public int getStudentId() {
		return studentId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	
	public Date getReleaseTime() {
		return releaseTime;
	}

	public void setReleaseTime(Date  releasetime) {
		this.releaseTime = releasetime;
	}
	
	public Date getChosenTime() {
		return chosenTime;
	}

	public void setChosenTime(Date chosentime) {
		this.chosenTime = chosentime;
	}
	
	public int getIsChosen() {
		return isChosen;
	}

	public void setIsChosen(int ischosen) {
		this.isChosen = ischosen;
	}

}
