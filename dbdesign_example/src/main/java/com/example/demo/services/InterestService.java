package com.example.demo.services;

import java.util.List;

import javax.transaction.Transactional;

import com.example.demo.models.Interest;

public interface InterestService {
	
	// 添加兴趣爱好
	List<Interest> addInterests(int studentId, String interests);
	
	// 查询兴趣爱好
	List<Interest> findInterestsByStudentId(int studentId);
	
	// 将interest对象list中name转换为空格split的字符串
	String generateInterestNameStr(List<Interest> interestList);
	
	// 删除Interests表中的数据
	void deleteInterestsByStudentId(int studentId);
	
	// 更新interests
	@Transactional
	List<Interest> updateInterests(int studentId, String interests);

}
