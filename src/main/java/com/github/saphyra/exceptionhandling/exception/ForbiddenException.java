package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import org.springframework.http.HttpStatus;

public class ForbiddenException extends RestException {
    public ForbiddenException(String logMessage) {
        super(HttpStatus.FORBIDDEN, logMessage);
    }

    public ForbiddenException(ErrorMessage errorMessage, String logMessage){
        super(HttpStatus.FORBIDDEN, errorMessage, logMessage);
    }
}
