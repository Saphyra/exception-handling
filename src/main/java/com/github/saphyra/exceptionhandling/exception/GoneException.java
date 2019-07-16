package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import org.springframework.http.HttpStatus;

public class GoneException extends RestException {
    private static final HttpStatus STATUS = HttpStatus.GONE;

    public GoneException(String logMessage) {
        super(STATUS, logMessage);
    }

    public GoneException(ErrorMessage errorMessage, String logMessage){
        super(STATUS, errorMessage, logMessage);
    }

    public GoneException(String errorCode, String logMessage) {
        super(STATUS, errorCode, logMessage);
    }
}
