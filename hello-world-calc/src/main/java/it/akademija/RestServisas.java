package it.akademija;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestServisas {
	
	@Autowired
	private ProdList prodlist;
	
	@RequestMapping("/productCollection")
 	public String productCollection() {
		return "["+prodlist.getProdlist()
				.stream()
				.map(product -> product.getTitle() + " ")
				.reduce("", String::concat) +"]";
		
		
	 }
 	
	
}
