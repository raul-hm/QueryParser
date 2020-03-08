package com.iexpertos.queryparser.tests;

public class QueryParser {
	
	public String Parse(String query) {
		
		if (query.endsWith("s")||query.endsWith("S")){
			query=query.substring(0, query.length()-1);
		}
		return (query.trim().toLowerCase());
	}

}
