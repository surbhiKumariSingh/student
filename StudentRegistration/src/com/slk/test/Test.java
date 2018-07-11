package com.slk.test;

import com.slk.dao.StudentDao;
import com.slk.dao.StudentDaoImpl;
import com.slk.entity.Student;

public class Test {

	public static void main(String[] args) throws Exception {

		StudentDao dao;
		dao = new StudentDaoImpl(); // tight coupling
		Student s = new Student();
		dao.GetStudentById(1);
		s.setState("sdfsdfg");
System.out.println(dao.GetStudentById(1));
System.out.println(s);
	}

}
