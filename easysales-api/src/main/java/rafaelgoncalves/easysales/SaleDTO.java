package rafaelgoncalves.easysales;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SaleDTO {

	private Date date;
	
	private String client;
	
	private BigDecimal value;
	
	private List<ProductDTO> productsDTOs;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public List<ProductDTO> getProductsDTOs() {
		return productsDTOs;
	}

	public void setProductsDTOs(List<ProductDTO> productsDTOs) {
		this.productsDTOs = productsDTOs;
	}
	
}
