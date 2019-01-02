package com.github.saphyra.exceptionhandling.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

public class RestException extends RuntimeException{
    @Getter
    private final HttpStatus responseStatus;

    public RestException(HttpStatus responseStatus, String logMessage){
        super(logMessage);
        this.responseStatus = responseStatus;
    }
}
