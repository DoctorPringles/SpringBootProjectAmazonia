package com.lavrov.amazonia.util;

import com.lavrov.amazonia.product.Product;
import com.lavrov.amazonia.product.ProductDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product toEntity(ProductDTO productDTO);
    ProductDTO toDTO(Product product);
}
