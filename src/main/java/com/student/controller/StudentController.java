package com.student.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.student.model.Student;

import com.student.service.StudentServiceInterface;

@Controller
public class StudentController {

	@Autowired
	StudentServiceInterface studentServiceInterface;
	
	//.............Register page
	
	@RequestMapping("/student/register")
	public ModelAndView getRegisterPage(Model model)  {
		
		System.out.println("Welcome Student Controller...........");
		
		Student student= new Student();
		
		model.addAttribute("std",student);
		return new ModelAndView("register");
		
	}
	
	
	//......................Save Student Info
	@RequestMapping(value = "/student/saveStudent" , method = RequestMethod.POST)
	public ModelAndView saveStudent(@ModelAttribute("std") Student student, BindingResult result) {
		
		System.out.println("Inside student controller............");
		System.out.println("Student Firs tName :" +student.getFirstName());
		System.out.println("Student Last Name :" +student.getLastName());
		System.out.println("Student Address :" +student.getAddress());
		System.out.println("Student Mobile No :" +student.getMobileNo());
		
		studentServiceInterface.saveStudent(student);
		
		System.out.println("Record Save Sucessfully...........................");
		return new ModelAndView("redirect:/student/getAllStudent");
		
	}
	
	
	
	//.............Get All student show Info
	@RequestMapping("/student/getAllStudent")
	public ModelAndView getAllStudent(Model model) {
		System.out.println("Inside Get All student..............................");
		
		model.addAttribute("allStudent", studentServiceInterface.getClass());
		return new ModelAndView("displayAllStudent");
	}
	
	//.......................Find student info by id
	
	@RequestMapping("/student/findStudent/{Id}")
	public ModelAndView findStudent(Model model, @PathVariable("Id") int stdId) {
		
		System.out.println("Inside find student controller method");
		model.addAttribute("studentUpdate", studentServiceInterface.findStudent(stdId));
		
		return new ModelAndView("studentUpdateForm");
	}
	
	//.............Update student info
	
	@RequestMapping(value = "/student/updateStudent" ,method = RequestMethod.POST)
	public ModelAndView updateStudent(@ModelAttribute("studentUpdate") Student student, BindingResult result) {
		System.out.println("Inside update student controller method........................");
		
		studentServiceInterface.updateStudent(student);
		return new ModelAndView("redirect:/student/getAllStudent");
		
	}
	
	
	//.......................delete student by id
	
	@RequestMapping(value = "/student/deleteStudent/{stdId}",  method = RequestMethod.GET)
	public ModelAndView deleteStudent(@PathVariable("stdId") int stdId) {
		System.out.println("Inside delete Student controller method..................................");
		Student student = studentServiceInterface.findStudent(stdId);
		studentServiceInterface.deleteStudent(student);
		return new ModelAndView("redirect:/student/getAllStudent");
	}  

}
