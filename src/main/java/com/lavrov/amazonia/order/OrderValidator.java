package com.lavrov.amazonia.order;

import com.lavrov.amazonia.util.exceptions.EmptyFieldException;
import com.lavrov.amazonia.util.validators.Validator;
import org.springframework.stereotype.Component;

@Component
public class OrderValidator extends Validator {
    public static void validateOrder(Order order) throws EmptyFieldException {
        try {
            validateInteger(order.getId());
            validateList(order.getProducts());
            if (order.getStartOrderTime().equals(null)) throw new EmptyFieldException();
            validateDouble(order.getPrice());
            validateInteger(order.getUserId());
            validateString(order.getAdress());
            validateString(order.getState());
        } catch (EmptyFieldException e) {
            throw new EmptyFieldException();
        }
    }
}
