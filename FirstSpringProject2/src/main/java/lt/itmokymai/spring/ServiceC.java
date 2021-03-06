package lt.itmokymai.spring;

import java.util.List;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ServiceC extends ServiceA{
	@Autowired
	@Qualifier("productlist")
	private List<Object> productList;
	@Autowired
	@Qualifier("prodlist")
    ProdList pl;
	
	@Autowired
	Spausdintuvas sp;
	
	public ServiceC() {
		super();
	}
	
 
	@Override
	public String getResult() {
		return "ServiceC result: " + getMessage();
	}
	public List<Object> getProducts() {
		return this.productList;
	}
	public void setProductList(List<Object> list) {
		this.productList = list;
	}
	
	public ProdList getPl() {
	 	return this.pl;
	 }
	
 	public void setPl(ProdList prodlist) {
 		this.pl = prodlist;
 	}

 	
 	public String spaudsinti() {
 		return sp.getProductTitles(pl);
 	}
}
