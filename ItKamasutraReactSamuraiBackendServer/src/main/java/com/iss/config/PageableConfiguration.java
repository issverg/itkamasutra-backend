package com.iss.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Pageable;

@Configuration
public class PageableConfiguration {
	
	@Bean
	public Pageable getPageable() {
		return Pageable.unpaged();
	}
}
