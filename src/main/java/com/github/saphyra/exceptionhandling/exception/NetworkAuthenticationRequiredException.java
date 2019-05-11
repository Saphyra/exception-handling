package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import org.springframework.http.HttpStatus;

public class NetworkAuthenticationRequiredException extends RestException {
    private static final HttpStatus STATUS = HttpStatus.NETWORK_AUTHENTICATION_REQUIRED;

    public NetworkAuthenticationRequiredException(String logMessage) {
        super(STATUS, logMessage);
    }

    public NetworkAuthenticationRequiredException(ErrorMessage errorMessage, String logMessage){
        super(STATUS, errorMessage, logMessage);
    }
}
