package com.company.exception;

public class EmailNotValidException extends RuntimeException {
    public EmailNotValidException() {
    }

    public EmailNotValidException(String message) {
        super(message);
    }

    public EmailNotValidException(String message, Throwable cause) {
        super(message, cause);
    }
}
