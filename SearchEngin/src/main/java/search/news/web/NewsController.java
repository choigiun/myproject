package search.news.web;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import base.constant.Constant;
import base.utils.NaverSearchApi;
import search.news.service.NewsReqVO;

/**
 * 뉴스 검색 처리 Controller
 * @author liamg
 *
 */
@Controller
@RequestMapping("/search/news")
public class NewsController {

	private static final Logger logger = LoggerFactory.getLogger(NewsController.class);
	
	/**
	 * 뉴스 페이지
	 * @return
	 */
	@RequestMapping("/page")
	public String getNews() {
		
		return "search/news";
	}
	
	/**
	 * 뉴스 검색 리스트
	 * @param model
	 * @param movieVO
	 * @return
	 */
	@RequestMapping("/getNewsList")
	public String getNewsList(ModelMap model, NewsReqVO newsReqVO) {
		
		NaverSearchApi naver = new NaverSearchApi();
		
		HashMap<String, String> searchKeywords = newsReqVO.getSearchKeywords();
		
		String searchInfo = naver.getSearchInfo(Constant.NEWS_API_URL, searchKeywords);
		
		logger.info("newsList");
		logger.info(searchInfo);
		model.addAttribute("newsList", searchInfo);
		
		return "JsonView";
	}
}
