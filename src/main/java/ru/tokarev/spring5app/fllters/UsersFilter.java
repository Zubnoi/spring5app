package ru.tokarev.spring5app.fllters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Andrey Tokarev on 17.01.2021
 * @project spring5app
 */


public class UsersFilter implements Filter {

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        System.out.println("запрос зашел в фильтр userfilter : " + req.getRequestURI());
        chain.doFilter(request, response);
    }
}
