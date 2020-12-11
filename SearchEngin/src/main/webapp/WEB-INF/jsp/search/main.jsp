<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

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