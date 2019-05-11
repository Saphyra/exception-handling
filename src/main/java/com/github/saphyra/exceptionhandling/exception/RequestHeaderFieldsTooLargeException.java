package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import org.springframework.http.HttpStatus;

public class RequestHeaderFieldsTooLargeException extends RestException {
    private static final HttpStatus STATUS = HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE;

    public RequestHeaderFieldsTooLargeException(String logMessage) {
        super(STATUS, logMessage);
    }

    public RequestHeaderFieldsTooLargeException(ErrorMessage errorMessage, String logMessage){
        super(STATUS, errorMessage, logMessage);
    }
}
