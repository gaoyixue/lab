<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd 

">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>按照作者姓名查书</title>
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
<form action="queryAction" method="post">
  <table align="center" border="1"> 
     <caption>查找书籍信息</caption>
   <tr>
     <td>作者名</td>
     <td><input type="text" name="name"></td>
   </tr>
   <tr>
     <td><input type="submit" value="查找"></td>
   </tr>
 </table>
 </form>
</body>
</html>