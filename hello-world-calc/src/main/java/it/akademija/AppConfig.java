package it.akademija;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

 

 

@ImportResource({"classpath*:application-context.xml"})
@Configuration
public class AppConfig {
	 
	
	@Qualifier("prodlist")
	@Bean
	ProdList prdlst() {
		return new ProdList();
	}
	
	 
	@Bean
	UserDao userDao() {
		return new InMemoryUserDao();
	}
	
	
	@Bean
	Product prod1() {
		return new Product("limonadas",12,22);
	}
	
 
	@Bean
	Product prod2() {
		return new Product("alus",3,5);
	}
	

	@Bean
	Product prod3() {
		return new Product("arbata",3,5);
	}
	
	
	@Qualifier("msg")
	@Bean
	String message() {
		return "bean message";
	}
}