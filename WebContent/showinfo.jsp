<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
         <caption>结果书籍信息</caption>
  <tr>
           <td>ISBN:</td>
           <td>Title:</td>
          <td>AuthorID:</td>
          <td>Publisher:</td>
          <td>PublishDATE:</td>
          <td>Price:</td>
   </tr>
     <tr>
       <td><s:property value="book.ISBN"/></td>
       <td><s:property value="book.Title"/></td>
       <td><s:property value="book.AuthorID"/></td>
       <td><s:property value="book.Publisher"/></td>
       <td><s:property value="book.PublishDATE"/></td>
       <td><s:property value="book.price"/></td>
     </tr>    
 </table>   
 
 <table align="center" border="1">
         <caption>作者信息</caption>
  <tr>
           <td>AuthorID:</td>
           <td>Name:</td>
          <td>Country:</td>
          <td>Age:</td>
   </tr>
     <tr>
       <td><s:property value="author.AuthorID"/></td>
       <td><s:property value="author.Name"/></td>
       <td><s:property value="author.Country"/></td>
       <td><s:property value="author.Age"/></td>
     </tr>    
 </table>   
</body>
</html>