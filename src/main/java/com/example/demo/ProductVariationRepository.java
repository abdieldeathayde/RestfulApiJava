package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ProductVariationRepository extends JpaRepository<ProductVariation, Long> {
    @Query("select pv from ProductVariation pv where pv.product.id = :productVariationId")
    Optional<ProductVariation> findByProductVariationId(@Param("productId") Long productVariationId);
}
