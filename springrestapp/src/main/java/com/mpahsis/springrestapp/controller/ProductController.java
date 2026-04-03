package com.mpahsis.springrestapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.mpahsis.springrestapp.model.Product;
import com.mpahsis.springrestapp.service.ProductService;
@EnableWebMvc
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
	@Autowired
	private ProductService productService;

@GetMapping
public ResponseEntity<List<Product>> getProducts() {
	//return ResponseEntity.ok(productService.getAllProducts());
	return new ResponseEntity<List<Product>>(productService.getAllProducts(),HttpStatus.OK); 
	
}

@GetMapping("/{id}")
public ResponseEntity<Product>getProducts(@PathVariable("id")String id) {
	return new ResponseEntity<Product>(productService.getProduct(id),HttpStatus.OK); 

}

@PostMapping
		public ResponseEntity<Product> addProduct(@RequestBody Product product) {
	   
	    return new ResponseEntity<Product>(productService.addProduct(product),HttpStatus.OK);	
	    }
	


@DeleteMapping("/{id}")
    public ResponseEntity<Product> delProduct(@PathVariable("id") String id) {
        return new ResponseEntity<Product>(productService.delProduct(id), HttpStatus.OK);
    }
}

