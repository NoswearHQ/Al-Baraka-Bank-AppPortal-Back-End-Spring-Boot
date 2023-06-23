package com.example.AppPortal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration

public class DigitToStringConfig {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.example.AppPortal.CNP.DIGITTOSTRING.wsdl");
		return marshaller;
	}

	@Bean
	public DigitToStringAgent agent(Jaxb2Marshaller marshaller) {
		DigitToStringAgent agent = new DigitToStringAgent();
		agent.setDefaultUri("http://172.16.62.247:9095/WSCNP/services/WSCNPDIGITTOSTRING");

		agent.setMarshaller(marshaller);
		agent.setUnmarshaller(marshaller);
		return agent;
	}

}