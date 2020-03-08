package com.iexpertos.queryparser.tests;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

class QueryParserShould {

	
	@Test()
	void parsea_un_token_en_string_de_una_palabra() {
		
		QueryParser queryparser = new QueryParser();
		
		String valor = queryparser.Parse("teacher");
		
		assertThat(valor, is("teacher"));
	}
	
	@Test()
	void parsea_un_token_en_string_de_una_palabra_con_espacios() {
		
		QueryParser queryparser = new QueryParser();
		
		String valor = queryparser.Parse("   teacher");
		
		assertThat(valor, is("teacher"));
	}
}
