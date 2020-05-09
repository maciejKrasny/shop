package com.example.shop.shop.controllers;

import com.example.shop.shop.dto.Product;
import com.example.shop.shop.services.ProductService;
import com.example.shop.shop.services.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {
    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String redirToList(){
        return "redirect:/product/list";
    }

    @GetMapping({"/product", "product/list"})
    public List<Product> list() {
        return this.service.list();
    }

    @GetMapping("/product/{id}")
    public Optional<Product> getProduct(@PathVariable(value = "id") Long id) {
        return this.service.getById(id);
    }

    @PostMapping("/product/add")
    public Product add(@RequestBody Product product) {
        return this.service.saveOrUpdate(product);
    }


}
