package it.akademija.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableAutoConfiguration
public class ShopApplication {

	@RequestMapping("/")
	String home() {
		return "hello";
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ShopApplication.class, args) ;
	}

}
