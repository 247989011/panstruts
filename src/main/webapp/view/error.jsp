<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.struts.service.vo.MessageVO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
	MessageVO vo  = (MessageVO)request.getAttribute("vo");
	out.println(vo);	
	%>
	<table>
		<tr>
			<td><%=vo.getMsg() %></td>
		</tr>
		<tr>
			<td><%=vo.getName() %></td>
		</tr>
		<tr>
			<td><%=vo.getSss() %></td>
		</tr>
		<tr>
			<td><%=vo.getDdd() %></td>
		</tr>
	</table>
</body>
</html>