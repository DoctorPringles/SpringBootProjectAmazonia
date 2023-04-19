package com.lavrov.amazonia.util;

import com.lavrov.amazonia.review.Review;
import com.lavrov.amazonia.review.ReviewDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReviewMapper {
    Review toEntity(ReviewDTO reviewDTO);
    ReviewDTO toDTO(Review review);
}
