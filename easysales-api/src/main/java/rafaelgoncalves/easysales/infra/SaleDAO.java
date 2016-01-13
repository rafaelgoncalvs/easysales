package rafaelgoncalves.easysales.infra;

import java.util.List;

import rafaelgoncalves.easysales.domain.Sale;
import rafaelgoncalves.easysales.domain.SalesRepository;

public class SaleDAO implements SalesRepository {

	@Override
	public List<Sale> findAll() {
		return DataBase.getSales();
	}
	
	public void add(Sale sale) {
		DataBase.getSales().add(0, sale);
	}

}
