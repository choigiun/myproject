package search.errata.web;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import base.constant.Constant;
import base.utils.NaverSearchApi;
import search.errata.service.ErrataReqVO;

/**
 * 오타변환 검색 처리 Controller
 * @author liamg
 *
 */
@Controller
@RequestMapping("/search/errata")
public class ErrataController {
	
	private static final Logger logger = LoggerFactory.getLogger(ErrataController.class);

	/**
	 * 오타변환 페이지
	 * @return
	 */
	@RequestMapping("/page")
	public String getErrata() {
		
		return "search/errata";
	}
	
	/**
	 * 오타변환 검색 리스트
	 * @param model
	 * @param errataReqVO
	 * @return
	 */
	@RequestMapping("/getErrataList")
	public String getErrataList(ModelMap model, ErrataReqVO errataReqVO) {
		
		NaverSearchApi naver = new NaverSearchApi();
		
		HashMap<String, String> searchKeywords = errataReqVO.getSearchKeywords();
		
		String searchInfo = naver.getSearchInfo(Constant.ERRATA_API_URL, searchKeywords);
		
		logger.info("errataList");
		logger.info(searchInfo);
		model.addAttribute("errataList", searchInfo);
		
		return "JsonView";
	}
	
}
