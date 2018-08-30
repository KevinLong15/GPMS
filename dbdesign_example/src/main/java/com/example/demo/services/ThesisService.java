package com.example.demo.services;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import com.example.demo.models.Thesis;

public interface ThesisService {
	
	// 上传论文
	Thesis uploadThesis(int studentId, Date uploadTime);
	
	//评阅论文
	Thesis appraiseThesis(int thesisId, int teacherId, String suggest, int grade, String checkState);
	
	// 查询论文
	List<Thesis> findThesisByStudentId(int studentId);
	List<Thesis> findThesisByTeacherId(int teacherId);
	List<Thesis> findThesisByTopicId(int topicId);
	
}
