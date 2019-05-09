package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorCode;
import org.springframework.http.HttpStatus;

public class UnauthorizedException extends RestException {
    public UnauthorizedException(String logMessage) {
        super(HttpStatus.UNAUTHORIZED, logMessage);
    }

    public UnauthorizedException(ErrorCode errorCode, String logMessage){
        super(HttpStatus.UNAUTHORIZED, errorCode, logMessage);
    }
}
