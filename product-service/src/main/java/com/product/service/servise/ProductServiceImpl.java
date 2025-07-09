package com.product.service.servise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.service.entity.Product;
import com.product.service.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepo productRepo;
	
	@Override
	public Product create(Product product) {
		return productRepo.save(product);
	}

	@Override
	public Product getById(long id) {
		return productRepo.findById(id).orElseThrow(()->new RuntimeException("Product not found with id : "+ id));
	}

	@Override
	public List<Product> getAll() {
		return productRepo.findAll();
	}

}
