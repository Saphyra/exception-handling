package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import org.springframework.http.HttpStatus;

public class ServiceUnavailableException extends RestException {
    private static final HttpStatus STATUS = HttpStatus.SERVICE_UNAVAILABLE;

    public ServiceUnavailableException(String logMessage) {
        super(STATUS, logMessage);
    }

    public ServiceUnavailableException(ErrorMessage errorMessage, String logMessage){
        super(STATUS, errorMessage, logMessage);
    }

    public ServiceUnavailableException(String errorCode, String logMessage) {
        super(STATUS, errorCode, logMessage);
    }
}
