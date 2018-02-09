<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>My JSP 'error.jsp' starting page</title>
  </head>
  <body>
  <div>
    <div><span>操作失败</span></div>
    <div></div><hr/>
     <input type="submit" value="返回" onclick="backup()"/>
  </div> 
  </body>
</html>
<script type="text/javascript">
   function backup(){
     history.back();
   }
</script>
