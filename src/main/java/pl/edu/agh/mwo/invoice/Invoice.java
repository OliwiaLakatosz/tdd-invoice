package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;


import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {
	private Collection<Product> products = new ArrayList<Product>();

	public void addProduct(Product product) {
		// Product(String name, BigDecimal price, BigDecimal tax)
		products.add(product);
	}

	public void addProduct(Product product, Integer quantity) {
//		product.getPrice().multiply(new BigDecimal(quantity));
//		Product prod = new Product(product.getName(), 
//				product.getPrice().multiply(new BigDecimal(quantity)), 
//				product.getTaxPercent());
//		products.add(prod);
	}
		

	public BigDecimal getSubtotal() {
		BigDecimal subtotal = BigDecimal.ZERO;
		if (products.isEmpty()) {
			return subtotal = BigDecimal.ZERO;
		}
		return subtotal;
	}

	public BigDecimal getTax() {
		return BigDecimal.ZERO;
	}

	public BigDecimal getTotal() {
		return BigDecimal.ZERO;
	}
}
