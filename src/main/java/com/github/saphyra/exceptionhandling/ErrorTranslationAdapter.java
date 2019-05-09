package com.github.saphyra.exceptionhandling;

import java.util.Map;

public interface ErrorTranslationAdapter {
    default String translateMessage(String errorCode, Map<String, String> params) {
        return "Could not translate errorCode " + errorCode;
    }
}
