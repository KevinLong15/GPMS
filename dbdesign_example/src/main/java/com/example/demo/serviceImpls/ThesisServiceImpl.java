package com.example.demo.serviceImpls;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Thesis;
import com.example.demo.models.Topic;
import com.example.demo.repositories.ThesisRepository;
import com.example.demo.services.ThesisService;

@Service
public class ThesisServiceImpl implements ThesisService {
	
	@Autowired
	private ThesisRepository thesisRepository;
	
	@Override
	public Thesis uploadThesis(int studentId, Date uploadTime) {
		Thesis thesis = new Thesis();
		thesis.setStudentId(studentId);
		thesis.setUploadTime(uploadTime);
		return thesis;
	}

	@Override
	public Thesis appraiseThesis(int thesisId, int teacherId, String suggest, int grade, String checkState) {
		Thesis thesis = thesisRepository.getOne(thesisId);
		thesis.setIsAppraised(1);
		thesis.setTeacherId(teacherId);
		thesis.setSuggest(suggest);
		thesis.setGrade(grade);
		thesis.setCheckState(checkState);
		return thesis;
	}

	@Override
	//查询教师已经评阅过的论文
	public List<Thesis> findThesisByTeacherId(int teacherId) {
		return thesisRepository.findByTeacherIdAndIsAppraised(teacherId,1);
	}
	
	@Override
	public List<Thesis> findThesisByStudentId(int studentId) {
		return thesisRepository.findByStudentId(studentId);
	}
	
	@Override
	public List<Thesis> findThesisByTopicId(int topicId) {
		return thesisRepository.findByTopicId(topicId);
	}

}
