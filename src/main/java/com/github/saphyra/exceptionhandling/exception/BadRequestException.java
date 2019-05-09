package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorCode;
import org.springframework.http.HttpStatus;

public class BadRequestException extends RestException {
    public BadRequestException(String logMessage) {
        super(HttpStatus.BAD_REQUEST, logMessage);
    }

    public BadRequestException(ErrorCode errorCode, String logMessage){
        super(HttpStatus.BAD_REQUEST, errorCode, logMessage);
    }
}
