package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import org.springframework.http.HttpStatus;

public class GoneException extends RestException {
    public GoneException(String logMessage) {
        super(HttpStatus.GONE, logMessage);
    }

    public GoneException(ErrorMessage errorMessage, String logMessage){
        super(HttpStatus.GONE, errorMessage, logMessage);
    }
}
