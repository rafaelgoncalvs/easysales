package rafaelgoncalves.easysales.infra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import rafaelgoncalves.easysales.domain.Monetary;
import rafaelgoncalves.easysales.domain.Product;
import rafaelgoncalves.easysales.domain.Sale;

public class DataBase {

	private static DataBase dataBase;
	
	private List<Sale> sales = new ArrayList<>();
	
	private DataBase() {
	}

	public static DataBase getInstance() {
		if(dataBase == null) {
			dataBase = new DataBase();
			dataBase.sales.add(Sale.of("Client of Test", new Date(), Arrays.asList(Product.of("Jeans", Monetary.of(100.0)))));
		}
		return dataBase;
	}

	public static List<Sale> getSales() {
		return getInstance().sales;
	}

}
