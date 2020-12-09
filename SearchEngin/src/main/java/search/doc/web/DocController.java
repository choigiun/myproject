package search.doc.web;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import base.constant.Constant;
import base.utils.NaverSearchApi;
import search.doc.service.DocReqVO;

/**
 * 전문자료 검색 처리 Controller
 * @author liamg
 *
 */
@Controller
@RequestMapping("/search/doc")
public class DocController {

	private static final Logger logger = LoggerFactory.getLogger(DocController.class);
	
	/**
	 * 전문자료 페이지
	 * @return
	 */
	@RequestMapping("/page")
	public String getDoc() {
		
		return "search/doc";
	}
	
	/**
	 * 전문자료 검색 리스트
	 * @param model
	 * @param docReqVO
	 * @return
	 */
	@RequestMapping("/getDocList")
	public String getDocList(ModelMap model, DocReqVO docReqVO) {
		
		NaverSearchApi naver = new NaverSearchApi();
		
		HashMap<String, String> searchKeywords = docReqVO.getSearchKeywords();
		
		String searchInfo = naver.getSearchInfo(Constant.DOC_API_URL, searchKeywords);
		
		logger.info("docList");
		logger.info(searchInfo);
		model.addAttribute("docList", searchInfo);
		
		return "JsonView";
	}	
	
}
