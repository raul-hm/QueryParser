package com.iexpertos.queryparser.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class QueryParserShould {
	
	QueryParser queryparser;
	
	@BeforeEach
	public void setUp() {
		queryparser = new QueryParser();
	}
	
	@ParameterizedTest()
	@CsvSource({"teacher,teacher","'    teacher    ',teacher","TEACHER,teacher","'tEaCHer   ',teacher"})
	
	void parsea_un_token_en_string_de_una_palabra_contemplando_mayúsculas_y_espacios_en_blanco_y_plurales(String Valor, String ValorEsperado) {
		
		String resultado = queryparser.Parse(Valor);
		
		assertThat(resultado, is(ValorEsperado));
	}
	
	@Test()
	void parsea_un_token_en_string_de_una_palabra_en_plural_y_minúsculas() {
		
		String resultado = queryparser.Parse("teachers");
		
		assertThat(resultado,is("teacher"));
	}
}
