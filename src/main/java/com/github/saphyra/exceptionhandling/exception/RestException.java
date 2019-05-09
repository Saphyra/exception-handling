package com.github.saphyra.exceptionhandling.exception;

import org.springframework.http.HttpStatus;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import lombok.Getter;

import java.util.HashMap;

public class RestException extends RuntimeException {
    public static final ErrorMessage DEFAULT_ERROR_CODE = new ErrorMessage("", "", new HashMap<>());

    @Getter
    private final HttpStatus responseStatus;

    @Getter
    private final ErrorMessage errorMessage;

    public RestException(HttpStatus responseStatus, String logMessage) {
        super(logMessage);
        this.responseStatus = responseStatus;
        this.errorMessage = DEFAULT_ERROR_CODE;
    }

    public RestException(HttpStatus responseStatus, ErrorMessage errorMessage, String logMessage) {
        super(logMessage);
        this.responseStatus = responseStatus;
        this.errorMessage = errorMessage;
    }
}
