package com.example.details.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.details.model.Department;

public interface DepartmentRepository extends JpaRepository<Department,Integer>{

}
