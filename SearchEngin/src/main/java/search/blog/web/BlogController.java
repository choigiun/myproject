package search.blog.web;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import base.constant.Constant;
import base.utils.NaverSearchApi;
import search.blog.service.BlogReqVO;

/**
 * 블로그 검색 처리 Controller
 * @author liamg
 *
 */
@Controller
@RequestMapping("/search/blog")
public class BlogController {

	private static final Logger logger = LoggerFactory.getLogger(BlogController.class);
	
	/**
	 * 블로그 페이지
	 * @return
	 */
	@RequestMapping("/page")
	public String getBlog() {
		
		return "search/blog";
	}
	
	/**
	 * 블로그 검색 리스트
	 * @param model
	 * @param blogReqVO
	 * @return
	 */
	@RequestMapping("/getBlogList")
	public String getBlogList(ModelMap model, BlogReqVO blogReqVO) {
		
		NaverSearchApi naver = new NaverSearchApi();
		
		HashMap<String, String> searchKeywords = blogReqVO.getSearchKeywords();
		
		String searchInfo = naver.getSearchInfo(Constant.BLOG_API_URL, searchKeywords);
		
		logger.info("blogList");
		logger.info(searchInfo);
		model.addAttribute("blogList", searchInfo);
		
		return "JsonView";
	}
	
}
