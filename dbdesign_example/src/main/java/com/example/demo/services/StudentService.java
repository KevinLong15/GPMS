package com.example.demo.services;

import java.util.List;

import com.example.demo.models.Student;

public interface StudentService {
	
	// 获取学生列表
	List<Student> getAllStudents();
	
	// 添加学生
	Student addAStudent(int id, String name, String sex, String major, String phone, String address, String email, String password);
	
	// 查询一个学生
	Student findAStudent(int id);
	
	//更新一个学生信息
	Student updateAStudent(String name, String sex, String major, String phone, String address, String email);
	
	//删除一个学生
	void deleteAStudent(int id);
	
	//查找学生和兴趣爱好
	void findStudentAndInterest(int id);
}
