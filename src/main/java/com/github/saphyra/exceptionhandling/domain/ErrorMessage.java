package com.github.saphyra.exceptionhandling.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
public class ErrorMessage {
    private final String errorCode;
    private final String errorMessage;

    @Builder.Default
    private final Map<String, String> params = new HashMap<>();

    public ErrorMessage(String errorCode) {
        this(errorCode, "", new HashMap<>());
    }

    public ErrorMessage(String errorCode, Map<String, String> params) {
        this(errorCode, "", params);
    }

    @Override
    public String toString() {
        return errorCode + " - " + errorMessage;
    }
}
