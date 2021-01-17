package ru.tokarev.spring5app.fllters;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpServerErrorException;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author Andrey Tokarev on 17.01.2021
 * @project spring5app
 */

@Component
@Order(1)
public class TransactionFilter implements Filter {

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        System.out.println("запрос зашел в фильтр транзакции");
        filterChain.doFilter(req, response);

    }
}
