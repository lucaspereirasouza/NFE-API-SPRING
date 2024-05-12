package com.inovacoes.exame;

import java.awt.image.BufferedImage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.BufferedImageHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ExamApplication {
	public static void main(String[] args) {
		SpringApplication.run(ExamApplication.class, args);
	}

    @Bean
    HttpMessageConverter<BufferedImage> createImageHttpMessageConverter() {
	    return new BufferedImageHttpMessageConverter();
	}
	
	@Configuration
	class WebConfig implements WebMvcConfigurer {
	  public void configureContentNegotiation(final ContentNegotiationConfigurer configurer) {
	    configurer.defaultContentType(MediaType.APPLICATION_XML);
	  }
	}
	
//	@Configuration
//	@EnableMethodSecurity(
//	  prePostEnabled = true, 
//	  securedEnabled = true, 
//	  jsr250Enabled = true)
//	public class MethodSecurityConfig extends GlobalMethodSecurityConfiguration{
//		
//	}
}