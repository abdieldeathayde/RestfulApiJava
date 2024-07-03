package com.example.demo;

public record UpdateProductDto(
        String nome,
        String description,
        Boolean available
) {
}
