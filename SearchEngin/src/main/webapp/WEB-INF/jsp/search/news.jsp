<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>뉴스</title>
<script type="text/javascript" src="/resources/js/common/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="/resources/js/common/search.js"></script>
<script type="text/javascript">
$(function() {
		
	$('#btn').click(function() {
		const api_url = '/search/news/getNewsList';
		const params = {
			query : null,
			display : null,
			start : null,
			sort : null
		};
		
		params.query = '비트코인';
				
		fn_RequestSearchData(api_url, params, function(data) {
			const list = JSON.parse(data.newsList);
			
			console.log(list);
		});
	});
	
});
</script>
</head>
<body>
<input id="btn" type="button" value="뉴스 리스트" />
<div id="list"></div>
</body>
</html>