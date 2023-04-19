package com.lavrov.amazonia.product;

import com.lavrov.amazonia.category.CategoryDTO;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
public class ProductDTO {
    private Integer id;
    private String name;
    private String brend;
    private String description;
    private Integer price;
    private Integer amount;
    private String imgUrl;
    private List<CategoryDTO> categories;
}
