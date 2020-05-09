package com.example.shop.shop.domain;

import com.example.shop.shop.dto.Transfer;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "transfers")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TransferEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String accountNumber;
    private String title;

    public Transfer toDto() {
        return Transfer.builder()
                .id(id)
                .name(name)
                .accountNumber(accountNumber)
                .title(title)
                .build();
    }

    public static TransferEntity fromDto(Transfer transfer) {
        return TransferEntity.builder()
                .id(transfer.getId())
                .name(transfer.getName())
                .accountNumber(transfer.getAccountNumber())
                .title(transfer.getTitle())
                .build();
    }
}
