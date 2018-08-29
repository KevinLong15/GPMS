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
import com.example.demo.models.Teacher;
import com.example.demo.services.InterestService;
import com.example.demo.services.TeacherService;

@Controller
@RequestMapping("/teachers")
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;
	@Autowired
//	private InterestService interestService;
	
	/**
	 * get all the teachers
	 * @return the list of teachers
	 */
	@GetMapping(value="/list")
	public ModelAndView getAllTeachers() {
		ModelAndView mv = new ModelAndView();
        mv.addObject("teachers", teacherService.getAllTeachers());
        mv.setViewName("/teachers/list");
        return mv;
	}
	
	/**
	 * jump to the add.html page
	 * @return
	 */
	@GetMapping(value="/add")
	public ModelAndView addATeacher() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/teachers/add");
		return mv;
	}
	
	/**
	 * add a teacher info
	 * @param name
	 * @param sex
	 * @param teacherNum
	 */
	@PostMapping(value="/add")
	public ModelAndView addATeacher(int id, String name, String sex, String college, String phone, String address, String email, 
			String password, String title, String workstate) {
		Teacher teacher = teacherService.addATeacher(id, name, sex, college, phone, address, email, password, title, workstate);
//		List<Interest> interestList = interestService.addInterests(teacher.getId(), interests);
//		String interestStr = interestService.generateInterestNameStr(interestList);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("teacher", teacher);
//		mv.addObject("interests", interestStr);
        mv.setViewName("/teachers/detail");
		return mv;
	}
	
	/**
	 * find a teacher by id
	 * @param id
	 * @return
	 */
	@GetMapping(value="/detail")
	public ModelAndView findATeacher(@RequestParam("id") Integer id) {
//		teacherService.findTeacherAndInterest(id);
		Teacher teacher = teacherService.findATeacher(id);
//		List<Interest> interestList = interestService.findInterestsByTeacherId(teacher.getStuId());
//		String interestStr = interestService.generateInterestNameStr(interestList);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("teacher", teacher);
//		mv.addObject("interests", interestStr);
        mv.setViewName("/teachers/detail");
		return mv;
	}
	
	/**
	 * jump to update.html page
	 * @param id
	 * @return
	 */
	@GetMapping(value="/detail/update")
	public ModelAndView updateATeacher(@RequestParam("id") int id) {
		Teacher teacher = teacherService.findATeacher(id);
//		List<Interest> interestList = interestService.findInterestsByTeacherId(id);
//		String interestStr = interestService.generateInterestNameStr(interestList);
		ModelAndView mv = new ModelAndView();
		mv.addObject("teacher", teacher);
//		mv.addObject("interests", interestStr);
        mv.setViewName("/teachers/update");
		return mv;
	}
	
	
	/**
	 * update the information of a teacher
	 * @param id
	 * @param name
	 * @param sex
	 * @param teacherNum
	 * @return
	 */
	@PostMapping(value="/detail/update")
	public ModelAndView updateATeacher(String name, String sex, String college, String phone, String address, String email, String title, String workstate) {
		Teacher teacher = teacherService.updateATeacher(name, sex, college, phone, address, email, title, workstate);
//		List<Interest> interestList = interestService.updateInterests(id, interests);
//		String interestStr = interestService.generateInterestNameStr(interestList);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("teacher", teacher);
//		mv.addObject("interests", interestStr);
        mv.setViewName("/teachers/detail");
		return mv;
	}
	
	@GetMapping(value="/delete")
	public ModelAndView deleteATeacher(@RequestParam("id") int id) {
		teacherService.deleteATeacher(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("teachers", teacherService.getAllTeachers());
		mv.setViewName("/teachers/list");
		return mv;
	}
}
