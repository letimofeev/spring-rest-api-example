package org.spring.rest.exception;

public class NoSuchEmployeeException extends RuntimeException {

    public NoSuchEmployeeException() {
    }

    public NoSuchEmployeeException(String message) {
        super(message);
    }

    public NoSuchEmployeeException(String message, Throwable cause) {
        super(message, cause);
    }
}
