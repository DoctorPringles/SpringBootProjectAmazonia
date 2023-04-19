package com.lavrov.amazonia.review;

import com.lavrov.amazonia.review.ReviewDTO;

import java.util.List;

public interface ReviewService {
    ReviewDTO saveReview(ReviewDTO orderDTO);
    void deleteReview(Integer id);
    ReviewDTO findById(Integer id);
    List<ReviewDTO> findAll();
}
