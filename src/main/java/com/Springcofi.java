package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com")
public class Springcofi {
	
	@Bean
	public InternalResourceViewResolver add() {
		
		InternalResourceViewResolver i=new InternalResourceViewResolver();
		i.setSuffix(".jsp");
		i.setPrefix("/view/");
		return i;
		
	}

}
