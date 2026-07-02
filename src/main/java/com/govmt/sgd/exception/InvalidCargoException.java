package com.govmt.sgd.exception;

public class InvalidCargoException extends IllegalArgumentException{
    public InvalidCargoException(String message){
        super(message);
    }
}
