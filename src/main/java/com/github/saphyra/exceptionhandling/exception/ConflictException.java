package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorCode;
import org.springframework.http.HttpStatus;

public class ConflictException extends RestException {
    public ConflictException(String logMessage) {
        super(HttpStatus.CONFLICT, logMessage);
    }

    public ConflictException(ErrorCode errorCode, String logMessage){
        super(HttpStatus.CONFLICT, errorCode, logMessage);
    }
}
