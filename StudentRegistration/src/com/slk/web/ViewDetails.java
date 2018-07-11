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

@WebServlet("/ViewDetails")
public class ViewDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ViewDetails() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			StudentDao dao= new StudentDaoImpl();
			request.setAttribute("student", dao.getAll());
			request.getRequestDispatcher("/StudentDetail.jsp").include(request, response);
		} catch (DaoException e) {
	//		/WEB-INF/views/
			throw new ServletException();
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
