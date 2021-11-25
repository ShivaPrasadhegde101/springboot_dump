package com.example.details.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
@Entity
@Table(name = "student2406")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sId;
	
	
	@NotBlank(message="Please Enter the First Name")
	private String firstName;
	private String lastName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Department dept;
	
	@Pattern(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message="Please Enter a Valid Email Address")
	private String email;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sId, String firstName, String lastName, Department dept,String email) {
		super();
		this.sId = sId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dept = dept;
	}

	public int getSId() {
		return sId;
	}

	public void setSid(int sId) {
		this.sId = sId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setDept(Department dept)
	{
		this.dept = dept;
	}
	
	public Department getDept()
	{
		return this.dept;
	}
	
	public String getEmail()
	{
		return this.email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", firstName=" + firstName + ", lastName=" + lastName + ", dept=" + dept + ",email=" + email +"]";
	}
}


