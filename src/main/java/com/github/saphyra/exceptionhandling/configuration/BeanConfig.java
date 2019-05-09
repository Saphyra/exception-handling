package com.github.saphyra.exceptionhandling.configuration;

import com.github.saphyra.exceptionhandling.DefaultExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = DefaultExceptionHandler.class)
public class BeanConfig {
}
