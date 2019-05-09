package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorCode;
import org.springframework.http.HttpStatus;

public class NotFoundException extends RestException {
    public NotFoundException(String logMessage) {
        super(HttpStatus.NOT_FOUND, logMessage);
    }

    public NotFoundException(ErrorCode errorCode, String logMessage){
        super(HttpStatus.NOT_FOUND, errorCode, logMessage);
    }
}
