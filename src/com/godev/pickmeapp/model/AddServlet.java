package com.godev.pickmeapp.model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class AddServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		
		//super.doGet(req, resp);
		resp.sendRedirect("/add.jsp");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=req.getParameter("name");
		Key driverKey=KeyFactory.createKey("Driver", name);
				
		
		Entity driver= new Entity("Driver",driverKey);
		driver.setProperty("name", name);
		
		DatastoreService datastore=DatastoreServiceFactory.getDatastoreService();
		datastore.put(driver);
		//super.doPost(req, resp);
	}
	

}
