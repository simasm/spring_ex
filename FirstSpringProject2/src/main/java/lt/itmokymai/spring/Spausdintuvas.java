package lt.itmokymai.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service 
@Scope(value="singleton")
public class Spausdintuvas {
	
	public void spausdintiProduktus(ProdList pl) {
		pl.getProdlist()
		.stream()
		.forEach(product -> System.out.println("spausdintuvas: " +
		product.getTitle()));
	}
	public String getProductTitles(ProdList pl) {
		return pl.getProdlist().stream()
				.map(product -> product.getTitle())
				.reduce("",String::concat);
	}

}
