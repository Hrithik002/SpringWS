package com.mphasis.springjdbcapp.dao;

import java.util.List;
import com.mphasis.springjdbcapp.model.Product;

public interface ProductRepository {

    void save(Product product);
    Product findById(int id);
    List<Product> findAll();

    void update(Product product);

    void deleteById(int id);
    List<Product> findByName(String name);
}
