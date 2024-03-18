package com.prowings.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prowings.dao.StudentDao;
import com.prowings.entity.Student;

public class StudentServlet extends HttpServlet {
	
	
	StudentDao stdDao = new StudentDao();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
		Student std = new Student();
		
		std.setFirstName(req.getParameter("fname"));
		std.setLastName(req.getParameter("lname"));
		std.setCourse(req.getParameter("course"));
		std.setAddress(req.getParameter("address"));
		
		
		stdDao.saveStudent(std);
	
	
	
	}
	
	
	

}
