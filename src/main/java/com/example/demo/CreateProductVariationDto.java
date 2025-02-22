package com.example.demo;

import java.math.BigDecimal;

public record CreateProductVariationDto(
        String sizeName,
        String description,
        BigDecimal price,
        Boolean available
) {
}
