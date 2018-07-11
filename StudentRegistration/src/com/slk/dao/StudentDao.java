package com.slk.dao;

import java.util.List;

import com.slk.entity.Student;

public interface StudentDao {
		public Student addStudent(Student student) throws DaoException;
		public List<Student> getAll() throws DaoException;
		public  Student GetStudentById(int id) throws DaoException;
		public Student UpdateStudent(Student student) throws DaoException;

	}


