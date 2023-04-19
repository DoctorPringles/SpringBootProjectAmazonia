package com.lavrov.amazonia.order;

import com.lavrov.amazonia.product.Product;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private List<Product> products;
    private LocalDateTime startOrderTime;
    private Double price;
    private Integer userId;
    private String adress;
    private String state;

}
