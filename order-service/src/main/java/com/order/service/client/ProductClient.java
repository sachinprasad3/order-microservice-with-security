package com.order.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.order.service.dto.ProductDto;
import com.order.service.util.ApiResponse2;

@FeignClient(name = "product-service", path = "/api/v1/products")
public interface ProductClient {
	
	@GetMapping("/{id}")
	public ApiResponse2<ProductDto> getById(@PathVariable long id);
}
