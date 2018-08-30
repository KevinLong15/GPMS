package com.example.demo.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Thesis {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private int studentId;
	
	private int teacherId;		//can be deleted?
	
	@Column(nullable = false)
	private int topicId;
	
	@Column(nullable = false)
	private Date uploadTime;
	
	@Column(nullable = true)
	private int grade;
	
	private String suggest;
	
	private String checkState;
	
	private Date appraiseTime;
	
	@Column(nullable = false)
	private int isAppraised;
	

	public int getId() {
		return id;
	}

	public Thesis() {
		super();
	}


	public void setId(int id) {
		this.id = id;
	}

	public int getStudentId() {
		return studentId;
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
	
	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	
	public Date getUploadTime() {
		return uploadTime;
	}

	public void setUploadTime(Date uploadtime) {
		this.uploadTime = uploadtime;
	}
	
	public int getGrade() {
		return grade;
	}

	public void setGrade(int  grade) {
		this.grade = grade;
	}

	public String getSuggest() {
		return suggest;
	}

	public void setSuggest(String suggest) {
		this.suggest = suggest;
	}
	
	public String getCheckState() {
		return checkState;
	}

	public void setCheckState(String checkState) {
		this.checkState = checkState;
	}
	
	public Date getAppraiseTime() {
		return appraiseTime;
	}

	public void setAppraiseTime(Date appraiseTime) {
		this.appraiseTime = appraiseTime;
	}
	
	public int getIsAppraised() {
		return isAppraised;
	}

	public void setIsAppraised(int  isAppraised) {
		this.isAppraised = isAppraised;
	}

}
