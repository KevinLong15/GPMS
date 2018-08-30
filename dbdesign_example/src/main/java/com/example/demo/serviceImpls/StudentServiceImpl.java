package com.example.demo.serviceImpls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Student;
import com.example.demo.repositories.ThesisRepository;
import com.example.demo.repositories.TopicRepository;
import com.example.demo.repositories.StudentRepository;
import com.example.demo.services.ThesisService;
import com.example.demo.services.StudentService;
import com.example.demo.services.TopicService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private ThesisRepository thesisRepository;
	@Autowired
	private ThesisService thesisService;
	@Autowired
	private TopicRepository topicRepository;
	@Autowired
	private TopicService topicService;
	
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student addAStudent(int id, String name, String sex, String major, String phone, String address, String email, String password) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setStuId(id);
		student.setStuName(name);
		student.setStuSex(sex);
		student.setStuMajor(major);
		student.setStuPhone(phone);
		student.setStuAddress(address);
		student.setStuEmail(email);
		student.setStuPassword(password);
		student = studentRepository.save(student);
		return student;
	}

	@Override
	public Student findAStudent(int id) {
		// TODO Auto-generated method stub
		Student student =  studentRepository.getOne(id);
		return student;
	}

	@Override
	public Student updateAStudent(String name, String sex, String major, String phone, String address, String email) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setStuName(name);
		student.setStuSex(sex);
		student.setStuMajor(major);
		student.setStuPhone(phone);
		student.setStuAddress(address);
		student.setStuEmail(email);
		return studentRepository.save(student);
	}

	@Override
	public void deleteAStudent(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
//		thesisService.deleteThesisByStudentId(id);
	}

	//////关系查询
	@Override
	public void findStudentAndThesis(int id) {
		// TODO Auto-generated method stub
		List<Object> items = thesisRepository.findStudentAndThesis(id);
		System.out.println("pause");
	}
	
	//////关系查询
	@Override
	public void findStudentAndTopic(int id) {
		// TODO Auto-generated method stub
		List<Object> items = topicRepository.findStudentAndTopic(id);
		System.out.println("pause");
	}
	
	

}
