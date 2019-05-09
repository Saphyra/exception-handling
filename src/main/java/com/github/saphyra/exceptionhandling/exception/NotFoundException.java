package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import org.springframework.http.HttpStatus;

public class NotFoundException extends RestException {
    public NotFoundException(String logMessage) {
        super(HttpStatus.NOT_FOUND, logMessage);
    }

    public NotFoundException(ErrorMessage errorMessage, String logMessage){
        super(HttpStatus.NOT_FOUND, errorMessage, logMessage);
    }
}
