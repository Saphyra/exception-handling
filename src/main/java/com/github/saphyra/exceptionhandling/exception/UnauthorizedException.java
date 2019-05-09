package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import org.springframework.http.HttpStatus;

public class UnauthorizedException extends RestException {
    public UnauthorizedException(String logMessage) {
        super(HttpStatus.UNAUTHORIZED, logMessage);
    }

    public UnauthorizedException(ErrorMessage errorMessage, String logMessage){
        super(HttpStatus.UNAUTHORIZED, errorMessage, logMessage);
    }
}
