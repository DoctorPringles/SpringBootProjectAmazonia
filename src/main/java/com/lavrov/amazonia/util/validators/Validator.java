package com.lavrov.amazonia.util.validators;

import com.lavrov.amazonia.util.exceptions.EmptyFieldException;


import java.util.List;

public class Validator <T>{

    public static void validateString(String str) throws EmptyFieldException {
        try{
            if (str==null||str.isEmpty()) {
                throw new EmptyFieldException();
            }
        }catch (EmptyFieldException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static void validateInteger(Integer integerNumber) throws EmptyFieldException {
        try {
            if(integerNumber==null){
                throw new EmptyFieldException();
            }
        }catch (EmptyFieldException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static void validateFloat(Float floatNumber) throws EmptyFieldException {
        try {
            if (floatNumber == null) {
                throw new EmptyFieldException();
            }
        } catch (EmptyFieldException e) {
            e.printStackTrace();
            throw e;
        }

    }

    public static void validateDouble(Double doubleNumber) throws EmptyFieldException {
        try {
            if (doubleNumber == null) {
                throw new EmptyFieldException();
            }
        } catch (EmptyFieldException e) {
            e.printStackTrace();
            throw e;
        }

    }

    public static void validateList(List list) throws EmptyFieldException {
        try {
            if (list == null) {
                throw new EmptyFieldException();
            }
        } catch (EmptyFieldException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
