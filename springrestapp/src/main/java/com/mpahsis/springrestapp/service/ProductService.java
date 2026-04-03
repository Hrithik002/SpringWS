package com.mpahsis.springrestapp.service;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mpahsis.springrestapp.model.Product;
@Service
public class ProductService {
	private List<Product> products = new ArrayList<>();
	
	public ProductService () {
		products.add(new Product("P1","Memmory Card", 1400));
		products.add(new Product("P2","Mouse", 800));


	}
 public List<Product> getAllProducts() {
	 return products;
	 
 }
 public Product getProduct(String id) {
	 return products.stream().filter(p-> p.getId().equals(id)).findFirst().get();
	 
 }
 public Product addProduct(Product product) {
	 products.add(product);
	 return product;
 }
 public Product delProduct(String id) {
		Product p = getProduct(id);
		if(products.remove(p))
			return p;
		else
			return null;
	
	}
	
 
}
