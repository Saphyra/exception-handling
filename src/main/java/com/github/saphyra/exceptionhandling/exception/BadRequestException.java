package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import org.springframework.http.HttpStatus;

public class BadRequestException extends RestException {
    public BadRequestException(String logMessage) {
        super(HttpStatus.BAD_REQUEST, logMessage);
    }

    public BadRequestException(ErrorMessage errorMessage, String logMessage){
        super(HttpStatus.BAD_REQUEST, errorMessage, logMessage);
    }
}
