package rafaelgoncalves.easysales.domain;

public class Product {

	private String name = "";
	
	private Monetary price = Monetary.ZERO;
	
	private Product(String name, Monetary price) {
		this.name = name;
		this.price = price;
	}

	public static Product of(String name, Monetary price) {
		return new Product(name, price);
	}

	public String getName() {
		return name;
	}

	public Monetary getPrice() {
		return price;
	}

}
