package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import org.springframework.http.HttpStatus;

public class LoopDetectedException extends RestException {
    private static final HttpStatus STATUS = HttpStatus.LOOP_DETECTED;

    public LoopDetectedException(String logMessage) {
        super(STATUS, logMessage);
    }

    public LoopDetectedException(ErrorMessage errorMessage, String logMessage){
        super(STATUS, errorMessage, logMessage);
    }
}
