<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화</title>
<link rel="stylesheet" href="/resources/css/bootstrap_3.3.0/bootstrap.min.css">
<script type="text/javascript" src="/resources/js/common/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="/resources/js/bootstrap_3.3.0/bootstrap.min.js"></script>
<script type="text/javascript" src="/resources/js/common/search.js"></script>
<style type="text/css">
.seach-bar{
	height: 80px;
	border: 1px solid black;
}
.header {
    margin-top: 50px;
}
.logo{
	margin-bottom: 40px;
	color: green;
}
.dropdown.dropdown-lg .dropdown-menu {
    margin-top: -1px;
    padding: 6px 20px;
}
.input-group-btn .btn-group {
    display: flex !important;
}
.btn-group .btn {
    border-radius: 0;
    margin-left: -1px;
}
.btn-group .btn:last-child {
    border-top-right-radius: 4px;
    border-bottom-right-radius: 4px;
}
.btn-group .form-horizontal .btn[type="submit"] {
  border-top-left-radius: 4px;
  border-bottom-left-radius: 4px;
}
.form-horizontal .form-group {
    margin-left: 0;
    margin-right: 0;
}
.form-group .form-control:last-child {
    border-top-left-radius: 4px;
    border-bottom-left-radius: 4px;
}

@media screen and (min-width: 768px) {
    #adv-search {
        width: 500px;
        margin: 0 auto;
    }
    .dropdown.dropdown-lg {
        position: static !important;
    }
    .dropdown.dropdown-lg .dropdown-menu {
        min-width: 500px;
    }
}

.menu-tab {
	margin-top: 50px;
}
.menu-tab ul li a {
	color: black;
}
.menu-tab ul .active a {
	color: green;
}
</style>
<script type="text/javascript">
$(function() {
		
	$('#btn').click(function() {
		const api_url = '/search/movie/getMovieList';
		const params = {
			query : null,
			display : null,
			start : null,
			genre : null,
			country : null,
			yearfrom : null,
			yearto : null
		};
		
		params.query = '기생충';
		params.display = '100';
		params.start = '1000';
		params.country = 'KR';
		params.yearfrom = '2000';
		params.yearto = '2020';
				
		fn_RequestSearchData(api_url, params, function(data) {
			const list = JSON.parse(data.movieList);
			
			console.log(list);
		});
	});
	
});
</script>
</head>
<body>
<div class="container header">
	<h1 class="text-center logo"><b>WOONI</b></h1>
	<div class="row">
		<div class="col-md-12">
            <div class="input-group" id="adv-search">
                <input type="text" class="form-control" placeholder="Search for snippets" />
                <div class="input-group-btn">
                    <div class="btn-group" role="group">
                        <div class="dropdown dropdown-lg">
                            <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><span class="caret"></span></button>
                            <div class="dropdown-menu dropdown-menu-right" role="menu">
                                <form class="form-horizontal" role="form">
                                  <div class="form-group">
                                    <label for="filter">Filter by</label>
                                    <select class="form-control">
                                        <option value="0" selected>All Snippets</option>
                                        <option value="1">Featured</option>
                                        <option value="2">Most popular</option>
                                        <option value="3">Top rated</option>
                                        <option value="4">Most commented</option>
                                    </select>
                                  </div>
                                  <div class="form-group">
                                    <label for="contain">Author</label>
                                    <input class="form-control" type="text" />
                                  </div>
                                  <div class="form-group">
                                    <label for="contain">Contains the words</label>
                                    <input class="form-control" type="text" />
                                  </div>
                                  <button type="submit" class="btn btn-success"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
                                </form>
                            </div>
                        </div>
                        <button type="button" class="btn btn-success"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
                    </div>
                </div>
          	</div>
        </div>
	</div>
</div>

<div class="container menu-tab">
	<ul class="nav nav-tabs">
      <li role="presentation" class="active"><a href="#">통합</a></li>
      <li role="presentation"><a href="/search/image/page">이미지</a></li>
      <li role="presentation"><a href="/search/encyc/page">백과사전</a></li>
      <li role="presentation"><a href="/search/shop/page">쇼핑</a></li>
      <li role="presentation"><a href="/search/blog/page">블로그</a></li>
      <li role="presentation"><a href="/search/local/page">지역</a></li>
      <li role="presentation"><a href="/search/news/page">뉴스</a></li>
      <li role="presentation"><a href="/search/book/page">책</a></li>
      <li role="presentation"><a href="/search/movie/page">영화</a></li>
      <li role="presentation"><a href="/search/cafearticle/page">카페글</a></li>
      <li role="presentation"><a href="/search/kin/page">지식iN</a></li>
      <li role="presentation"><a href="/search/webkr/page">웹문서</a></li>  
      <li role="presentation"><a href="/search/doc/page">전문자료</a></li>
      <li role="presentation" class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-expanded="false">
          옵션 <span class="caret"></span>
        </a>
        <ul class="dropdown-menu" role="menu">
          <li><a href="#">Action</a></li>
          <li><a href="#">Another action</a></li>
          <li><a href="#">Something else here</a></li>
          <li class="divider"></li>
          <li><a href="#">Separated link</a></li>
        </ul>
      </li>
    </ul>
</div>
<!-- <input id="btn" type="button" value="영화 리스트" /> -->
</body>
</html>