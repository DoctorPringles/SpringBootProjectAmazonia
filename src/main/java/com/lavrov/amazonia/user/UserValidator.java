package com.lavrov.amazonia.user;

import com.lavrov.amazonia.user.User;
import com.lavrov.amazonia.util.exceptions.EmptyFieldException;
import com.lavrov.amazonia.util.validators.Validator;
import org.springframework.stereotype.Component;

@Component
public class UserValidator extends Validator {
    public static void validateUser(User user) throws EmptyFieldException {
        try {
            validateInteger(user.getId());
            validateString(user.getName());
            validateString(user.getSurname());
            validateString(user.getMail());
            validateString(user.getPassword());
            validateString(user.getProfileImg());
            validateList(user.getCart());
            validateList(user.getFavourites());
            validateList(user.getOrders());
            validateList(user.getReviews());
            validateList(user.getPaymentMethods());
            validateList(user.getAdresses());
        } catch (EmptyFieldException e) {
            throw new EmptyFieldException();
        }
    }
}
