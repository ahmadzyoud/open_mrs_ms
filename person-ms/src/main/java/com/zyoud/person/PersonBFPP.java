package com.zyoud.person;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class PersonBFPP implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("AAAAAAAAAAAAAAA Inside postProcessBeanFactory");
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("mapClass");
		String[] attributeNames = beanDefinition.attributeNames();
	}

}
