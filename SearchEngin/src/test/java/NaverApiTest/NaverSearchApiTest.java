package NaverApiTest;

import java.util.HashMap;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import base.utils.NaverSearchApi;

/**
 * 네이버 API 테스트
 * @author liamg
 *
 */
public class NaverSearchApiTest {
	
	private static final Logger logger = LoggerFactory.getLogger(NaverSearchApiTest.class);
	
	@Test
	public void apiTest() {
		
		NaverSearchApi api = new NaverSearchApi();
		
		String url = "https://openapi.naver.com/v1/search/movie";
		
		HashMap<String, String> query_string = new HashMap<String, String>();
		query_string.put("query", "기생충");
		query_string.put("display", "100");
		query_string.put("start", "1000");
		query_string.put("country", "KR");
		query_string.put("yearfrom", "2000");
		query_string.put("yearto", "2020");
		
		String searchInfo = api.getSearchInfo(url, query_string);
		
		logger.info(searchInfo);
	}

}
