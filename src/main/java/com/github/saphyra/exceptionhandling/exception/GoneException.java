package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorCode;
import org.springframework.http.HttpStatus;

public class GoneException extends RestException {
    public GoneException(String logMessage) {
        super(HttpStatus.GONE, logMessage);
    }

    public GoneException(ErrorCode errorCode, String logMessage){
        super(HttpStatus.GONE, errorCode, logMessage);
    }
}
