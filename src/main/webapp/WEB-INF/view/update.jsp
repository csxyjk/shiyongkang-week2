<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="color: red" align="center">
		<h2>年检审核详情</h2>
		<hr><a href="findAll.do">返回主菜单</a>
		关键字:<input type="text" value="${company.keyname }"><br><br>
		描述:<input type="text" value="${company.detail }"><br><br>
		公司名称:<input type="text" value="${company.cname }"><br><br>
		公司地址:<input type="text" value="${company.caddress }"><br><br>
		主营产品:<input type="text" value="${company.product }"><br><br>
		创办资金:<input type="text" value="${company.sales }"><br><br>
		创办时间:<input type="text" value="${company.ctime }"><br><br>
		备注:<input type="text" value="${company.csaying }"><br><br>
	</div>
</body>
</html>