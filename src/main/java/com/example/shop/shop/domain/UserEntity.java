package com.example.shop.shop.domain;

import com.example.shop.shop.dto.User;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String address;

    public User toDto() {
        return User.builder()
                .id(id)
                .name(name)
                .surname(surname)
                .address(address)
                .build();
    }

    public static UserEntity fromDto(User user) {
        return UserEntity.builder()
                .id(user.getId())
                .name(user.getName())
                .surname(user.getSurname())
                .address(user.getAddress())
                .build();
    }
}
