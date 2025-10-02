package com.ExceptionHandling.ExceptionHandling.GlobalException;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
