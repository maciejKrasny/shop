package com.example.shop.shop.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Transfer {
    private Long id;
    private String name;
    private String accountNumber;
    private String title;
}
