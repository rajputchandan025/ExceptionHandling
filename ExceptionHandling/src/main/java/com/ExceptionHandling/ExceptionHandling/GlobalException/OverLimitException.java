package com.ExceptionHandling.ExceptionHandling.GlobalException;

public class OverLimitException extends RuntimeException {
    public OverLimitException(String message) {
        super(message);
    }
}
