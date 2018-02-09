<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>My JSP 'students.jsp' starting page</title>
  </head>
  <body>
    <div>
    <form action="${pageContext.request.contextPath }/querystudent.action" method="post">
       学生名<input type="text" name="studentsCustom.stuname"/> 
       班级<select name="studentsCustom.sandcid">
          <c:forEach items="${findClassList}" var="i">
             <option value="${i.classid }">${i.classname}</option>
          </c:forEach>
       </select>
      <input type="submit" value="查询"/> 
      <a href="${pageContext.request.contextPath }/addstudents.action?stuid=0">增加</a>
       </form>
    <table border="1" id="tb">
      <tr>
         <td>id</td>
         <td>班级</td>
         <td>学生名</td>
         <td>学号</td>
         <td>性别</td>
         <td>地址</td>
         <td>备注</td>
         <td>照片</td>
         <td>操作</td>
      </tr>
      <c:forEach items="${querystudent}" var="j">
       <tr>
         <td>${j.stuid }</td>
         <td>${j.classInfo.classname }</td>
         <td>${j.stuname }</td>
         <td>${j.stunum }</td>
         <td>${j.sex }</td>
         <td>${j.address }</td>
         <td>${j.remark }</td>
         <td>${j.photos }</td>
         <td><a href="${pageContext.request.contextPath}/addstudents.action?stuid=${j.stuid}">修改</a>|<a href="${pageContext.request.contextPath}/deletestudent.action?stuid=${j.stuid}">删除</a>
         </td>
         </tr>
      </c:forEach>
    </table>
    </div>
  </body>
</html>
