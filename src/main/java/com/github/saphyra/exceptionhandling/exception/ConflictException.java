package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import org.springframework.http.HttpStatus;

public class ConflictException extends RestException {
    public ConflictException(String logMessage) {
        super(HttpStatus.CONFLICT, logMessage);
    }

    public ConflictException(ErrorMessage errorMessage, String logMessage){
        super(HttpStatus.CONFLICT, errorMessage, logMessage);
    }
}
