package com.example.shop.shop.services;


import com.example.shop.shop.dto.Transfer;

import java.util.List;
import java.util.Optional;


public interface TransferService {
    List<Transfer> list();
    Optional<Transfer> getById(Long id);
    Transfer saveOrUpdate(Transfer transfer);
    void delete(Long id);
}
