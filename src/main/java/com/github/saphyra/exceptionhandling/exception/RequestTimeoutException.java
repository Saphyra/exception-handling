package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import org.springframework.http.HttpStatus;

public class RequestTimeoutException extends RestException {
    private static final HttpStatus STATUS = HttpStatus.REQUEST_TIMEOUT;

    public RequestTimeoutException(String logMessage) {
        super(STATUS, logMessage);
    }

    public RequestTimeoutException(ErrorMessage errorMessage, String logMessage){
        super(STATUS, errorMessage, logMessage);
    }
}
