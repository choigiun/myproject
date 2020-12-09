package search.adult.service;

import java.lang.reflect.Field;
import java.util.HashMap;

import base.utils.ObjInfoTrans;

/**
 * 성인 검색어 판별 검색 요청 변수
 * @author liamg
 *
 */
public class AdultReqVO implements ObjInfoTrans {

	private String query;

	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	
	@Override
	public HashMap<String, String> getSearchKeywords() {
		
		Field[] fields = this.getClass().getDeclaredFields();
		HashMap<String, String> query_string = new HashMap<String, String>();
		
		for(int i=0; i<fields.length; i++) {
			
			try {
				if((String)fields[i].get(this) != null) {
					query_string.put(fields[i].getName(), (String)fields[i].get(this));	
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return query_string;
	}
	
}
