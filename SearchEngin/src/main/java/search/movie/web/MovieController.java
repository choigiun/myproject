package search.movie.web;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import base.constant.Constant;
import base.utils.NaverSearchApi;
import search.movie.service.MovieReqVO;

/**
 * 영화 검색 처리 Controller
 * @author liamg
 *
 */
@Controller
@RequestMapping("/search/movie")
public class MovieController {
	
	private static final Logger logger = LoggerFactory.getLogger(MovieController.class);
	
	/**
	 * 영화 페이지
	 * @return
	 */
	@RequestMapping("/page")
	public String getMovie() {
		
		return "search/movie";
	}
	
	/**
	 * 영화 검색 리스트
	 * @param model
	 * @param movieReqVO
	 * @return
	 */
	@RequestMapping("/getMovieList")
	public String getMovieList(ModelMap model, MovieReqVO movieReqVO) {
		
		NaverSearchApi naver = new NaverSearchApi();
		
		HashMap<String, String> searchKeywords = movieReqVO.getSearchKeywords();
		
		String searchInfo = naver.getSearchInfo(Constant.MOVIE_API_URL, searchKeywords);
		
		logger.info("movieList");
		logger.info(searchInfo);
		model.addAttribute("movieList", searchInfo);
		
		return "JsonView";
	}
	

}
