package rafaelgoncalves.easysales;

import java.math.BigDecimal;

public class Product {

	private String name;
	
	private BigDecimal value;

	private Product(String name, BigDecimal value) {
		this.name = name;
		this.value = value;
	}

	public static Product of(String name, BigDecimal value) {
		return new Product(name, value);
	}

	public String getName() {
		return name;
	}

	public BigDecimal getValue() {
		return value;
	}

}
