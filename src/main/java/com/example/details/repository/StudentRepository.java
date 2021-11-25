package com.example.details.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.details.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{
	

}
