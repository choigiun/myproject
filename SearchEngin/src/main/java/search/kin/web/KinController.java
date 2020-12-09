package search.kin.web;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import base.constant.Constant;
import base.utils.NaverSearchApi;
import search.kin.service.KinReqVO;

/**
 * 지식 iN 검색 처리 Controller
 * @author liamg
 *
 */
@Controller
@RequestMapping("/search/kin")
public class KinController {
	
	private static final Logger logger = LoggerFactory.getLogger(KinController.class);
	
	/**
	 * 지식 iN 페이지
	 * @return
	 */
	@RequestMapping("/page")
	public String getKin() {
		
		return "search/kin";
	}
	
	/**
	 * 지식 iN 검색 리스트
	 * @param model
	 * @param kinReqVO
	 * @return
	 */
	@RequestMapping("/getKinList")
	public String getKinList(ModelMap model, KinReqVO kinReqVO) {
		
		NaverSearchApi naver = new NaverSearchApi();
		
		HashMap<String, String> searchKeywords = kinReqVO.getSearchKeywords();
		
		String searchInfo = naver.getSearchInfo(Constant.Kin_API_URL, searchKeywords);
		
		logger.info("kinList");
		logger.info(searchInfo);
		model.addAttribute("kinList", searchInfo);
		
		return "JsonView";
	}

}
