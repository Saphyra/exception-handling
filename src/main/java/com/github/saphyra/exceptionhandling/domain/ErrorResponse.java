package com.github.saphyra.exceptionhandling.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class ErrorResponse {
    private final int httpStatus;
    private final String errorCode;
    private final String localizedMessage;
    private final Map<String, String> params;
}
