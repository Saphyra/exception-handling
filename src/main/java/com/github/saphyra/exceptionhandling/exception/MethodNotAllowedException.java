package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import org.springframework.http.HttpStatus;

public class MethodNotAllowedException extends RestException {
    private static final HttpStatus STATUS = HttpStatus.METHOD_NOT_ALLOWED;

    public MethodNotAllowedException(String logMessage) {
        super(STATUS, logMessage);
    }

    public MethodNotAllowedException(ErrorMessage errorMessage, String logMessage){
        super(STATUS, errorMessage, logMessage);
    }

    public MethodNotAllowedException(String errorCode, String logMessage) {
        super(STATUS, errorCode, logMessage);
    }
}
