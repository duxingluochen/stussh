<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>My JSP 'addstudents.jsp' starting page</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath }/updatestude.action" method="post" enctype="multipart/form-data">
  <!-- 判断是否为空对象 -->
  <c:if test="${empty upqueryadd}"> 
  <input type="text" name="stuid" value="0" style="display: none"/><br/> 
  </c:if>
   
  <c:if test="${!empty upqueryadd}"> 
  <input type="text" name="stuid" value="${upqueryadd.stuid}" style="display: none"/><br/> 
  </c:if>
  
      学生名<input type="text" name="stuname" value="${upqueryadd.stuname }"/><br/>
      照片<c:if test="${upqueryadd.photos!=null }">
        <img src="/pic/${upqueryadd.photos }" width=100  height=100 />
      </c:if>
      <input type="file" name="photos" value="${upqueryadd.photos }"/><br/>  
      班级<select name="sandcid" >
     <c:forEach items="${findClassList}" var="i">
        <option value="${i.classid }" <c:if test="${upqueryadd.sandcid eq i.classid}">selected="selected"</c:if>>${i.classname }</option>
     </c:forEach>
    </select>
      <br/>
  学号<input type="text" name="stunum" value="${upqueryadd.stunum }" /><br/>
  性别<input type="radio" name="sex" value="男" <c:if test="${upqueryadd.sex eq '男'}">checked="${upqueryadd.sex }"</c:if>/>男
    <input type="radio" name="sex" value="女" <c:if test="${upqueryadd.sex eq '女'}">checked="${upqueryadd.sex }"</c:if>/>女<br/>
    地址<select >
        <c:forEach items="${queryprovince}" var="i">
         <option>${i.province }</option>
        </c:forEach>
      </select>
      <select >
          <c:forEach items="${queryareatype}" var="j">
           <option >${j.areatype }</option>
         </c:forEach>
      </select>
      <select >
          <c:forEach items="${queryareatype}" var="j">
            <option >${j.areatype }</option>
          </c:forEach>
      </select><br/>
      详细地址<input type="text" name="address"  value="${upqueryadd.address }"/><br/>
      备注<textarea rows="10" cols="20" name="remark">${upqueryadd.remark }</textarea><br/>
      <input type="submit" value="提交" />
      <input type="reset" value="重置" />
      <input type="button" value="返回" onclick="backup()"/>
  </form>
  </body>
</html>
<script type="text/javascript">
   function backup(){
     history.back();
   }
</script>
