package com.example.demo.services;

import java.util.List;

import com.example.demo.models.Teacher;

public interface TeacherService {
	
	// 获取老师列表
	List<Teacher> getAllTeachers();
	
	// 添加老师
	Teacher addATeacher(int id, String name, String sex, String college, String phone, String address, String email, String password, String title, String workstate);
	
	// 查询一个老师
	Teacher findATeacher(int id);
	
	//更新一个老师信息
	Teacher updateATeacher(String name, String sex, String college, String phone, String address, String email, String title, String workstate);
	
	//删除一个老师
	void deleteATeacher(int id);
	
	//查找老师和论文
	void findTeacherAndThesis(int id);
	
	//查找老师和课题
	void findTeacherAndTopic(int id);
}
