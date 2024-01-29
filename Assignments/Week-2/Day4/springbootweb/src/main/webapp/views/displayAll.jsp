<%@ page import="java.util.List" %>
<%@ page import="com.hexaware.springbootweb.entity.Employee" %>

<h1>Display All</h1>
Hello, this is JSP
<%

List<Employee> list = (List<Employee>)session.getAttribute("empList");
out.println(list);


%>