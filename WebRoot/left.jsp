<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>My JSP 'left.jsp' starting page</title>
  </head>
  <body>
  <div>
     <ul>
       <li><a href="${pageContext.request.contextPath }/querystudent.action" target="color">学生表</a></li>
       <li><a href="classinfo.jsp" target="color">班级表</a></li>
       <li><a href="${pageContext.request.contextPath }/queryareas.action" target="color">地区表</a></li>
     </ul>
  </div> 
  </body>
</html>
