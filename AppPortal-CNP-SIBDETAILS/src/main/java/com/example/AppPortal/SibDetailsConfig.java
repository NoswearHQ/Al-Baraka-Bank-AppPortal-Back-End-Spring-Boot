package com.example.AppPortal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration

public class SibDetailsConfig {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.example.AppPortal.SIBDETAILS.wsdl");
		return marshaller;
	}

	@Bean
	public SibDetailsAgent agent(Jaxb2Marshaller marshaller) {
		SibDetailsAgent agent = new SibDetailsAgent();
		agent.setDefaultUri("http://172.16.62.247:9095/WSCNP/services/WSCNPSIBTELDETAILS");

		agent.setMarshaller(marshaller);
		agent.setUnmarshaller(marshaller);
		return agent;
	}

}