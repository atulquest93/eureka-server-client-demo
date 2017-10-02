package com.orders.restclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.orders.dto.Details;

@FeignClient("details-service")
public interface DetailsRestClient {
	
	@GetMapping("/detailses/{idProduct}")
    Resources<Details> readDetails(@PathVariable("idProduct") long id);

}
