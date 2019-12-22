package com.linkedin.learning.linkedinlearningfullstackappangularspringboot.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class ConversionConfig {
	
	private Set<Converter> getConverters()
	{
		Set<Converter> converters = new HashSet<Converter>();
		return converters;
	}
	
	public ConversionService conversionService()
	{
		ConversionServiceFactoryBean bean = new ConversionServiceFactoryBean();
		bean.setConverters(getConverters());
		bean.afterPropertiesSet();
		return bean.getObject();
	}

}
