package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import org.springframework.http.HttpStatus;

public class InternalServerErrorException extends RestException {
    private static final HttpStatus STATUS = HttpStatus.INTERNAL_SERVER_ERROR;

    public InternalServerErrorException(String logMessage) {
        super(STATUS, logMessage);
    }

    public InternalServerErrorException(ErrorMessage errorMessage, String logMessage){
        super(STATUS, errorMessage, logMessage);
    }
}
