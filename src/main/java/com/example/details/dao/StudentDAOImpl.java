package com.example.details.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.details.model.Student;
import com.example.details.repository.DepartmentRepository;
import com.example.details.repository.StudentRepository;

@Repository
public class StudentDAOImpl implements StudentDAO{
	
	@Autowired
	private StudentRepository repo;
	
	@Autowired
	private DepartmentRepository drepo;
	public Student addStudentDao(Student student)
	{
		
		Student stud = repo.save(student);
		return stud;
	}

}
