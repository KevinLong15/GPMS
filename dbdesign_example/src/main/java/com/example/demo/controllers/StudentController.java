package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.models.Interest;
import com.example.demo.models.Student;
import com.example.demo.services.InterestService;
import com.example.demo.services.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	@Autowired
//	private InterestService interestService;
	
	/**
	 * get all the students
	 * @return the list of students
	 */
	@GetMapping(value="/list")
	public ModelAndView getAllStudents() {
		ModelAndView mv = new ModelAndView();
        mv.addObject("students", studentService.getAllStudents());
        mv.setViewName("/students/list");
        return mv;
	}
	
	/**
	 * jump to the add.html page
	 * @return
	 */
	@GetMapping(value="/add")
	public ModelAndView addAStudent() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/students/add");
		return mv;
	}
	
	/**
	 * add a student info
	 * @param name
	 * @param sex
	 * @param studentNum
	 */
	@PostMapping(value="/add")
	public ModelAndView addAStudent(int id, String name, String sex, String major, String phone, String address, 
									String email, String password) {
		Student student = studentService.addAStudent(id, name, sex, major, phone, address, email, password);
//		List<Interest> interestList = interestService.addInterests(student.getId(), interests);
//		String interestStr = interestService.generateInterestNameStr(interestList);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("student", student);
//		mv.addObject("interests", interestStr);
        mv.setViewName("/students/detail");
		return mv;
	}
	
	/**
	 * find a student by id
	 * @param id
	 * @return
	 */
	@GetMapping(value="/detail")
	public ModelAndView findAStudent(@RequestParam("id") Integer id) {
//		studentService.findStudentAndInterest(id);
		Student student = studentService.findAStudent(id);
//		List<Interest> interestList = interestService.findInterestsByStudentId(student.getStuId());
//		String interestStr = interestService.generateInterestNameStr(interestList);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("student", student);
//		mv.addObject("interests", interestStr);
        mv.setViewName("/students/detail");
		return mv;
	}
	
	/**
	 * jump to update.html page
	 * @param id
	 * @return
	 */
	@GetMapping(value="/detail/update")
	public ModelAndView updateAStudent(@RequestParam("id") int id) {
		Student student = studentService.findAStudent(id);
//		List<Interest> interestList = interestService.findInterestsByStudentId(id);
//		String interestStr = interestService.generateInterestNameStr(interestList);
		ModelAndView mv = new ModelAndView();
		mv.addObject("student", student);
//		mv.addObject("interests", interestStr);
        mv.setViewName("/students/update");
		return mv;
	}
	
	
	/**
	 * update the information of a student
	 * @param id
	 * @param name
	 * @param sex
	 * @param studentNum
	 * @return
	 */
	@PostMapping(value="/detail/update")
	public ModelAndView updateAStudent(String name, String sex, String major, String phone, String address, String email) {
		Student student = studentService.updateAStudent(name, sex, major, phone, address, email);
//		List<Interest> interestList = interestService.updateInterests(id, interests);
//		String interestStr = interestService.generateInterestNameStr(interestList);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("student", student);
//		mv.addObject("interests", interestStr);
        mv.setViewName("/students/detail");
		return mv;
	}
	
	@GetMapping(value="/delete")
	public ModelAndView deleteAStudent(@RequestParam("id") int id) {
		studentService.deleteAStudent(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("students", studentService.getAllStudents());
		mv.setViewName("/students/list");
		return mv;
	}
}
