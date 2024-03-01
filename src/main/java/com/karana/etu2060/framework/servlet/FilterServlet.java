package com.karana.etu2060.framework.servlet;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;

public class FilterServlet implements Filter {

	@Override
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("FilterServlet init!");
	}

	@Override
	public void destroy() {
		System.out.println("FilterServlet destroy!");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String requestURI = httpRequest.getRequestURI();
        // Get the servlet path and set it as a request attribute
        String servletPath = httpRequest.getServletPath();
        String httpMethod = httpRequest.getMethod();
        // Check if the request is for a .css or .js file or .jsp or .html
        if(!requestURI.contains(".") && !servletPath.contains("index")) {
            // Forward the request to FrontServlet
            request.setAttribute("servletPath", servletPath + " " + httpMethod);
            request.setAttribute("httpMethod", httpMethod);
            RequestDispatcher dispatcher = httpRequest.getRequestDispatcher("/FrontServlet");
            dispatcher.forward(request, response);
        }else{
            // Proceed with the filter chain
            chain.doFilter(request, response);
        }
	}

}