package com.github.saphyra.exceptionhandling.exception;

import com.github.saphyra.exceptionhandling.domain.ErrorMessage;
import org.springframework.http.HttpStatus;

public class ProxyAuthenticationRequiredException extends RestException {
    private static final HttpStatus STATUS = HttpStatus.PROXY_AUTHENTICATION_REQUIRED;

    public ProxyAuthenticationRequiredException(String logMessage) {
        super(STATUS, logMessage);
    }

    public ProxyAuthenticationRequiredException(ErrorMessage errorMessage, String logMessage){
        super(STATUS, errorMessage, logMessage);
    }
}
