package com.ednilson.prova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.ednilson.prova.controller.TokenFilter;

@SpringBootApplication
public class ProvaApplication {

	@Bean
	public FilterRegistrationBean<TokenFilter> filterJwt() {
		FilterRegistrationBean<TokenFilter> frb = new FilterRegistrationBean<>();
		frb.setFilter(new TokenFilter());
		frb.addUrlPatterns("/operadores/*");
		return frb;
	}

	public static void main(String[] args) {
		SpringApplication.run(ProvaApplication.class, args);
	}

}
