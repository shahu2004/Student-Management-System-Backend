package com;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class Myapplication  implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext ap=new AnnotationConfigWebApplicationContext();
		ap.register(Springcofi.class);
		
		DispatcherServlet d=new DispatcherServlet(ap);
		
		ServletRegistration.Dynamic ds=servletContext.addServlet("d", d);
		
		ds.addMapping("/");
	}

}
