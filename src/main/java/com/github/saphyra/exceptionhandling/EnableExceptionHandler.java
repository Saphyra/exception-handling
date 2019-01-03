package com.github.saphyra.exceptionhandling;

import com.github.saphyra.exceptionhandling.configuration.BeanConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(BeanConfig.class)
public @interface EnableExceptionHandler {
}
