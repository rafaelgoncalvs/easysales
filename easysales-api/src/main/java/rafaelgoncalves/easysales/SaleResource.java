package rafaelgoncalves.easysales;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/sales")
public class SaleResource {

	@Inject
	private QuerySale querySale;
	
	@Inject
	private AddSale addSale;
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<SaleDTO> findSales() {
		List<SaleDTO> salesDTOs = querySale.findAll();
		return salesDTOs;
    }
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addSale(SaleDTO saleDTO) {
		addSale.add(saleDTO);
		return Response.status(201).entity(saleDTO).build();
	}
	
}
