package com.mphasis.springjdbcapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mphasis.springjdbcapp.model.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private final JdbcTemplate jdbcTemplate;

    public ProductRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private RowMapper<Product> productRowMapper = new RowMapper<>() {
        @Override
        public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Product(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getDouble("price"),
                    rs.getInt("quantity")
            );
        }
    };

    @Override
    public void save(Product product) {
        String sql = "INSERT INTO products (name, price, quantity) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql,
                product.getName(),
                product.getPrice(),
                product.getQuantity());
    }

    @Override
    public Product findById(int id) {
        String sql = "SELECT * FROM products WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, productRowMapper, id);
    }

    @Override
    public List<Product> findAll() {
        String sql = "SELECT * FROM products";
        return jdbcTemplate.query(sql, productRowMapper);
    }

    @Override
    public void update(Product product) {
        String sql = "UPDATE products SET price = ?, quantity = ? WHERE id = ?";
        jdbcTemplate.update(sql,
                product.getPrice(),
                product.getQuantity(),
                product.getId());
    }

    @Override
    public void deleteById(int id) {
        String sql = "DELETE FROM products WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public List<Product> findByName(String name) {
        String sql = "SELECT * FROM products WHERE name LIKE ?";
        return jdbcTemplate.query(sql, productRowMapper, "%" + name + "%");
    }
}
