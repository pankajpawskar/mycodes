package com.xworkz.nexus.webInitializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.nexus.configuration.SpringConfiguration;

public class SpringWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	public SpringWebInitializer() {
		System.out.println("SpringWebInitializer created");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses");
		return new Class[] { SpringConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("getServletConfigClasses");
		return null;
	}

}
