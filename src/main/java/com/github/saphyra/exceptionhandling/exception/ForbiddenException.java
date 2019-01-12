package com.github.saphyra.exceptionhandling.exception;

import org.springframework.http.HttpStatus;

public class ForbiddenException extends RestException {
    public ForbiddenException(String logMessage) {
        super(HttpStatus.FORBIDDEN, logMessage);
    }

    public ForbiddenException(ErrorCode errorCode, String logMessage){
        super(HttpStatus.FORBIDDEN, errorCode, logMessage);
    }
}
