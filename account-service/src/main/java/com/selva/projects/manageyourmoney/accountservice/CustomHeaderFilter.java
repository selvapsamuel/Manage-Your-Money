package com.selva.projects.manageyourmoney.accountservice;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class CustomHeaderFilter implements Filter {
	
	@Autowired
	private Environment env;

    @Override
    public void destroy() {
        System.out.println("destroy filter. release our resources here if any");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws
                                                                                              IOException,ServletException {
        HttpServletResponse httpServletResponse=(HttpServletResponse)response;
        httpServletResponse.setHeader("Server-Port",env.getProperty("server.port"));
        chain.doFilter(request, response);      // continue execution of other filter chain.
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Init filter");
    }

}
