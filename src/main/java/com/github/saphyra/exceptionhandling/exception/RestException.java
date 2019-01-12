package com.github.saphyra.exceptionhandling.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

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

    @AllArgsConstructor
    public static class ErrorCode {
        private final String errorCode;
        private final String errorMessage;

        public ErrorCode(String errorCode){
            this(errorCode, "");
        }

        @Override
        public String toString() {
            return errorCode + " - " + errorMessage;
        }
    }
}
