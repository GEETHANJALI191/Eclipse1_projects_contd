package com.spring.Spring_HIbernate_Integration;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.entity.Employee;

public class testClass {
	@Autowired
	EmployeeServiceImpl ei;
	@Test
	public void test() {
		 /*=new EmployeeServiceImpl();*/
		Employee o=new Employee();
		o.setId(90);
		o.setName("jay1");
		o.setSalary(4500020);
		Employee output=ei.updateEmployee(o);
		assertEquals(o,output);
	}

}


