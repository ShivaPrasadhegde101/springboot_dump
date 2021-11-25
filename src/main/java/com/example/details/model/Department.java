package com.example.details.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="department2406")
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int deptId;
	
	private String deptName;

	@OneToOne(mappedBy = "dept")
	private Student student;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}


	public int getDeptId() {
		return deptId;
	}


	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public Student getStudent()
	{
		return this.student;
	}

	public void setStudent(Student student)
	{
		this.student = student;
	}
	
	
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
	
	
	

}
