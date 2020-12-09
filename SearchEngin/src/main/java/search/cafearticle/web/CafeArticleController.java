package search.cafearticle.web;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import base.constant.Constant;
import base.utils.NaverSearchApi;
import search.cafearticle.service.CafeArticleReqVO;

/**
 * 카페글 검색 처리 Controller
 * @author liamg
 *
 */
@Controller
@RequestMapping("/search/cafearticle")
public class CafeArticleController {
	
	private static final Logger logger = LoggerFactory.getLogger(CafeArticleController.class);
	
	/**
	 * 카페글 페이지
	 * @return
	 */
	@RequestMapping("/page")
	public String getCafeArticle() {
		
		return "search/cafearticle";
	}
	
	/**
	 * 카페글 검색 리스트
	 * @param model
	 * @param cafearticleReqVO
	 * @return
	 */
	@RequestMapping("/getCafeArticleList")
	public String getCafeArticleList(ModelMap model, CafeArticleReqVO cafearticleReqVO) {
		
		NaverSearchApi naver = new NaverSearchApi();
		
		HashMap<String, String> searchKeywords = cafearticleReqVO.getSearchKeywords();
		
		String searchInfo = naver.getSearchInfo(Constant.CafeArticle_API_URL, searchKeywords);
		
		logger.info("cafearticleList");
		logger.info(searchInfo);
		model.addAttribute("cafearticleList", searchInfo);
		
		return "JsonView";
	}

}
