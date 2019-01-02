package com.github.saphyra.exceptionhandling.exception;

import org.springframework.http.HttpStatus;

public class BadRequestException extends RestException {
    public BadRequestException(String logMessage) {
        super(HttpStatus.BAD_REQUEST, logMessage);
    }
}
