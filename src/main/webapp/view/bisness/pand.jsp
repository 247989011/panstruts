<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.struts.service.vo.PandVO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% PandVO vo  = (PandVO)request.getAttribute("vo");
	%>
	<table>
		<tr>
			<td><%=vo.getMsg() %></td>
		</tr>
		<tr>
			<td><%=vo.getObj() %></td>
		</tr>
		<tr>
			<td><%=vo.isSuccess() %></td>
		</tr>
	</table>
</body>
</html>