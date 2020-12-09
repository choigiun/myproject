package search.local.web;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import base.constant.Constant;
import base.utils.NaverSearchApi;
import search.local.service.LocalReqVO;

/**
 * 지역 검색 처리 Controller
 * @author liamg
 *
 */
@Controller
@RequestMapping("/search/local")
public class LocalController {

	private static final Logger logger = LoggerFactory.getLogger(LocalController.class);
	
	/**
	 * 지역 페이지
	 * @return
	 */
	@RequestMapping("/page")
	public String getLocal() {
		
		return "search/local";
	}
	
	/**
	 * 지역 검색 리스트
	 * @param model
	 * @param localReqVO
	 * @return
	 */
	@RequestMapping("/getLocalList")
	public String getLocalList(ModelMap model, LocalReqVO localReqVO) {
		
		NaverSearchApi naver = new NaverSearchApi();
		
		HashMap<String, String> searchKeywords = localReqVO.getSearchKeywords();
		
		String searchInfo = naver.getSearchInfo(Constant.LOCAL_API_URL, searchKeywords);
		
		logger.info("localList");
		logger.info(searchInfo);
		model.addAttribute("localList", searchInfo);
		
		return "JsonView";
	}
	
}
