package ru.tokarev.spring5app.interceptors.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import ru.tokarev.spring5app.interceptors.LoggerInterceptor;

/**
 * @author Andrey Tokarev on 17.01.2021
 * @project spring5app
 */


@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    LoggerInterceptor LoggerInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(LoggerInterceptor);
    }
}