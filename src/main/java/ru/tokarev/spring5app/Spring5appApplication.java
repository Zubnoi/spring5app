package ru.tokarev.spring5app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import ru.tokarev.spring5app.fllters.RequestResponseLoggingFilter;

@SpringBootApplication
public class Spring5appApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5appApplication.class, args);
	}



}
