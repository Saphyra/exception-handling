package com.github.saphyra.exceptionhandling.exception;

import org.springframework.http.HttpStatus;

public class UnauthorizedException extends RestException {
    public UnauthorizedException(String logMessage) {
        super(HttpStatus.UNAUTHORIZED, logMessage);
    }

    public UnauthorizedException(ErrorCode errorCode, String logMessage){
        super(HttpStatus.UNAUTHORIZED, errorCode, logMessage);
    }
}
