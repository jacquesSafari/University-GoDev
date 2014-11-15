<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.godev.pickmeapp.model.Person" %>
<%@ page import="com.godev.pickmeapp.model.Driver" %>
<%@ page import="com.godev.pickmeapp.Dao" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/main.css"/>
<title>Drivers Management</title>
</head>
<body>

<%
Dao dao = Dao.INSTANCE;
List<Driver> drivers = new ArrayList<Driver>();
drivers = dao.listDrivers();
%>

  <div style="width: 100%;">
    <div class="line"></div>
    <div class="topLine">
      <div style="float: Right;" ><img src="img/driver.png" height="22" width="22" /></div>
      <div style="float: Left;" class="headline">Drivers</div>
      <div style="float: Right;" class=""><a href="#">Login</a></div>
    </div>
  </div>

<div style="clear: both;"/>  
You have a total number of <%= drivers.size() %>  Drivers registered.

<table>
  <tr>
      <th>Name </th>
      <th>User Name</th>
      <th>Email</th>
      <th>Phone</th>
      <th>Taxi</th>
      <th>Remove</th>
    </tr>

<% for (Driver d : drivers) {%>
<tr> 
	<td>
		<%=d.getName()%>
	</td>
	<td>
		<%=d.getUserName()%>
	</td>
	<td>
		<%=d.getEmail()%>
	</td>
	<td>
		<%=d.getPhoneNumber()%>
	</td>
	<td>
		<%=d.getTaxiID()%>
	</td>
	<td>
		<a class="remove" href="/remove?id=<%=d.getPersonID()%>" >Remove</a>
	</td>
	</tr> 
<%}
%>
</table>


<hr />

<div class="main">

<div class="headline">New Driver</div>
 

<form action="/new" method="post" accept-charset="utf-8">
  <table>
    <tr>
      <td><label for="name">Name</label></td>
      <td><input type="text" name="name" id="name" size="65"/></td>
    </tr>
    <tr>
      <td valign="top"><label for="userName">User Name</label></td>
      <td><input type="text" name="userName" id="userName" size="65"></td>
    </tr>
  <tr>
    <td valign="top"><label for="email">email</label></td>
    <td><input type="text" name="email" id="email" size="65" /></td>
  </tr>
  <tr>
  <tr>
  <td valign="top"><label for="password">Password</label></td>
    <td><input type="password" name="password" id="password" size="65" /></td>
  </tr>
  <tr>
   <td valign="top"><label for="phoneNumber">Phone Number</label></td>
    <td><input type="text" name="phoneNumber" id="phoneNumber" size="65" /></td>
  </tr>
  <tr>
    <td valign="top"><label for="town">Town</label></td>
    <td><input type="text" name="town" id="town" value="Cape Town" size="65" /></td>
  </tr>
  <tr>
    <td valign="top"><label for="taxiID">Taxi ID</label></td>
    <td><input type="text" name="taxiID" id="taxiID" size="65" /></td>
  </tr>
  <tr>
    <td valign="top"><label for="startingTime">Starting Time</label></td>
    <td><input type="text" name="startingTime" id="startingTime" value="6 am" size="65" /></td>
  </tr>
  <tr>
    <td valign="top"><label for="closingTime">Closing Time</label></td>
    <td><input type="text" name="closingTime" id="closingTime" value= "5 pm" size="65" /></td>
  </tr>
  <tr>
  <tr>
  <tr>
  <tr>
  <tr>
  
  
  <tr>
      <td colspan="2" align="right"><input type="submit" value="Create"/></td>
    </tr>
  </table>
</form>

</body>
</html>