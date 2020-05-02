package com.example.shop.shop.services;

import com.example.shop.shop.domain.ProductEntity;
import com.example.shop.shop.dto.Product;
import com.example.shop.shop.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository repository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.repository = productRepository;
    }

    @Override
    public List<Product> list() {
        List<Product> products = new ArrayList<>();
        repository.findAll().forEach(productEntity -> products.add(productEntity.toDto()));
        return products;
    }

    @Override
    public Optional<Product> getById(Long id) {
        return repository.findById(id).map(ProductEntity::toDto);
    }

    @Override
    public Product saveOrUpdate(Product product) {
        return repository.save(ProductEntity.fromDto(product)).toDto();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
