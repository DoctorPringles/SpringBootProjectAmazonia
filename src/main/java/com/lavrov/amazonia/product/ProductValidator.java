package com.lavrov.amazonia.product;

import com.lavrov.amazonia.product.Product;
import com.lavrov.amazonia.util.exceptions.EmptyFieldException;
import com.lavrov.amazonia.util.validators.Validator;
import org.springframework.stereotype.Component;

@Component
public class ProductValidator extends Validator {
    public static void validateProduct(Product product) throws EmptyFieldException {
        try {
            validateInteger(product.getId());
            validateString(product.getName());
            validateString(product.getBrend());
            validateString(product.getDescription());
            validateDouble(product.getPrice());
            validateInteger(product.getAmount());
            validateString(product.getImgUrl());
            validateList(product.getCategories());


        } catch (EmptyFieldException e) {
            throw new EmptyFieldException();
        }
    }
}
