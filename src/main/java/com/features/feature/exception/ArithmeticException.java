package com.features.feature.exception;

public class ArithmeticException extends RuntimeException {
    public ArithmeticException(String message, Exception cause) {
        super(message, cause);
    }
}
