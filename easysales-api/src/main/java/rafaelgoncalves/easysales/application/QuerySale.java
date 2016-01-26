package rafaelgoncalves.easysales.application;

import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import rafaelgoncalves.easysales.domain.Payment;
import rafaelgoncalves.easysales.domain.Product;
import rafaelgoncalves.easysales.domain.Sale;
import rafaelgoncalves.easysales.domain.SalesRepository;

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
		saleDTO.setValue(sale.getValue().get());
		saleDTO.setProducts(sale.getProducts().stream().map(product -> createProduct(product)).collect(Collectors.toList()));
		saleDTO.setPayments(sale.getPayments().stream().map(payment -> createPayment(payment)).collect(Collectors.toList()));
		return saleDTO;
	}

	private ProductDTO createProduct(Product product) {
		ProductDTO productDTO = new ProductDTO();
		productDTO.setName(product.getName());
		productDTO.setPrice(product.getPrice().get());
		return productDTO;
	}
	
	private PaymentDTO createPayment(Payment payment) {
		PaymentDTO paymentDTO = new PaymentDTO();
		paymentDTO.setDate(payment.getDate());
		paymentDTO.setValue(payment.getValue().get());
		return paymentDTO;
	}
}
