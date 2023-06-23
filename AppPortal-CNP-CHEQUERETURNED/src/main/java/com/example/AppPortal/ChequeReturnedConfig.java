package com.example.AppPortal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration

public class ChequeReturnedConfig {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.example.AppPortal.CNP.CHEQUERETURNED.wsdl");
		return marshaller;
	}

	@Bean
	public ChequeReturnedAgent agent(Jaxb2Marshaller marshaller) {
		ChequeReturnedAgent agent = new ChequeReturnedAgent();
		agent.setDefaultUri("http://172.16.62.247:9095/WSCNP/services/WSCNPCHEQUESRETURNED");

		agent.setMarshaller(marshaller);
		agent.setUnmarshaller(marshaller);
		return agent;
	}

}

