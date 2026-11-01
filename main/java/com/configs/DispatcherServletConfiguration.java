package com.configs;

import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?> @Nullable [] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?> @Nullable [] getServletConfigClasses() {
		
		Class[] configClasses = { Configs.class };
		return configClasses;
	}

	@Override
	protected String[] getServletMappings() {
		String[] mappings = { "/flm/*" };
		return mappings;
	}
	
	

}