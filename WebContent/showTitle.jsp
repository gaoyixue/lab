<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags"%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd 

">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>根据作者名查到的书题目</title>
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
          <caption>结果信息</caption>
   <s:iterator value="list" var="b">    
		<tr> 
			<td>
			<a href="showinfoAction?Title=<s:property value="Title"/>">
			<s:property value="Title"/>
			</a>
			</td>    
			 <td><a href="deletebookAction?Title=<s:property value="Title"/>">删除</a></td>
		</tr>
	</s:iterator>
 </table>  
</body>
</html>
