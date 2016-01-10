package rafaelgoncalves.easysales;

import java.util.List;

public interface SalesRepository {

	List<Sale> findAll();
	
	void add(Sale sale);

}
