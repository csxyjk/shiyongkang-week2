<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/jquery-3.2.1.js"></script>
</head>
<body>
	<div style="color: blue" align="center">
		<h2 style="color: red">公司年检信息表</h2>
		<hr>
		<form action="findAll.do" method="post">
			关键字:<input type="text" name="kname" value="${companyVo.kname }">
			描述:<input type="text" name="cdetail" value="${companyVo.cdetail }">
			公司名称:<input type="text" name="cname" value="${companyVo.cname }"><br>
			注册资金:<input type="text" name="beginSale"
				value="${companyVo.beginSale }">-<input type="text"
				name="endSale" value="${companyVo.endSale }"> 成立时间:<input
				type="date" name="beginTime" value="${companyVo.beginTime }">-<input
				type="date" name="endTime" value="${companyVo.endTime }">
			<button>查询</button>
		</form>
		<table border="1" cellspacing="0" style="border-bottom-color: blue">
			<tr>
				<th>编号</th>
				<th>关键字</th>
				<th>描述</th>
				<th>公司名称</th>
				<th>主营产品</th>
				<th>地址</th>
				<th>注册资金（万元）</th>
				<th>成立时间</th>
				<th>年检时间</th>
				<th>年检状态</th>
				<th>备注</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${list }" var="s">
				<tr>
					<td>${s.cid }</td>
					<td>${s.keyname }</td>
					<td>${s.detail }</td>
					<td>${s.cname }</td>
					<td>${s.product }</td>
					<td>${s.caddress }</td>
					<td>${s.sales }</td>
					<td>${s.ctime }</td>
					<td>${s.checktime }</td>
					<td>${s.cstatus }</td>
					<td>${s.csaying }</td>
					<td><input type="button" value="年检审核"
						onclick="reshow(${s.cid})"></td>
				</tr>
			</c:forEach>
		</table>
		<form action="findAll.do" method="post">
			<button name="pageNow" value="1">首页</button>
			<button name="pageNow" value="${page.prePage==0?1:page.prePage }">上一页</button>
			<button name="pageNow"
				value="${page.nextPage==0?page.pages:page.nextPage}">下一页</button>
			<button name="pageNow" value="${page.pages}">尾页</button>
			第${page.pageNum }页/共${page.pages }页/ 共${page.total }条
		</form>
	</div>

</body>
<script type="text/javascript">
	function reshow(id){
		location="reshow.do?id="+id;		
	}
</script>
</html>