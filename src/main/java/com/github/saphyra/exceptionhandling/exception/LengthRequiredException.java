package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import org.springframework.http.HttpStatus;

public class LengthRequiredException extends RestException {
    private static final HttpStatus STATUS = HttpStatus.LENGTH_REQUIRED;

    public LengthRequiredException(String logMessage) {
        super(STATUS, logMessage);
    }

    public LengthRequiredException(ErrorMessage errorMessage, String logMessage){
        super(STATUS, errorMessage, logMessage);
    }

    public LengthRequiredException(String errorCode, String logMessage) {
        super(STATUS, errorCode, logMessage);
    }
}
