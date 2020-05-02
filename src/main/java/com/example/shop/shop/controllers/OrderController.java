package com.example.shop.shop.controllers;

import com.example.shop.shop.dto.Order;
import com.example.shop.shop.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {

    @Autowired
    private OrderService service;

    @GetMapping({"/order", "order/list"})
    public List<Order> list() {
        return this.service.list();
    }

    @GetMapping("/order/{id}")
    public Optional<Order> getOrder(@RequestParam(value = "id") Long id) {
        return this.service.getById(id);
    }

    @PostMapping("/order/add")
    public Order add(@RequestBody Order order) {
        return this.service.saveOrUpdate(order);
    }

}
