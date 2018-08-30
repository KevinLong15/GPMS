package com.example.demo.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.models.Thesis;

public interface ThesisRepository extends JpaRepository<Thesis, Integer>{
	
	// 通过student_id属性查找所有的thesis对象
	public List<Thesis> findByStudentId(int studentId);
	
	// 通过teacher_id属性查找所有的thesis对象
	public List<Thesis> findByTeacherIdAndIsAppraised(int teacherId, int flag);
	
	// 通过topic_id属性查找所有的thesis对象
	public List<Thesis> findByTopicId(int topicId);
	
	// 查询所有学生和对应的thesis name
	@Query("select stu.stuId, stu.name, stu.sex, inter.studentId from Student stu right join Thesis inter on stu.id = inter.studentId where stu.id=?1")
	public List<Object> findStudentAndThesis(int studentId);
	
	// 查询所有老师和对应的thesis name
	@Query("select tea.teaId, tea.name, tea.sex, inter.teacherId from Teacher tea right join Thesis inter on tea.id = inter.teacherId where tea.id=?1")
	public List<Object> findTeacherAndThesis(int teacherId);

	

	
}
