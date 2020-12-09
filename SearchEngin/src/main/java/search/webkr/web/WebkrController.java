package search.webkr.web;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import base.constant.Constant;
import base.utils.NaverSearchApi;
import search.webkr.service.WebkrReqVO;

/**
 * 웹문서 검색 처리 Controller
 * @author liamg
 *
 */
@Controller
@RequestMapping("/search/webkr")
public class WebkrController {
	
	private static final Logger logger = LoggerFactory.getLogger(WebkrController.class);
	
	/**
	 * 웹문서 페이지
	 * @return
	 */
	@RequestMapping("/page")
	public String getWebkr() {
		
		return "search/webkr";
	}
	
	/**
	 * 웹문서 검색 리스트
	 * @param model
	 * @param webkrReqVO
	 * @return
	 */
	@RequestMapping("/getWebkrList")
	public String getWebkrList(ModelMap model, WebkrReqVO webkrReqVO) {
		
		NaverSearchApi naver = new NaverSearchApi();
		
		HashMap<String, String> searchKeywords = webkrReqVO.getSearchKeywords();
		
		String searchInfo = naver.getSearchInfo(Constant.WEBKR_API_URL, searchKeywords);
		
		logger.info("webkrList");
		logger.info(searchInfo);
		model.addAttribute("webkrList", searchInfo);
		
		return "JsonView";
	}

}
