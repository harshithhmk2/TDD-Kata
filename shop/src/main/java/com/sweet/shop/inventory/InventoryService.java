package com.sweet.shop.inventory;

import com.sweet.shop.sweets.Sweet;
import com.sweet.shop.sweets.SweetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final SweetRepository repository;

    public Sweet purchase(Long id, int qty) {
        Sweet sweet = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sweet not found"));

        if (sweet.getQuantity() < qty) {
            throw new RuntimeException("Insufficient stock");
        }

        sweet.setQuantity(sweet.getQuantity() - qty);
        return repository.save(sweet);
    }

    public Sweet restock(Long id, int qty) {
        Sweet sweet = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sweet not found"));

        sweet.setQuantity(sweet.getQuantity() + qty);
        return repository.save(sweet);
    }
}
