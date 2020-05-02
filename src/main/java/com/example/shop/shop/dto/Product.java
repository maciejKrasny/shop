package com.example.shop.shop.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Product {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imageURL;
}
