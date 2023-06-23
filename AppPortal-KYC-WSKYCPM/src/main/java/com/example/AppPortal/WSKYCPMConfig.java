package com.example.AppPortal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class WSKYCPMConfig {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.example.AppPortal.KYC.WSKYCPM.wsdl");
		return marshaller;
	}
	@Bean
	public WSKYCPMAgent agent(Jaxb2Marshaller marshaller) {
		WSKYCPMAgent agent = new WSKYCPMAgent();
		agent.setDefaultUri("http://172.16.62.247:9095/TWS.KYC/services/WSKYCPM");

		agent.setMarshaller(marshaller);
		agent.setUnmarshaller(marshaller);
		return agent;
	}
}
