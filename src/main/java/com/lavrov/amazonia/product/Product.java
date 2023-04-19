package com.lavrov.amazonia.product;

import com.lavrov.amazonia.category.Category;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Blob;
import java.util.List;

@Entity
@Data
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String brend;
    private String description;
    private Double price;
    private Integer amount;
    private String imgUrl;
    private List<Category> categories;
}
