package com.github.saphyra.exceptionhandling.exception;

import org.springframework.http.HttpStatus;

public class ConflictException extends RestException {
    public ConflictException(String logMessage) {
        super(HttpStatus.CONFLICT, logMessage);
    }
}
