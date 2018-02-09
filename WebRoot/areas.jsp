<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>地区表</title>
  </head>
  <body>
   <table border="1">
     <tr>
       <td>id</td><td>地区</td><td>上级</td><td>区域类型</td>
       <td>操作</td>
     </tr>
      <c:forEach items="${queryareas}" var="i">
       <tr>
         <td>${i.areasid }</td>
         <td>${i.county }</td>
         <td>${i.province }</td>
         <td>${i.areatype }</td>
         <td><a href="${pageContext.request.contextPath }/queryareasup.action?areasid=${i. areasid}">修改</a>|<a href="${pageContext.request.contextPath }/deleteareas.action?areasid=${i. areasid}">删除</a></td>
       </tr>
      </c:forEach>
   </table>
  </body>
</html>
