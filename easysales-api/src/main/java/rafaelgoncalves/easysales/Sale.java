package rafaelgoncalves.easysales;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Sale {

	private String client;
	
	private Date date;
	
	private List<Product> products = new ArrayList<>();

	private Sale(String client, Date date, List<Product> products) {
		this.client = client;
		this.date = date;
		this.products = products;
	}

	public static Sale of(String client, Date date, List<Product> products) {
		return new Sale(client, date, products);
	}

	public String getClient() {
		return this.client;
	}

	public Date getDate() {
		return date;
	}

	public List<Product> getProducts() {
		return Collections.unmodifiableList(products);
	}

	public BigDecimal value() {
		return products.stream().map(Product::getValue).reduce(BigDecimal.ZERO, BigDecimal::add);
	}

}
