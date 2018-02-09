<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>My JSP 'classinfo.jsp' starting page</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath }/findUser_tbList.action" method="post">
  <input type="text" name="classinfocustom.classname"/>
     <input type="submit" value="查询"/>
     <a href="upclass.jsp">新增</a>
  </form>
  <table border="1">
  <tr>
     <td>id</td><td>名字</td><td>编号</td><td>班主任</td><td>操作</td>
  </tr>
     <c:forEach items="${list }" var="i">
      <tr>
        <td>${i. classid}</td>
        <td>${i. classname}</td>
        <td>${i. cnumber}</td>
        <td>${i. classtecher}</td>
        <td>
        <a href="${pageContext.request.contextPath }/queryclass.action?classid=${i. classid}">修改</a>|
        <a href="${pageContext.request.contextPath }/deleteclass.action?classid=${i. classid}">删除</a>
        </td>
      </tr>
     </c:forEach>
     </table>
  </body>
</html>
<script>
    
</script>
