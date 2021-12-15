package lt.itmokymai.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;


public class ServiceA implements DisposableBean{

	private String message;
	
	public String getResult() {
		return getMessage();
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String msg) {
	
		this.message = msg;
	}
	
	public void destroy() { 
		    System.out.println("Destroy : ");
		 
		
	}
	
	 
	public void preDestroy() {
		System.out.println("pre-destroy");
	}
	
	
}
