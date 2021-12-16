package it.akademija.shop;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 

@Configuration
public class AppConfig {
	 
	
	
	@Bean
	@Qualifier("productlist")
	Product prod1() {
		return new Product("limonadas",12,22);
	}
	
 
	@Bean
	@Qualifier("productlist")
	Product prod2() {
		return new Product("alus",3,5);
	}
	
	
	@Qualifier("msg")
	@Bean
	String message() {
		return "bean message";
	}
}