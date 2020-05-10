package com.example.shop.shop.services;

import com.example.shop.shop.dto.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<Order> list();
    Optional<Order> getById(Long id);
    Order saveOrUpdate(Order product);
    void delete(Long id);
}
