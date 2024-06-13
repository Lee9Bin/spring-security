package com.gyubs.filter;

import jakarta.servlet.*;
import org.springframework.security.web.server.csrf.CsrfToken;

import java.io.IOException;
import java.util.logging.Logger;

public class CsrfTokenLogger implements Filter {
    private Logger logger =
            Logger.getLogger(CsrfTokenLogger.class.getName());

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain filterChain)
            throws IOException, ServletException {

        CsrfToken o =
                (CsrfToken) request.getAttribute("_csrf");

        logger.info("CSRF token " + o.getToken());

        filterChain.doFilter(request, response);
    }
}
