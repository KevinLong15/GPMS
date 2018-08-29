package com.example.demo.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.models.Interest;

public interface InterestRepository extends JpaRepository<Interest, Integer>{
	
	// 通过student_id属性查找所有的interest对象
	public List<Interest> findByStudentId(int studentId);
	
	// 通过student_id删除所有的interest对象
	@Modifying
	@Transactional
	@Query("delete from Interest as inter where inter.studentId = ?1")
	public void deleteByStudentId(int studentId);
	
	
	// 查询所有学生和对应的interest name
	@Query("select stu.id, stu.name, stu.sex, stu.studentNum, inter.studentId from Student stu right join Interest inter on stu.id = inter.studentId where stu.id=?1")
	public List<Object> findStudentAndInterests(int studentId);
}
