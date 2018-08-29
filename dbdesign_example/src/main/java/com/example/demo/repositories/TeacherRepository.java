package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
	
}
