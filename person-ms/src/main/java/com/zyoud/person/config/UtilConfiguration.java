package com.zyoud.person.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zyoud.person.PersonBFPP;

@Configuration
public class UtilConfiguration {
	@Bean
	public static PersonBFPP getPersonBFPP() {
		return new PersonBFPP();
	}

//	@Bean(name = "mapConfig")
//	public PersonMapper getPersonMapper() {
//		return new PersonMaperImpl();
//	}

}
