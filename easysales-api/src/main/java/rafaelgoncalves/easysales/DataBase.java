package rafaelgoncalves.easysales;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DataBase {

	private static DataBase dataBase;
	
	private List<Sale> sales = new ArrayList<>();
	
	public DataBase() {
		if(dataBase == null) {
			dataBase = new DataBase();
			dataBase.sales.add(Sale.of("Client of Test", new Date(), Arrays.asList(Product.of("Jeans", BigDecimal.valueOf(100.0)))));
		}
	}

	public static DataBase getInstance() {
		return dataBase;
	}

	public static List<Sale> getSales() {
		return getInstance().sales;
	}

}
