package rafaelgoncalves.easysales.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Sale {

	private String client;
	
	private Date date;
	
	private List<Product> products = new ArrayList<>();
	
	private List<Payment> payments = new ArrayList<>();

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

	public List<Payment> getPayments() {
		return Collections.unmodifiableList(payments);
	}

	public Monetary getValue() {
		return products.stream().map(Product::getPrice).reduce(Monetary.ZERO, Monetary::sum);
	}

}
