package ru.tokarev.spring5app.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Andrey Tokarev on 17.01.2021
 * @project spring5app
 */

@Component
public class LoggerInterceptor implements HandlerInterceptor {
    private static Logger log = LoggerFactory.getLogger(LoggerInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handle) throws Exception{
        log.info("[preHandle][" + req + "]" + "[" + req.getMethod()
                + "]" + req.getRequestURI());

        return true;
    }

}
