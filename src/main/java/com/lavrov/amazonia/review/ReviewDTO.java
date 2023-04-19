package com.lavrov.amazonia.review;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReviewDTO {
    private Integer rating;
    private Integer authorId;
    private String body;
    private LocalDateTime creationTime;
    private Integer productId;
}
