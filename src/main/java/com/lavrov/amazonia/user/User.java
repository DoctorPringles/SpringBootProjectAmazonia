package com.lavrov.amazonia.user;

import com.lavrov.amazonia.order.Order;
import com.lavrov.amazonia.product.Product;
import com.lavrov.amazonia.review.Review;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String surname;
    private String mail;
    private String password;
    private String profileImg;
    private List<Product> cart;
    private List<Product> favourites;
    private List<Order> orders;
    private List<Review> reviews;
    private List<String> paymentMethods;
    private List<String> adresses;
}
