package com.lavrov.amazonia.order;

import com.lavrov.amazonia.product.Product;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderDTO {
    private Integer id;
    private List<Product> products;
    private LocalDateTime startOrderTime;
    private Double price;
    private Integer userId;
    private String adress;
    private String state;

}
