package rafaelgoncalves.easysales;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/sale")
public class SaleService {

	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<SaleDTO> people() {
		SaleDTO saleDTO = new SaleDTO();
		saleDTO.setClient("Rafael");
		saleDTO.setDate(new Date());
		saleDTO.setValue(BigDecimal.valueOf(34.60));
		ProductDTO productDTO = new ProductDTO();
		productDTO.setName("Calça");
		productDTO.setValue(BigDecimal.valueOf(34.60));
		saleDTO.setProducts(Arrays.asList(productDTO));
		return Arrays.asList(saleDTO);
    }
	
}
