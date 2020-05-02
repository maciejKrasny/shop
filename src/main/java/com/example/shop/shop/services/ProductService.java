package com.example.shop.shop.services;

import com.example.shop.shop.dto.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> list();
    Optional<Product> getById(Long id);
    Product saveOrUpdate(Product product);
    void delete(Long id);
}