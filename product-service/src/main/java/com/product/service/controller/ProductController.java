package com.product.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.service.entity.Product;
import com.product.service.servise.ProductService;
import com.product.service.util.ApiResponse;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping
	public ResponseEntity<ApiResponse> create(@RequestBody Product product){
		return new ResponseEntity<ApiResponse>(new ApiResponse(false, "success", productService.create(product)), HttpStatus.CREATED);	
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ApiResponse> getById(@PathVariable long id){
		return new ResponseEntity<ApiResponse>(new ApiResponse(false, "success", productService.getById(id)), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<ApiResponse> getAll(){
		return new ResponseEntity<ApiResponse>(new ApiResponse(false, "success", productService.getAll()), HttpStatus.OK);
	}
	
}
