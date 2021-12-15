package lt.itmokymai.spring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;


public class BeanPrinter {
	
	
	@Autowired
	ApplicationContext appctx;

	
	public void printBeans() {
		
		System.out.println("beans " +Arrays.asList(
				
				appctx.getBeanDefinitionNames()));
	}
}
