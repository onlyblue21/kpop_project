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
					<td>
						LOGIN
					</td>
				</tr>		
			</thead>
			<tbody>
				<tr>
				ID
					<td>
					<input type="text" name="userId" value="">			
					</td>
				</tr>		
				<tr>
				PASSWORD
					<td>
					<input type="password" name="userPassword" value="">
					</td>
				</tr>
				<tr>
					<td>
					<button  type="submit" id="sumit">ログイン</button>
					</td>
				</tr>
			</tbody>		
		</table>
	 김성묵 테스트 성공!!!
	The time on the server is ${serverTime}.
	</form>
<br>
</body>

</html>
