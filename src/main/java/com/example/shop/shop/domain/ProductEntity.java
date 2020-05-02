package com.example.shop.shop.domain;

import com.example.shop.shop.dto.Product;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany(mappedBy = "products")
    private List<OrderEntity> orders;
    private String name;
    private String description;
    private Double price;
    private String imageURL;

    public Product toDto() {
        return Product.builder()
                .id(id)
                .name(name)
                .description(description)
                .price(price)
                .imageURL(imageURL)
                .build();
    }

    public static ProductEntity fromDto(Product product) {
        return ProductEntity.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .imageURL(product.getImageURL())
                .build();
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}
