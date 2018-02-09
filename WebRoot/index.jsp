<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>My JSP 'index.jsp' starting page</title>
  </head>
     <frameset cols="20%,*">
	      <frame noresize="noresize" frameborder="1" src="${pageContext.request.contextPath }/left.jsp">
	      <frame src="${pageContext.request.contextPath }/queryareas.action" name="color">
      </frameset> 
</html>
