package search.image.web;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import base.constant.Constant;
import base.utils.NaverSearchApi;
import search.image.service.ImageReqVO;

/**
 * 이미지 검색 처리 Controller
 * @author liamg
 *
 */
@Controller
@RequestMapping("/search/image")
public class ImageController {

	private static final Logger logger = LoggerFactory.getLogger(ImageController.class);
	
	/**
	 * 이미지 페이지
	 * @return
	 */
	@RequestMapping("/page")
	public String getImage() {
		
		return "search/image";
	}
	
	/**
	 * 이미지 검색 리스트
	 * @param model
	 * @param movieVO
	 * @return
	 */
	@RequestMapping("/getImageList")
	public String getImageList(ModelMap model, ImageReqVO imageReqVO) {
		
		NaverSearchApi naver = new NaverSearchApi();
		
		HashMap<String, String> searchKeywords = imageReqVO.getSearchKeywords();
		
		String searchInfo = naver.getSearchInfo(Constant.IMAGE_API_URL, searchKeywords);
		
		logger.info("imageList");
		logger.info(searchInfo);
		model.addAttribute("imageList", searchInfo);
		
		return "JsonView";
	}	
	
}
