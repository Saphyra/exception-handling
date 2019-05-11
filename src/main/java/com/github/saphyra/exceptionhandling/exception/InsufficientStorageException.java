package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import org.springframework.http.HttpStatus;

public class InsufficientStorageException extends RestException {
    private static final HttpStatus STATUS = HttpStatus.INSUFFICIENT_STORAGE;

    public InsufficientStorageException(String logMessage) {
        super(STATUS, logMessage);
    }

    public InsufficientStorageException(ErrorMessage errorMessage, String logMessage){
        super(STATUS, errorMessage, logMessage);
    }
}
