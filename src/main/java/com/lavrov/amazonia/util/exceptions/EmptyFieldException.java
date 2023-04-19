package com.lavrov.amazonia.util.exceptions;

public class EmptyFieldException extends Exception{
    public EmptyFieldException(){
        super("Empty field detected");
    }
}
