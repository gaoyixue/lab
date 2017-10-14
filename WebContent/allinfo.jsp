<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>所有书籍信息</title>
</head>
<body>
<table align="left" border="1"> 
   <tr>
     <td><a href="addbook.jsp">添加一本书籍信息</a></td>
   </tr>
   <tr>
     <td><a href="updatebook.jsp">更新一本书籍信息</a></td>
   </tr>
</table>
<table align="center" border="1">
    <caption>所有书籍信息</caption>
   <s:iterator value="blist" var="book"> 
           <tr>
           <td>ISBN:<s:property value="ISBN"/></td>
          <td>Title:<s:property value="Title"/></td>
         <td>AuthorID:<s:property value="AuthorID"/></td>
          <td>Publisher:<s:property value="Publisher"/></td>
         <td>PublishDATE:<s:property value="PublishDATE"/></td>
         <td>Price:<s:property value="Price"/></td>
         </tr>
     </s:iterator>
 </table>
</body>
</html>