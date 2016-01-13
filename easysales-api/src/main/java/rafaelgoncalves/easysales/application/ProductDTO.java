package rafaelgoncalves.easysales.application;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProductDTO {

	private String name;
	
	private BigDecimal value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setPrice(BigDecimal value) {
		this.value = value;
	}
	
}
