package lt.itmokymai.spring;

import org.springframework.beans.factory.annotation.Qualifier;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Qualifier("serviceA")
	@Bean
	public ServiceA beanServiceA() {
		return new ServiceA();
	}
	
	@Bean 
	ServiceB beanServiceB() {
		return new ServiceB();
	}

	@Qualifier("serviceC")
	@Bean
	ServiceC serviceC() {
		return new ServiceC();
	}
	
	@Qualifier("prodlist")
	@Bean
	ProdList prdlst() {
		return new ProdList();
	}
	
	 
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
	
	@Bean
	BeanProcessor beanProcessor() {
		return new BeanProcessor();
	}
	@Qualifier("msg")
	@Bean
	String message() {
		return "bean message";
	}
}
