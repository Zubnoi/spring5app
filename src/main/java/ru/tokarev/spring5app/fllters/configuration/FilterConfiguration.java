package ru.tokarev.spring5app.fllters.configuration;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.tokarev.spring5app.fllters.UsersFilter;

/**
 * @author Andrey Tokarev on 17.01.2021
 * @project spring5app
 */

@Configuration
public class FilterConfiguration {

    @Bean
    public FilterRegistrationBean<UsersFilter> loggingFilter(){
        FilterRegistrationBean<UsersFilter> registrationBean
                = new FilterRegistrationBean<>();

        registrationBean.setFilter(new UsersFilter());
        registrationBean.addUrlPatterns("/users/*");

        return registrationBean;
    }
}
