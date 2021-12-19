package lt.itmokymai.spring;

 

public class Product {

	private long quantity;
	private double price;
	private String title;
	
	public Product() {
		
	}
	public Product(String title, long quantity, double price) {
		super();
		this.title = title;
		this.quantity = quantity;
		this.price = price;
	}
	
	
	public String getTitle() {
		return title;
	}
	
	 
	public void setProduct( long quant,
							double price, 
							String title ) {
		this.quantity = quant;
		this.price = price;
		this.title = title;
	}
	 
 
	public void setTitle(String title) {
		this.title = title;
	}
	public long getQuantity() {
		return quantity;
	}
 	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
 	public void setPrice(double price) {
		this.price = price;
	}
}
