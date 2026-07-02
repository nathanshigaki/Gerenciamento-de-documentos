package com.govmt.sgd.exception;

public class InvalidPasswordException extends IllegalArgumentException{
    public InvalidPasswordException(String message){
        super(message);
    }
}
