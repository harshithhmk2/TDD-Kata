package com.sweet.shop.sweets;

import com.sweet.shop.dto.SweetRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SweetService {

    private final SweetRepository repository;

    public Sweet addSweet(SweetRequest request) {
        Sweet sweet = Sweet.builder()
                .category(request.category())
                .name(request.name())
                .price(request.price())
                .quantity(request.quantity())
                .build();

        return repository.save(sweet);
    }

    public List<Sweet> getAll() {
        return repository.findAll();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
