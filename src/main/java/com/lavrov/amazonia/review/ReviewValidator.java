package com.lavrov.amazonia.review;

import com.lavrov.amazonia.review.Review;
import com.lavrov.amazonia.util.exceptions.EmptyFieldException;
import com.lavrov.amazonia.util.validators.Validator;
import org.springframework.stereotype.Component;

@Component
public class ReviewValidator extends Validator {
    public static void validateReview(Review review) throws EmptyFieldException {
        try {
            validateInteger(review.getId());
            validateInteger(review.getRating());
            validateInteger(review.getAuthorId());
            validateString(review.getBody());
            if(review.getCreationTime().equals(null)) throw new EmptyFieldException();
            validateInteger(review.getProductId());

        } catch (EmptyFieldException e) {
            throw new EmptyFieldException();
        }
    }
}
