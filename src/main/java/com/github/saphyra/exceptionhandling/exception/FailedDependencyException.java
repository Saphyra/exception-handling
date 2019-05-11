package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import org.springframework.http.HttpStatus;

public class FailedDependencyException extends RestException {
    private static final HttpStatus STATUS = HttpStatus.FAILED_DEPENDENCY;

    public FailedDependencyException(String logMessage) {
        super(STATUS, logMessage);
    }

    public FailedDependencyException(ErrorMessage errorMessage, String logMessage){
        super(STATUS, errorMessage, logMessage);
    }
}
