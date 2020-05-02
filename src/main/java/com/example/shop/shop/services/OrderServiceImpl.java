package com.example.shop.shop.services;

import com.example.shop.shop.domain.OrderEntity;
import com.example.shop.shop.dto.Order;
import com.example.shop.shop.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    private OrderRepository repository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.repository = orderRepository;
    }

    @Override
    public List<Order> list() {
        List<Order> orders = new ArrayList<>();
        repository.findAll().forEach(orderEntity -> orders.add(orderEntity.toDto()));
        return orders;
    }

    @Override
    public Optional<Order> getById(Long id) {
        return repository.findById(id).map(OrderEntity::toDto);
    }

    @Override
    public Order saveOrUpdate(Order order) {
        return repository.save(OrderEntity.fromDto(order)).toDto();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
