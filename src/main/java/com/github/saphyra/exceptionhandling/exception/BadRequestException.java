package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import org.springframework.http.HttpStatus;

public class BadRequestException extends RestException {
    private static final HttpStatus STATUS = HttpStatus.BAD_REQUEST;

    public BadRequestException(String logMessage) {
        super(STATUS, logMessage);
    }

    public BadRequestException(ErrorMessage errorMessage, String logMessage){
        super(STATUS, errorMessage, logMessage);
    }
}
