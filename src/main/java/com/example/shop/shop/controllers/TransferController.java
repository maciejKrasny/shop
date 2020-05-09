package com.example.shop.shop.controllers;

import com.example.shop.shop.dto.Transfer;
import com.example.shop.shop.services.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TransferController {
    @Autowired
    private TransferService service;

    @GetMapping({"/transfer", "transfer/list"})
    public List<Transfer> list() {
        return this.service.list();
    }

    @GetMapping("/transfer/{id}")
    public Optional<Transfer> getProduct(@PathVariable(value = "id") Long id) {
        return this.service.getById(id);
    }

    @PostMapping ("/transfer/add")
    public Transfer add(@RequestBody Transfer product) {
        return this.service.saveOrUpdate(product);
    }
}
