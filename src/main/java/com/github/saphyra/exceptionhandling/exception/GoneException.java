package com.github.saphyra.exceptionhandling.exception;

import org.springframework.http.HttpStatus;

public class GoneException extends RestException {
    public GoneException(String logMessage) {
        super(HttpStatus.GONE, logMessage);
    }
}
