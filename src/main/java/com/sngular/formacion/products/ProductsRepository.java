package com.sngular.formacion.products;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sngular.formacion.products.dto.Product;

public interface ProductsRepository extends MongoRepository<Product, String>{

	List<Product> findAllByName(String name);
	
	List<Product> finAllByPriceGreaterThan(Double price);
}
