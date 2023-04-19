package com.lavrov.amazonia.category;

import com.lavrov.amazonia.product.Product;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
@Table
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String description;
    private List<Product> products;

}
