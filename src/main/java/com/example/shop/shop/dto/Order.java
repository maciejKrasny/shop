package com.example.shop.shop.dto;

import com.example.shop.shop.domain.ProductEntity;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Order {
    private Long id;
    private User user;
    private List<Product> products;
}
