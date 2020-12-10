package search.book.web;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import base.constant.Constant;
import base.utils.NaverSearchApi;
import search.book.service.BookReqVO;

/**
 * 책 검색 처리 Controller
 * @author liamg
 *
 */
@Controller
@RequestMapping("/search/book")
public class BookController {

	private static final Logger logger = LoggerFactory.getLogger(BookController.class);
	
	/**
	 * 책 페이지
	 * @return
	 */
	@RequestMapping("/page")
	public String getBook() {
		
		return "search/book";
	}
	
	/**
	 * 책 검색 리스트
	 * @param model
	 * @param bookReqVO
	 * @return
	 */
	@RequestMapping("/getBookList")
	public String getBookList(ModelMap model, BookReqVO bookReqVO) {
		
		NaverSearchApi naver = new NaverSearchApi();
		
		HashMap<String, String> searchKeywords = bookReqVO.getSearchKeywords();
		
		String searchInfo = naver.getSearchInfo(Constant.NEWS_API_URL, searchKeywords);
		
		logger.info("bookList");
		logger.info(searchInfo);
		model.addAttribute("bookList", searchInfo);
		
		return "JsonView";
	}
	
}
