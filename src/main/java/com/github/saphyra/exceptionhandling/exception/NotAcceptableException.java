package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import org.springframework.http.HttpStatus;

public class NotAcceptableException extends RestException {
    private static final HttpStatus STATUS = HttpStatus.NOT_ACCEPTABLE;

    public NotAcceptableException(String logMessage) {
        super(STATUS, logMessage);
    }

    public NotAcceptableException(ErrorMessage errorMessage, String logMessage){
        super(STATUS, errorMessage, logMessage);
    }
}
