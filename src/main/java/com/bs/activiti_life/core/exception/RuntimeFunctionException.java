package com.bs.activiti_life.core.exception;

/**
 * Created by adams on 2017/4/11.
 */
public class RuntimeFunctionException extends RuntimeException{
    public RuntimeFunctionException() {
        super();
    }

    public RuntimeFunctionException(String message, Throwable cause) {
        super(message, cause);
    }

    public RuntimeFunctionException(String message) {
        super(message);
    }

    public RuntimeFunctionException(Throwable cause) {
        super(cause);
    }
}
