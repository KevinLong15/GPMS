package com.example.demo.serviceImpls;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Interest;
import com.example.demo.repositories.InterestRepository;
import com.example.demo.services.InterestService;

@Service
public class InterestServiceImpl implements InterestService {
	
	@Autowired
	private InterestRepository interestRepository;
	
	@Override
	public List<Interest> addInterests(int studentId, String interests) {
		// TODO Auto-generated method stub
		List<Interest> result = new ArrayList<Interest>();
		String[] interestArray = interests.split(" ");
		for(String interest:interestArray) {
			Interest item = new Interest();
			item.setStudentId(studentId);
			item.setName(interest);
			item = interestRepository.save(item);
			result.add(item);
		}
		return result;
	}

	@Override
	public List<Interest> findInterestsByStudentId(int studentId) {
		// TODO Auto-generated method stub
		return interestRepository.findByStudentId(studentId);
	}

	@Override
	public String generateInterestNameStr(List<Interest> interestList) {
		// TODO Auto-generated method stub
		String interestStr = "";
		for(Interest item:interestList){
			interestStr += item.getName() + " ";
		}
		interestStr = interestStr.trim();
		return interestStr;
	}

	@Override
	public void deleteInterestsByStudentId(int studentId) {
		// TODO Auto-generated method stub
		interestRepository.deleteByStudentId(studentId);
	}

	@Override
	public List<Interest> updateInterests(int studentId, String interests) {
		// TODO Auto-generated method stub
		deleteInterestsByStudentId(studentId);
		return addInterests(studentId, interests);
	}

}
