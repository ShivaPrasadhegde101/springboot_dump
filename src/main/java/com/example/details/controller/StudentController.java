package com.example.details.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.details.model.Student;
import com.example.details.service.StudentService;


@Controller
public class StudentController {
	@Autowired
	private StudentService service;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String showRegistrationPage(@ModelAttribute("student") Student student,ModelMap map)
	{
		return "registration";
	}
	
	@RequestMapping(value="/registration",method=RequestMethod.POST)
	public ModelAndView showDetails(@Valid @ModelAttribute("student") Student student,BindingResult result)
	{
		ModelAndView view = new ModelAndView();
		if(result.hasErrors())
		{
			view.setViewName("registration");
			return view;
		}
		Student stud= service.addStudentService(student); 
		System.out.println(stud);
		view.addObject("student",stud);
		view.setViewName("details");
		return view;
	}
}
