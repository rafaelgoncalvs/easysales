package rafaelgoncalves.easysales.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import rafaelgoncalves.easysales.application.QueryPayment;

@Path("/payments")
public class PaymentResource {

	private QueryPayment queryPayment; 
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public void findPayments(Integer saleId) {
		queryPayment.find(saleId);
	}
	
}
