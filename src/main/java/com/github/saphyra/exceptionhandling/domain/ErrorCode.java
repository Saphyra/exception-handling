package com.github.saphyra.exceptionhandling.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ErrorCode {
    private final String errorCode;
    private final String errorMessage;

    public ErrorCode(String errorCode) {
        this(errorCode, "");
    }

    @Override
    public String toString() {
        return errorCode + " - " + errorMessage;
    }
}
