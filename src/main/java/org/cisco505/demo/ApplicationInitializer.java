package org.cisco505.demo;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class ApplicationInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        //bootstrap the dispatcher servlet
    }
}
