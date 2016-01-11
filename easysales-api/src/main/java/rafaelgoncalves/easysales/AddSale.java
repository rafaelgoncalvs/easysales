package rafaelgoncalves.easysales;

import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

public class AddSale {

	private SalesRepository salesRepository;
	
	@Inject
	public AddSale(SalesRepository salesRepository) {
		this.salesRepository = salesRepository;
	}

	public void add(SaleDTO saleDTO) {
		List<Product> products = saleDTO.getProducts().stream().map(productDTO -> createProduct(productDTO)).collect(Collectors.toList());
		Sale sale = Sale.of(saleDTO.getClient(), saleDTO.getDate(), products);
		salesRepository.add(sale);
	}

	private Product createProduct(ProductDTO productDTO) {
		return Product.of(productDTO.getName(), productDTO.getValue());
	}
	
}
