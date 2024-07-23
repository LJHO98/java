<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- create.jsp --%>

<%
	request.setAttribute("name", "장보고");
%>

request객체 -> name : <%=request.getAttribute("name") %>