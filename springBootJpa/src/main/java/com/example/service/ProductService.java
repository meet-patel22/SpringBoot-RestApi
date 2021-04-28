package com.example.service;

import java.util.List;

import com.example.model.Product;

public interface ProductService 
{
	Product createProduct(Product product);
	
	Product updateProduct(Product product);
	
	List< Product > getAllProduct();
	
	Product getProductById(long productId);
	
	void deleteProduct(long productid);
	
	

}
