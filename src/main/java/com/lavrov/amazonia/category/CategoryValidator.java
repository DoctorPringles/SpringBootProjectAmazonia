package com.lavrov.amazonia.category;

import com.lavrov.amazonia.category.Category;
import com.lavrov.amazonia.util.exceptions.EmptyFieldException;
import com.lavrov.amazonia.util.validators.Validator;
import org.springframework.stereotype.Component;

@Component
public class CategoryValidator extends Validator {
    public static void validateCategory(Category category) throws EmptyFieldException {
        try {
            validateInteger(category.getId());
            validateString(category.getName());
            validateString(category.getDescription());
            validateList(category.getProducts());

        } catch (EmptyFieldException e) {
            throw new EmptyFieldException();
        }
    }
}
