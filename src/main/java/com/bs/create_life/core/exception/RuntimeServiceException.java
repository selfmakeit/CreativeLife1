package com.bs.create_life.core.exception;

/**
 * Created by adams on 2017/4/11.
 */
public class RuntimeServiceException extends RuntimeException{

    public RuntimeServiceException() {
        super();
    }

    public RuntimeServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public RuntimeServiceException(String message) {
        super(message);
    }

    public RuntimeServiceException(Throwable cause) {
        super(cause);
    }
}

