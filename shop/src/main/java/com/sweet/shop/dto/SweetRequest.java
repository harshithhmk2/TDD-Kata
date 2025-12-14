package com.sweet.shop.dto;

public record SweetRequest(
        String category,
        String name,
        double price,
        int quantity
) {}
