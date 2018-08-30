package com.example.demo.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.models.Topic;

public interface TopicRepository extends JpaRepository<Topic, Integer>{
	
	// 通过teacher_id属性查找所有的topic对象
	public List<Topic> findByTeacherId(int teacherId);
	
	// 通过student_id属性查找所有的topic对象
	public List<Topic> findByStudentId(int studentId);	
	
	// 查询所有学生和对应的topic name
	@Query("select stu.stuId, stu.name, inter.studentId from Student stu right join Topic inter on stu.id = inter.studentId where stu.id=?1")
	public List<Object> findStudentAndTopic(int studentId);
	
	// 查询所有老师和对应的topic name
	@Query("select tea.teaId, tea.name, inter.teacherId from Teacher tea right join Topic inter on tea.id = inter.teacherId where tea.id=?1")
	public List<Object> findTeacherAndTopic(int teacherId);

	
}
