package com.github.saphyra.exceptionhandling;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public interface ErrorTranslationAdapter {
    default String translateMessage(HttpServletRequest request, String errorCode, Map<String, String> params) {
        return "Could not translate errorCode " + errorCode;
    }
}
