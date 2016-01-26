package rafaelgoncalves.easysales.domain;

import java.util.Date;

public class Payment {
	
	private Date date;
	
	private Monetary value;
	
	private Integer codeOfInstallment;

	private Payment(Date date, Monetary value) {
		this.date = date;
		this.value = value;
	}
	
	public static Payment of(Date date, Monetary value) {
		return new Payment(date, value);
	}

	public Date getDate() {
		return date;
	}

	public Monetary getValue() {
		return value;
	}
	
}
