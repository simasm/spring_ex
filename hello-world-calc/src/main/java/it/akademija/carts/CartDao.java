package it.akademija.carts;

import java.util.List;
import java.util.Map;

public interface CartDao {

	Map<String, List<Long>> getCarts();

	void addCart(String username, List<Long> cart);

	void removeCart(String username);
}
