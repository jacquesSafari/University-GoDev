<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.List" %>
 <%@ page import="com.google.appengine.api.datastore.KeyFactory" %>
 <%@ page import= "com.godev.pickmeapp.model.*"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Driver Registration</title>
</head>
<body>
<h1>Driver 	List</h1>
 
	Click to Add Driver : <a href="addForm">Add Driver</a>
	<hr />
 
	<h2>Drivers List</h2>
	<table border="1">
		<thead>
			<tr>
				<td>Name</td>
				<td>Email</td>
				<td>User Name</td>
				<td>Action</td>
			</tr>
		</thead>
 
		<%
 
		if(request.getAttribute("driverList")!=null){
 
			List<Driver> drivers = 
                           (List<Driver>)request.getAttribute("driverList");
 
			if(!drivers.isEmpty()){
				 for(Driver mydriver : drivers){
 
		%>
				<tr>
				  <td><%=mydriver.getName() %></td>
				  <td><%=mydriver.getEmail() %></td>
				  <td><%=mydriver.getUserName() %></td>
				  <td><a href="update/<%=mydriver.getPersonID()%>">Update</a> | 
                   <a href="delete/<%=KeyFactory.keyToString(mydriver.getPersonID()) %>">
                                       Delete</a>
				</tr>
		<%	
 
				}
 
			}
 
		   }
		%>
 
        </tr>
 
	</table>
</body>
</html>