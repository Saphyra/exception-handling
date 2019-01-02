package com.github.saphyra.exceptionhandling.exception;

import org.springframework.http.HttpStatus;

public class UnauthorizedException extends RestException {
    public UnauthorizedException(String logMessage) {
        super(HttpStatus.UNAUTHORIZED, logMessage);
    }
}
