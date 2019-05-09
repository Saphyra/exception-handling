package com.github.saphyra.exceptionhandling.domain;

import lombok.Data;

@Data
public class ErrorResponse {
    private final String message;
    private final ErrorCode errorCode;
}
