package rafaelgoncalves.easysales;

import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

public class QuerySale {

	private SalesRepository salesRepository;

	@Inject
	public QuerySale(SalesRepository salesRepository) {
		this.salesRepository = salesRepository;
	}

	public List<SaleDTO> findAll() {
		List<Sale> sales = salesRepository.findAll();
		return sales.stream().map(sale -> createSale(sale)).collect(Collectors.toList());
	}

	private SaleDTO createSale(Sale sale) {
		SaleDTO saleDTO = new SaleDTO();
		saleDTO.setClient(sale.getClient());
		saleDTO.setDate(sale.getDate());
		saleDTO.setValue(sale.value());
		saleDTO.setProducts(sale.getProducts().stream().map(product -> createProduct(product)).collect(Collectors.toList()));
		return saleDTO;
	}

	private ProductDTO createProduct(Product product) {
		ProductDTO productDTO = new ProductDTO();
		productDTO.setName(product.getName());
		productDTO.setValue(product.getValue());
		return productDTO;
	}
}
