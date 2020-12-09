package search.encyc.web;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import base.constant.Constant;
import base.utils.NaverSearchApi;
import search.encyc.service.EncycReqVO;

/**
 * 백과사전 검색 처리 Controller
 * @author liamg
 *
 */
@Controller
@RequestMapping("/search/encyc")
public class EncycController {

	private static final Logger logger = LoggerFactory.getLogger(EncycController.class);
	
	/**
	 * 백과사전 페이지
	 * @return
	 */
	@RequestMapping("/page")
	public String getEncyc() {
		
		return "search/encyc";
	}
	
	/**
	 * 백과사전 검색 리스트
	 * @param model
	 * @param encycReqVO
	 * @return
	 */
	@RequestMapping("/getEncycList")
	public String getEncycList(ModelMap model, EncycReqVO encycReqVO) {
		
		NaverSearchApi naver = new NaverSearchApi();
		
		HashMap<String, String> searchKeywords = encycReqVO.getSearchKeywords();
		
		String searchInfo = naver.getSearchInfo(Constant.Encyc_API_URL, searchKeywords);
		
		logger.info("encycList");
		logger.info(searchInfo);
		model.addAttribute("encycList", searchInfo);
		
		return "JsonView";
	}
}
