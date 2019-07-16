package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import org.springframework.http.HttpStatus;

public class UnauthorizedException extends RestException {
    private static final HttpStatus STATUS = HttpStatus.UNAUTHORIZED;

    public UnauthorizedException(String logMessage) {
        super(STATUS, logMessage);
    }

    public UnauthorizedException(ErrorMessage errorMessage, String logMessage){
        super(STATUS, errorMessage, logMessage);
    }

    public UnauthorizedException(String errorCode, String logMessage) {
        super(STATUS, errorCode, logMessage);
    }
}
