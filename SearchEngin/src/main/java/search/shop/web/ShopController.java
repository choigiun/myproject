package search.shop.web;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import base.constant.Constant;
import base.utils.NaverSearchApi;
import search.news.web.NewsController;
import search.shop.service.ShopReqVO;

/**
 * 쇼핑 검색 처리 Controller
 * @author liamg
 *
 */
@Controller
@RequestMapping("/search/shop")
public class ShopController {

	private static final Logger logger = LoggerFactory.getLogger(NewsController.class);
	
	/**
	 * 쇼핑 페이지
	 * @return
	 */
	@RequestMapping("/page")
	public String getShop() {
		
		return "search/shop";
	}
	
	/**
	 * 쇼핑 검색 리스트
	 * @param model
	 * @param shopReqVO
	 * @return
	 */
	@RequestMapping("/getShopList")
	public String getShopList(ModelMap model, ShopReqVO shopReqVO) {
		
		NaverSearchApi naver = new NaverSearchApi();
		
		HashMap<String, String> searchKeywords = shopReqVO.getSearchKeywords();
		
		String searchInfo = naver.getSearchInfo(Constant.SHOP_API_URL, searchKeywords);
		
		logger.info("shopList");
		logger.info(searchInfo);
		model.addAttribute("shopList", searchInfo);
		
		return "JsonView";
	}	
	
}
