package rafaelgoncalves.easysales.domain;

import java.math.BigDecimal;

public class Monetary {

	public static final Monetary ZERO = Monetary.empty();
	
	private BigDecimal value = BigDecimal.ZERO;
	
	private Monetary(BigDecimal value) {
		this.value = value;
	}

	public static Monetary of(BigDecimal value) {
		return new Monetary(value);
	}
	
	public static Monetary of(double value) {
		return new Monetary(BigDecimal.valueOf(value));
	}
	
	private static Monetary empty() {
		return new Monetary(BigDecimal.ZERO);
	}
	
	public Monetary sum(Monetary monetary) {
		BigDecimal newValue = value.add(monetary.get());
		return Monetary.of(newValue);
	}
	
	public BigDecimal get() {
		return value;
	}
}
