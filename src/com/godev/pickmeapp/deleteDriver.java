package com.godev.pickmeapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class deleteDriver extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id=req.getParameter("id");
		Dao.INSTANCE.remove(Long.parseLong(id));
		
		resp.sendRedirect("/list.jsp");
		
		//super.doGet(req, resp);
	}
}
