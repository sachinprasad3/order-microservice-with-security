package com.product.service.servise;

import java.util.List;

import com.product.service.entity.Product;

public interface ProductService {
	
	public Product create(Product product);
	
	public Product getById(long id);
	
	public List<Product> getAll();
	
	
}
