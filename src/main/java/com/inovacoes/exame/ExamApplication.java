package com.inovacoes.exame;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.oxm.xstream.XStreamMarshaller;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ExamApplication {
	public static void main(String[] args) {
		SpringApplication.run(ExamApplication.class, args);
	}

    //bean later
	
	@Configuration
	public class WebConfig implements WebMvcConfigurer {
	  public void configureContentNegotiation(final ContentNegotiationConfigurer configurer) {
	    configurer.defaultContentType(MediaType.APPLICATION_XML);
	  }
	}

}