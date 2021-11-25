package com.example.details.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.details.dao.StudentDAO;
import com.example.details.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDAO dao;
	public Student addStudentService(Student student)
	{
		Student stud = dao.addStudentDao(student);
		return stud;
	}

}
