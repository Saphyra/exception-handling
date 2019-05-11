package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import org.springframework.http.HttpStatus;

public class PayloadTooLargeException extends RestException {
    private static final HttpStatus STATUS = HttpStatus.PAYLOAD_TOO_LARGE;

    public PayloadTooLargeException(String logMessage) {
        super(STATUS, logMessage);
    }

    public PayloadTooLargeException(ErrorMessage errorMessage, String logMessage){
        super(STATUS, errorMessage, logMessage);
    }
}
