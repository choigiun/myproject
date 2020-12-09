package search.adult.web;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import base.constant.Constant;
import base.utils.NaverSearchApi;
import search.adult.service.AdultReqVO;

/**
 * 성인 검색어 판별 검색 처리 Controller
 * @author liamg
 *
 */
@Controller
@RequestMapping("/search/adult")
public class AdultController {

	private static final Logger logger = LoggerFactory.getLogger(AdultController.class);
	
	/**
	 * 성인 검색어 판별 페이지
	 * @return
	 */
	@RequestMapping("/page")
	public String getAdult() {
		
		return "search/adult";
	}
	
	/**
	 * 성인 검색어 판별 검색 리스트
	 * @param model
	 * @param adultReqVO
	 * @return
	 */
	@RequestMapping("/getAdultList")
	public String getAdultList(ModelMap model, AdultReqVO adultReqVO) {
		
		NaverSearchApi naver = new NaverSearchApi();
		
		HashMap<String, String> searchKeywords = adultReqVO.getSearchKeywords();
		
		String searchInfo = naver.getSearchInfo(Constant.ADULT_API_URL, searchKeywords);
		
		logger.info("adultList");
		logger.info(searchInfo);
		model.addAttribute("adultList", searchInfo);
		
		return "JsonView";
	}
}
