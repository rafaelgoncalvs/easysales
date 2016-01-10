package rafaelgoncalves.easysales;

import java.util.List;

public class SaleDAO implements SalesRepository {

	@Override
	public List<Sale> findAll() {
		return DataBase.getSales();
	}
	
	public void add(Sale sale) {
		DataBase.getSales().add(sale);
	}

}
