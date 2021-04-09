package com.epam.firsttask.exception;

public class DataArrayException extends Exception {

    public DataArrayException() {
    }

    public DataArrayException(String message) {
        super(message);
    }

    public DataArrayException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataArrayException(Throwable cause) {
        super(cause);
    }

    public DataArrayException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
