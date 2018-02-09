<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

  <head> 
    <title>My JSP 'upclass.jsp' starting page</title>
  </head>
  <body>
   <form action="${pageContext.request.contextPath }/updateinfo.action" method="post">
	<input type="text" name="classinfocustom.classid" value="${custom.classid }" style="display: none"/><br/>
     班级名<input type="text" name="classinfocustom.classname" value="${custom.classname }"/><br/>
     班级编号<input type="text" name="classinfocustom.cnumber" value="${custom.cnumber }"/><br/>
     班主任<input type="text" name="classinfocustom.classtecher" value="${custom.classtecher }"/><br/>
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
