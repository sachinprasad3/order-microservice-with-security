package com.product.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.service.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long>{

}
