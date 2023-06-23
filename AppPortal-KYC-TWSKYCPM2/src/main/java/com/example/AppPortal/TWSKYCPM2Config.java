package com.example.AppPortal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class TWSKYCPM2Config {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.example.AppPortal.KYC.TWSKYCPM2.wsdl");
		return marshaller;
	}
	@Bean
	public TWSKYCPM2Agent agent(Jaxb2Marshaller marshaller) {
		TWSKYCPM2Agent agent = new TWSKYCPM2Agent();
		agent.setDefaultUri("http://172.16.62.247:9095/TWSKYCPM2/services/WEBSERVICEKYCPERSONNEMORALE");

		agent.setMarshaller(marshaller);
		agent.setUnmarshaller(marshaller);
		return agent;
	}
}
