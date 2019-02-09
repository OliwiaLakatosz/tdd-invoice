package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {
	private Collection<Product> products = new ArrayList<Product>();
	
	// Map<Product, Integer>

	public void addProduct(Product product) {
//		this.products.add(product);
		this.addProduct(product, 1);
		// metoda przeciążona
	}
	
	public void addProduct(Product product, Integer quantity) {
//		product.getPrice().multiply(new BigDecimal(quantity));
//		Product prod = new Product(product.getName(), 
//				product.getPrice().multiply(new BigDecimal(quantity)), 
//				product.getTaxPercent());
//		products.add(prod);
		for (int i = 0; i < quantity; i++) {
			this.products.add(product);
		}
	}
		

	public BigDecimal getTotalNetPrice() {
		BigDecimal subtotal = BigDecimal.ZERO;
		for (Product product : products) {
			subtotal = subtotal.add(product.getPrice());
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
