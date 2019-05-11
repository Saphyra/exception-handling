package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import org.springframework.http.HttpStatus;

public class NotExtendedException extends RestException {
    private static final HttpStatus STATUS = HttpStatus.NOT_EXTENDED;

    public NotExtendedException(String logMessage) {
        super(STATUS, logMessage);
    }

    public NotExtendedException(ErrorMessage errorMessage, String logMessage){
        super(STATUS, errorMessage, logMessage);
    }
}
