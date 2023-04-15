package org.example;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

@WebServlet("/calculate")
public class CalculatorServlet implements Servlet {

    private static final Logger log = LoggerFactory.getLogger(CalculatorServlet.class);

    @Override
    public void init(ServletConfig config) throws ServletException {
        log.info("init");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        log.info("service");
    }

    @Override
    public void destroy() {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
}
