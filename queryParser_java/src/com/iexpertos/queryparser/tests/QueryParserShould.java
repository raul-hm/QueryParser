package com.iexpertos.queryparser.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class QueryParserShould {
	
	QueryParser queryparser;
	
	@BeforeEach
	public void setUp() {
		queryparser = new QueryParser();
	}
	
	@Test
	void parsea_un_token_en_string_de_una_palabra() {
		
		
		String valor = queryparser.Parse("teacher");
		
		assertThat(valor, is("teacher"));
	}
	
	@Test
	void parsea_un_token_en_string_de_una_palabra_con_espacios() {
		
		String valor = queryparser.Parse("   teacher");
		
		assertThat(valor, is("teacher"));
	}
	
	@Test
	void parsea_un_token_en_string_de_una_palabra_en_mayúsculas_sin_espacios() {
		
		String valor =queryparser.Parse("TEACHER");
		
		assertThat(valor,is("teacher"));
	}
}
