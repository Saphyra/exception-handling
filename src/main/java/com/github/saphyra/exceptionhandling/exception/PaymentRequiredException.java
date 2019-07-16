package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import org.springframework.http.HttpStatus;

public class PaymentRequiredException extends RestException {
    private static final HttpStatus STATUS = HttpStatus.PAYMENT_REQUIRED;

    public PaymentRequiredException(String logMessage) {
        super(STATUS, logMessage);
    }

    public PaymentRequiredException(ErrorMessage errorMessage, String logMessage) {
        super(STATUS, errorMessage, logMessage);
    }

    public PaymentRequiredException(String errorCode, String logMessage) {
        super(STATUS, errorCode, logMessage);
    }
}
