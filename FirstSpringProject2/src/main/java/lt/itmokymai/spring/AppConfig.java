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
	ProdList beanProdList() {
		return new ProdList();
	}
	
	
	@Bean
	Product prod1() {
		return new Product();
	}
}
