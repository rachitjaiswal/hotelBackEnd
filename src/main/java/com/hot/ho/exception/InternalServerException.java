package com.hot.ho.exception;


public class InternalServerException extends RuntimeException {
    public InternalServerException(String message) {
        super(message);
    }
}
