package com.orders;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.orders.dto.Details;
import com.orders.restclient.DetailsRestClient;

@RestController
public class OrdersApiController {
	
	private DetailsRestClient detailsRestClient;

	public OrdersApiController(DetailsRestClient detailsRestClient) {
		super();
		this.detailsRestClient = detailsRestClient;
	}
	
	@GetMapping("/Order/{idProduct}")
    public Collection<Details> details(@PathVariable("idProduct") long id) {
       return detailsRestClient.readDetails(id).getContent();
    }

}
