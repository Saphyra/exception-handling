package com.github.saphyra.exceptionhandling.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends RestException {
    public NotFoundException(String logMessage) {
        super(HttpStatus.NOT_FOUND, logMessage);
    }
}
