package it.akademija;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ProdList {
	@Autowired
	@Qualifier("productlist")
    private List<Product> prodlist;
    
    public ProdList() {
     
    	
    }
	public List<Product> getProdlist() {
		return this.prodlist;
	}
	public void setProdlist(List<Product> list) {
		this.prodlist = list;
	}
	
	

    


}
