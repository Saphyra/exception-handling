package com.github.saphyra.exceptionhandling.configuration;

import com.github.saphyra.exceptionhandling.DefaultExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public DefaultExceptionHandler defaultExceptionHandler() {
        return new DefaultExceptionHandler();
    }
}
