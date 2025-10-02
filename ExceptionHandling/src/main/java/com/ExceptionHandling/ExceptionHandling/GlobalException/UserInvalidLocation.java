package com.ExceptionHandling.ExceptionHandling.GlobalException;

public class UserInvalidLocation extends RuntimeException {
    public UserInvalidLocation(String message) {
        super(message);
    }
}
