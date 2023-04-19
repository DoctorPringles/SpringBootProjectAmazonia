package com.lavrov.amazonia.category;

import com.lavrov.amazonia.product.Product;
import com.lavrov.amazonia.product.ProductDTO;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
public class CategoryDTO {
    private Integer id;
    private String name;
    private String description;
    private List<ProductDTO> products;

}
