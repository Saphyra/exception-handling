package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import org.springframework.http.HttpStatus;

public class RequestRangeNotSatisfiableException extends RestException {
    private static final HttpStatus STATUS = HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE;

    public RequestRangeNotSatisfiableException(String logMessage) {
        super(STATUS, logMessage);
    }

    public RequestRangeNotSatisfiableException(ErrorMessage errorMessage, String logMessage){
        super(STATUS, errorMessage, logMessage);
    }

    public RequestRangeNotSatisfiableException(String errorCode, String logMessage) {
        super(STATUS, errorCode, logMessage);
    }
}
