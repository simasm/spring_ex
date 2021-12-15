package lt.itmokymai.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class ServiceB {
	
	@Qualifier("serviceA")
	@Autowired
 	ServiceA serviceA;
	
 	
	 
	public ServiceB () {
		
	}
 
	 
    public ServiceB (ServiceA serviceA) {
    	System.out.println("const call");
    	this.serviceA = serviceA;
    } 
	
    public void setServiceA(ServiceA serviceA) {
    	System.out.println("s-------etter call");
    	this.serviceA = serviceA;
    }
	public String getResult() {
		return "from b " + this.serviceA.getResult();
	}
	

}
