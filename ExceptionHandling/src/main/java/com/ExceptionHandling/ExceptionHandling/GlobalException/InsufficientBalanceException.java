package com.ExceptionHandling.ExceptionHandling.GlobalException;

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
