package com.example.AppPortal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SibComptDetailsConfig {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.example.AppPortal.CNP.SIBCOMPDETAILS.wsdl");
		return marshaller;
	}

	@Bean
	public SibComptDetailsAgent agent(Jaxb2Marshaller marshaller) {
		SibComptDetailsAgent agent = new SibComptDetailsAgent();
		agent.setDefaultUri("http://172.16.62.247:9095/WSCNP/services/WSCNPSIBTELCOMPDETAILS");

		agent.setMarshaller(marshaller);
		agent.setUnmarshaller(marshaller);
		return agent;
	}


}
