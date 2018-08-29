package com.example.demo.serviceImpls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Teacher;
import com.example.demo.repositories.InterestRepository;
import com.example.demo.repositories.TeacherRepository;
import com.example.demo.services.InterestService;
import com.example.demo.services.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {
	
	@Autowired
	private TeacherRepository teacherRepository;
	@Autowired
	private InterestRepository interestRepository;
	@Autowired
	private InterestService interestService;
	
	@Override
	public List<Teacher> getAllTeachers() {
		// TODO Auto-generated method stub
		return teacherRepository.findAll();
	}

	@Override
	public Teacher addATeacher(int id, String name, String sex, String college, String phone, String address, String email, String password, String title, String workstate) {
		// TODO Auto-generated method stub
		Teacher teacher = new Teacher();
		teacher.setTeaId(id);
		teacher.setTeaName(name);
		teacher.setTeaSex(sex);
		teacher.setTeaCollege(college);
		teacher.setTeaPhone(phone);
		teacher.setTeaAddress(address);
		teacher.setTeaEmail(email);
		teacher.setTeaPassword(password);
		teacher.setTeaTitle(title);
		teacher.setTeaWorkState(workstate);
		teacher = teacherRepository.save(teacher);
		return teacher;
	}

	@Override
	public Teacher findATeacher(int id) {
		// TODO Auto-generated method stub
		Teacher teacher =  teacherRepository.getOne(id);
		return teacher;
	}

	@Override
	public Teacher updateATeacher(String name, String sex, String college, String phone, String address, String email, String title, String workstate) {
		// TODO Auto-generated method stub
		Teacher teacher = new Teacher();
		teacher.setTeaName(name);
		teacher.setTeaSex(sex);
		teacher.setTeaCollege(college);
		teacher.setTeaPhone(phone);
		teacher.setTeaAddress(address);
		teacher.setTeaEmail(email);
		teacher.setTeaTitle(title);
		teacher.setTeaWorkState(workstate);
		teacher = teacherRepository.save(teacher);
		return teacherRepository.save(teacher);
	}

	@Override
	public void deleteATeacher(int id) {
		// TODO Auto-generated method stub
		teacherRepository.deleteById(id);
//		interestService.deleteInterestsByTeacherId(id);
	}

	//////关系查询
	@Override
	public void findTeacherAndInterest(int id) {
		// TODO Auto-generated method stub
//		List<Object> items = interestRepository.findTeacherAndInterests(id);
		System.out.println("pause");
	}
	
	

}
