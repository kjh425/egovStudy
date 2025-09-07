<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>준한이 페이지 테스트</title>
	<script type="text/javaScript" language="javascript" defer="defer">
		init();
	
		function init(){
			console.log('gdgd');
		}
		
		function testFunc(){
			alert('버튼클릭해봄!');
		}

	</script>
</head>
<body>
	<h1>gdgd</h1>
	<button type="button" id="test" onclick="testFunc()">zzzz</button>
</body>
</html>