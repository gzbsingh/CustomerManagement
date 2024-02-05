//package com.CustomerManagement.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//@Configuration
//@EnableWebMvc
//public class WebConfig  implements WebMvcConfigurer{
//	 @Override
//	 public void addCorsMappings(CorsRegistry registry) {
//	        registry.addMapping("/api/**")
//	        .allowedOriginPatterns("*")  // Added  frontend origin here
//	                .allowedMethods("GET", "POST", "PUT", "DELETE")
//	                .allowedHeaders("Authorization", "Content-Type")
//	                .allowCredentials(true);
//	    }
//}
