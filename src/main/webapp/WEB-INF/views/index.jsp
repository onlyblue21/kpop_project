<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method="post" id="login">
		<table>
			<thead>
				<tr>
					<td>LOGIN</td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>ID <input type="text" name="userId">
					</td>
				</tr>
				<tr>
					<td>PASSWORD <input type="password" name="userPassword">
					</td>
				</tr>
				<tr>
					<td>
						<button type="submit" id="sumit">������</button>
					</td>
				</tr>
			</tbody>
		</table>
		�輺�� �׽�Ʈ ����!!! The time on the server is ${serverTime}.
	</form>
	<br>
</body>

</html>
