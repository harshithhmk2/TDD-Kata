package com.sweet.shop.dto;

public record AuthRequest(
        String username,
        String password
) {}
