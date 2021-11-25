package com.example.details.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.details.repository.StudentRepository;


@Component
public class TestJpa {

	@Autowired
	private StudentRepository rep;
	

	
	public void testonetoone()
	{
		/*Department a = new Department(181,"MECH");
		Employee e = new Employee(181,"Shiva","Hegde",a);
		arep.save(a);
		rep.save(e);*/
	}
}
