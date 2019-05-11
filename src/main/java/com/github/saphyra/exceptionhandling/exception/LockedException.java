package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import org.springframework.http.HttpStatus;

public class LockedException extends RestException {
    private static final HttpStatus STATUS = HttpStatus.LOCKED;

    public LockedException(String logMessage) {
        super(STATUS, logMessage);
    }

    public LockedException(ErrorMessage errorMessage, String logMessage){
        super(STATUS, errorMessage, logMessage);
    }
}
