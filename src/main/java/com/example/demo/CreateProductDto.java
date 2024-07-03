package com.example.demo;

import java.util.List;

public record CreateProductDto(
        String name,
        String description,
        String category,
        List<CreateProductVariationDto> productVariations,
        Boolean available
) {
}
