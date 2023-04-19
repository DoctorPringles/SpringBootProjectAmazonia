package com.lavrov.amazonia.review;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer rating;
    private Integer authorId;
    private String body;
    private LocalDateTime creationTime;
    private Integer productId;
}
