package com.github.saphyra.exceptionhandling;

import com.github.saphyra.exceptionhandling.exception.RestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class DefaultExceptionHandler {
    @ExceptionHandler(RestException.class)
    public ResponseEntity<String> handleRestException(RestException e) {
        log.warn(e.getMessage());
        e.printStackTrace();
        return new ResponseEntity<>(e.getMessage(), e.getResponseStatus());
    }

    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<String> handleUnchecked(RuntimeException ex){
        log.error("Internal Server Error: {}. Message: {}", ex.getClass().getName(), ex.getMessage());
        ex.printStackTrace();
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = Throwable.class)
    public ResponseEntity<String> handleAll(Throwable ex){
        log.error("Unknown Server Error: {}. Message: {}", ex.getClass().getName(), ex.getMessage());
        ex.printStackTrace();
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
