<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="addbookAction" method="post">
   <table align="center" border="1">
   <tr>
     <td>ISBN:</td>
     <td><input type="text" name="ISBN"> </td>
   </tr>
   <tr>
     <td>Title:</td>
     <td><input type="text" name="Title"></td>
   </tr>
   <tr>
     <td>AuthorID:</td>
     <td><input type="text" name="AuthorID"></td>
   </tr>
   <tr>
     <td>Publisher:</td>
     <td><input type="text" name="Publisher"></td>
   </tr>
   <tr>
     <td>PublishDATE:</td>
     <td><input type="text" name="PublishDATE"></td>
   </tr>
   <tr>
     <td>Price:</td>
     <td><input type="text" name="Price"></td>
   </tr>
   <tr>
      <td><input type="submit" value="添加"></td>
   </tr>
   </table>
 </form>
</body>
</html>