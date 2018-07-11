package com.slk.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.slk.dao.StudentDao;
import com.slk.dao.StudentDaoImpl;
import com.slk.entity.Student;

@WebServlet(urlPatterns = "/AddStudent")
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddStudent() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			StudentDao s = new StudentDaoImpl();
			String fname=request.getParameter("firstname");
			String lname=request.getParameter("lastname");
			String email=request.getParameter("email");
			String phone=request.getParameter("phone");
			String city=request.getParameter("city");
			String state=request.getParameter("state");
			String course=request.getParameter("course");
			
			Student s1= new Student(fname,lname,email,phone, city, state, course);
			s.addStudent(s1);
		//request.getRequestDispatcher("").include(request, response);
			response.sendRedirect("./");
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

}
