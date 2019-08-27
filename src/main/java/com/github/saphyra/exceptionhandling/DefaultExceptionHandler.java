package com.github.saphyra.exceptionhandling;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import com.github.saphyra.exceptionhandling.domain.ErrorResponse;
import com.github.saphyra.exceptionhandling.exception.RestException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@ControllerAdvice
@Slf4j
@RequiredArgsConstructor
public class DefaultExceptionHandler {
    private final Optional<ErrorTranslationAdapter> errorTranslationAdapter;

    @ExceptionHandler(RestException.class)
    public ResponseEntity<ErrorResponse> handleRestException(HttpServletRequest request, RestException ex) {
        log.warn("{} - {}", ex.getMessage(), ex.getErrorMessage(), ex);
        ErrorMessage errorMessage = ex.getErrorMessage();

        String localizedMessage = null;
        if (errorTranslationAdapter.isPresent()) {
            localizedMessage = errorTranslationAdapter.get().translateMessage(request, errorMessage.getErrorCode(), errorMessage.getParams());
        }

        ErrorResponse errorResponse = ErrorResponse.builder()
            .httpStatus(ex.getResponseStatus().value())
            .errorCode(errorMessage.getErrorCode())
            .localizedMessage(localizedMessage)
            .params(errorMessage.getParams())
            .build();

        return new ResponseEntity<>(errorResponse, ex.getResponseStatus());
    }

    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<Void> handleUnchecked(RuntimeException ex) {
        log.error("Internal Server Error: {}. Message: {}", ex.getClass().getName(), ex.getMessage());
        ex.printStackTrace();
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = Throwable.class)
    public ResponseEntity<Void> handleAll(Throwable ex) {
        log.error("Unknown Server Error: {}. Message: {}", ex.getClass().getName(), ex.getMessage());
        ex.printStackTrace();
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
