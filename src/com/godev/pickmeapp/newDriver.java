package com.godev.pickmeapp;

import java.io.IOException;

import javax.annotation.CheckForNull;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class newDriver extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		//Adding a person
		String name=req.getParameter("name");
		String userName=req.getParameter("userName");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String phoneNumber=req.getParameter("phoneNumber");
		String taxiID=req.getParameter("taxiID");
		String town=req.getParameter("town");
		String startingTime=req.getParameter("startingTime");
		String closingTime=req.getParameter("closingTime");
		
		Dao.INSTANCE.add(name, email, userName, password, phoneNumber, taxiID, town, startingTime, closingTime);
		
		resp.sendRedirect("/list.jsp");
	}
}
