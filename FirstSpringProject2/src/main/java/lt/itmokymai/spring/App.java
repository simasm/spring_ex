package lt.itmokymai.spring;
import java.util.List;
 
import org.springframework.context.ApplicationContext; 
import org.springframework.context.ConfigurableApplicationContext;
 import org.springframework.context.support.ClassPathXmlApplicationContext; 
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
 
   	ApplicationContext context = new ClassPathXmlApplicationContext (
   			"application-context.xml");
    //veikia ir su annotationconfigctxx
//    	ApplicationContext context = new AnnotationConfigApplicationContext(
//    			AppConfig.class);
//    			
//    	ServiceA serviceA = (ServiceA) context.getBean("serviceA");
//    	ServiceB serviceB = (ServiceB) context.getBean("serviceB");
//    	System.out.println(serviceB.getResult());
    	ServiceC serviceC = (ServiceC) context.getBean("serviceC");
    	System.out.println(serviceC.getResult());
    	
    	List<Object> pl = serviceC.getProducts();
    //	pl.add( context.getBean("product2"));
    
    	//class' serviceC list
    	System.out.println("===products==="); 
 
     
    	pl.stream()
    		.map(product -> (Product)product)
    		.forEach(pprod -> System.out.println(pprod.getTitle()));
    	
    	System.out.println("===products===");
    	
    	//class prodlist list
    	System.out.println("===prodlist===");
    	
    	ProdList prodlist = (ProdList) context.getBean("prdlst");
    	prodlist.getProdlist()
    		.forEach(prod->System.out.println(prod.getTitle() + " " +
    	prod.getPrice()));
    	System.out.println("===prodlist===");
    	
    	//class serviceC productlist list
    	System.out.println("+++ServiceC pl+++");
    	 	serviceC.pl.getProdlist()
    	 	.forEach(prod->System.out.println(prod.getTitle()+ 
    	 			" "+prod.getQuantity()));
    	System.out.println("+++ServiceC pl+++"); 
    	
    	System.out.println("-----spausdintuvas----");
    	serviceC.sp.spausdintiProduktus(serviceC.getPl());
    	System.out.println(serviceC.spaudsinti());
    	((ConfigurableApplicationContext) context).close();
    	
    	
    			
    }
}
