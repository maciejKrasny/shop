package com.example.shop.shop.domain;

import com.example.shop.shop.dto.Order;
import com.example.shop.shop.dto.Product;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    private UserEntity user;
    @ManyToMany
    private List<ProductEntity> products;

    public Order toDto() {
        List<Product> products = new ArrayList<>();
        this.products.forEach(productEntity -> products.add(productEntity.toDto()));
        return Order.builder()
                .id(id)
                .user(user.toDto())
                .products(products)
                .build();
    }

    public static OrderEntity fromDto(Order order) {
        List<ProductEntity> products = new ArrayList<>();
        order.getProducts().forEach(product -> products.add(ProductEntity.fromDto(product)));
        return OrderEntity.builder()
                .id(order.getId())
                .user(UserEntity.fromDto(order.getUser()))
                .products(products)
                .build();
    }
}
