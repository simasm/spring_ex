package lt.itmokymai.spring;

import org.springframework.beans.BeansException;
 import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;

public class BeanProcessor implements DestructionAwareBeanPostProcessor{
	@Override
	public Object postProcessBeforeInitialization(Object bean, 
		      String beanName) throws BeansException { 
		    System.out.println("BeforeInitialization : " + beanName); 
		    
		    return bean; // you can return any other object as well 
		  }
	 
	
	@Override
	public Object postProcessAfterInitialization(Object bean, 
		      String beanName) throws BeansException { 
		    System.out.println("After : " + beanName); 
		    if(bean instanceof Product )
		    {
		    	System.out.println("postprocessor:");
		    	Product p = (Product) bean;
		    	System.out.println(p.getTitle());
		    }
		    return bean; // you can return any other object as well 
		  }
	


	@Override
	public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
		System.out.println("AfterDestr : " + beanName); 
		  
	 
		
	}
}
