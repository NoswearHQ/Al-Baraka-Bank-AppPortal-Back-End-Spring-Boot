package com.example.AppPortal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration

public class WSKYCPMGETACTIONNAIREConfig {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.example.AppPortal.KYC.WSKYCPMGETACTIONNAIRE.wsdl");
		return marshaller;
	}
	@Bean
	public WSKYCPMGETACTIONNAIREAgent agent(Jaxb2Marshaller marshaller) {
		WSKYCPMGETACTIONNAIREAgent agent = new WSKYCPMGETACTIONNAIREAgent();
		agent.setDefaultUri("http://172.16.62.247:9095/TWS.KYC/services/WSKYCPMGETACTIONNAIRE");

		agent.setMarshaller(marshaller);
		agent.setUnmarshaller(marshaller);
		return agent;
	}
}
