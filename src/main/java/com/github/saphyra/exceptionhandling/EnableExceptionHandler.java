package com.github.saphyra.exceptionhandling;

import com.github.saphyra.exceptionhandling.configuration.ExceptionHandlerBeanConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(ExceptionHandlerBeanConfig.class)
public @interface EnableExceptionHandler {
}
