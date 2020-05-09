package com.example.shop.shop.services;

import com.example.shop.shop.domain.TransferEntity;
import com.example.shop.shop.dto.Transfer;
import com.example.shop.shop.repositories.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TransferServiceImpl implements  TransferService{
    private TransferRepository repository;

    @Autowired
    public TransferServiceImpl(TransferRepository transferRepository) {
        this.repository = transferRepository;
    }

    @Override
    public List<Transfer> list() {
        List<Transfer> transfers = new ArrayList<>();
        repository.findAll().forEach(transferEntity -> transfers.add(transferEntity.toDto()));
        return transfers;
    }

    @Override
    public Optional<Transfer> getById(Long id) {
        return repository.findById(id).map(TransferEntity::toDto);
    }

    @Override
    public Transfer saveOrUpdate(Transfer transfer) {
        return repository.save(TransferEntity.fromDto(transfer)).toDto();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
