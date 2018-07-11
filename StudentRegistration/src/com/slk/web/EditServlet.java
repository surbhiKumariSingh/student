package com.slk.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.slk.dao.DaoException;
import com.slk.dao.StudentDao;
import com.slk.dao.StudentDaoImpl;
import com.slk.entity.Student;

@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EditServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
		StudentDao dao= new StudentDaoImpl();
		int id= Integer.parseInt(request.getParameter("id"));
		Student s=dao.GetStudentById(id);
		request.setAttribute("student", s);
		
	request.getRequestDispatcher("/EditPage.jsp").forward(request, response);
		//response.sendRedirect("/studentRegistration/Registration.jsp");
		//response.sendRedirect("./");
		}catch(DaoException e) {
			throw new ServletException(e);
		}
	}

}
