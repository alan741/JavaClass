package com.expeditors.petapp.exceptionHandlers.exceptions;

public class InvalidBusinessLogicFieldException extends RuntimeException{

    public InvalidBusinessLogicFieldException(String msg){
        super(msg);
    }
}
