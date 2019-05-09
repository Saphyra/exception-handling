package com.github.saphyra.exceptionhandling.exception;

import org.springframework.http.HttpStatus;

import com.github.saphyra.exceptionhandling.domain.ErrorCode;
import lombok.Getter;

public class RestException extends RuntimeException {
    public static final ErrorCode DEFAULT_ERROR_CODE = new ErrorCode("", "");

    @Getter
    private final HttpStatus responseStatus;

    @Getter
    private final ErrorCode errorCode;

    public RestException(HttpStatus responseStatus, String logMessage) {
        super(logMessage);
        this.responseStatus = responseStatus;
        this.errorCode = DEFAULT_ERROR_CODE;
    }

    public RestException(HttpStatus responseStatus, ErrorCode errorCode, String logMessage) {
        super(logMessage);
        this.responseStatus = responseStatus;
        this.errorCode = errorCode;
    }
}
