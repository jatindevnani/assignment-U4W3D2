package com.masai.problem2;

public class InsufficientFundException extends RuntimeException{
    public InsufficientFundException (String message) {
        super(message);
    }
}
