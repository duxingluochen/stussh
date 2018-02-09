<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>My JSP 'areasupda.jsp' starting page</title>
  </head>
  <body> 
  <form action="${pageContext.request.contextPath }/updatareas.action" method="post">
  <input type="test" name="areasCustom.areasid" value="${quer.areasid }" style="display: none"/> 
    上级<select name="areasCustom.county">
      <c:forEach items="${queryprovince}" var="i">
       <option>${i.province }</option>
      </c:forEach>
    </select><br/>
    地区名<input type="text" name="areasCustom.province" value="${quer.county }"/><br/>
    区域类型<select name="areasCustom.areatype">
       <c:forEach items="${queryareatype}" var="j">
       <option >${j.areatype }</option>
      </c:forEach>
    </select><br/>
    <input type="submit" value="提交"/>
    <input type="reset" value="重置"/>
    <input type="button" value="返回" onclick="backup()"/>
  </form>
  </body>
</html>
<script type="text/javascript">
   function backup(){
     history.back();
   }
</script>
