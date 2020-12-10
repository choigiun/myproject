<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인</title>
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
    margin-top: 150px;
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
</style>
<script type="text/javascript">
$(function() {
	
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

	<p><a href="/search/movie/page">영화 페이지</a></p>
	<p><a href="/search/blog/page">블로그 페이지</a></p>
	<p><a href="/search/news/page">뉴스 페이지</a></p>
	<p><a href="/search/adult/page">성인 검색어 판별 페이지</a></p>
	<p><a href="/search/encyc/page">백과사전 페이지</a></p>
	<p><a href="/search/cafearticle/page">카페글 페이지</a></p>
	<p><a href="/search/kin/page">지식 iN 페이지</a></p>
	<p><a href="/search/local/page">지역 페이지</a></p>
	<p><a href="/search/errata/page">오타변환 페이지</a></p>
	<p><a href="/search/webkr/page">웹문서 페이지</a></p>
	<p><a href="/search/image/page">이미지 페이지</a></p>
	<p><a href="/search/shop/page">쇼핑 페이지</a></p>
	<p><a href="/search/doc/page">전문자료 페이지</a></p>
	<p><a href="/search/book/page">책 페이지</a></p>
 
</body>
</html>