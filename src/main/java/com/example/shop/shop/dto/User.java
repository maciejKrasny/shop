package com.example.shop.shop.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class User {
    private Long id;
    private String name;
    private String surname;
    private String address;
}
