package lt.itmokymai.spring;

 import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
 import org.springframework.stereotype.Component;

@Component
public class ServiceA implements DisposableBean{

	@Qualifier("msg")
	@Autowired
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
