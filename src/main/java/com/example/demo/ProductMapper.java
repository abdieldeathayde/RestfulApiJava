package com.example.demo;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(target = "productVariations", qualifiedByName = "mapProductVariationToRecoveryProductVariationDto")
    RecoveryProductDto mapProductRecoveryProductDto(Product product);

    @Named("mapProductVariationToRecoveryProductVariationDto")
    @IterableMapping(qualifiedByName = "mapProductVariatonToRecoveryProductVariationDto")
    List<RecoveryProductVariationDto> mapProductVariationToRecoveryProductVariationDto(List<ProductVariation> productVariations );

    @Named("mapProductVariationTorecoveryProductVariationDto")
    RecoveryProductDto mapProductVariationProductVariationDto(CreateProductVariationDto createProductVariationDto);

}
