package com.lkhadirn.filters;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class RequestDispatcherCheckerFilter extends OncePerRequestFilter {

    @Override
    public void doFilterInternal(HttpServletRequest request,
                                 HttpServletResponse response,
                                 FilterChain filterChain) throws ServletException, IOException {
        String uri = request.getRequestURI();
        //debug on this to check which requestDispatcher will be used based on the uri
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(uri);
        filterChain.doFilter(request, response);
    }
}
