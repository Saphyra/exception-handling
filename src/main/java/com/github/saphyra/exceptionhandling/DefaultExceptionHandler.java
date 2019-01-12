package com.github.saphyra.exceptionhandling;

import com.github.saphyra.exceptionhandling.exception.RestException;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class DefaultExceptionHandler {
    @ExceptionHandler(RestException.class)
    public ResponseEntity<ErrorResponse> handleRestException(RestException ex) {
        log.warn("{} - {}", ex.getMessage(), ex.getErrorCode());
        ex.printStackTrace();
        return new ResponseEntity<>(new ErrorResponse(ex.getMessage(), ex.getErrorCode()), ex.getResponseStatus());
    }

    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<ErrorResponse> handleUnchecked(RuntimeException ex) {
        log.error("Internal Server Error: {}. Message: {}", ex.getClass().getName(), ex.getMessage());
        ex.printStackTrace();
        return new ResponseEntity<>(new ErrorResponse(ex.getMessage(), RestException.DEFAULT_ERROR_CODE), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = Throwable.class)
    public ResponseEntity<ErrorResponse> handleAll(Throwable ex) {
        log.error("Unknown Server Error: {}. Message: {}", ex.getClass().getName(), ex.getMessage());
        ex.printStackTrace();
        return new ResponseEntity<>(new ErrorResponse(ex.getMessage(), RestException.DEFAULT_ERROR_CODE), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Data
    private static class ErrorResponse {
        private final String message;
        private final RestException.ErrorCode errorCode;
    }
}
