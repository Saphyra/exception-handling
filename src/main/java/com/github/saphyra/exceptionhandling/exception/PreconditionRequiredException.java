package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import org.springframework.http.HttpStatus;

public class PreconditionRequiredException extends RestException {
    private static final HttpStatus STATUS = HttpStatus.PRECONDITION_REQUIRED;

    public PreconditionRequiredException(String logMessage) {
        super(STATUS, logMessage);
    }

    public PreconditionRequiredException(ErrorMessage errorMessage, String logMessage){
        super(STATUS, errorMessage, logMessage);
    }
}
