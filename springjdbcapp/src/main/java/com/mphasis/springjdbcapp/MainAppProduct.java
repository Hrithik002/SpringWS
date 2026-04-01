package com.mphasis.springjdbcapp;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mphasis.springjdbcapp.config.SpringConfig;
import com.mphasis.springjdbcapp.dao.ProductRepository;
import com.mphasis.springjdbcapp.model.Product;

public class MainAppProduct {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        ProductRepository repo = context.getBean(ProductRepository.class);

        repo.save(new Product("Laptop", 999.99, 10));
        repo.save(new Product("Mouse", 25.50, 50));
        repo.save(new Product("Keyboard", 25.50, 50));



        Product p1 = repo.findById(1);
        System.out.println("Find by ID: " + p1);
        
        List<Product> products = repo.findAll();
        System.out.println("All Products:");
        products.forEach(System.out::println);

        p1.setPrice(899.99);
        repo.update(p1);

        System.out.println("Products containing 'Mo':");
        repo.findByName("Mo").forEach(System.out::println);
        
        repo.deleteById(3);

        context.close();
    }
}