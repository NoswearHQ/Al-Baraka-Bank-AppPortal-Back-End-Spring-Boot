package com.example.AppPortal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration

public class WSKYCPMBBGConfig {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.example.AppPortal.KYC.WSKYCPMBBG.wsdl");
		return marshaller;
	}
	@Bean
	public WSKYCPMBBGAgent agent(Jaxb2Marshaller marshaller) {
		WSKYCPMBBGAgent agent = new WSKYCPMBBGAgent();
		agent.setDefaultUri("http://172.16.62.247:9095/TWS.KYC/services/WSKYCPMBBG");

		agent.setMarshaller(marshaller);
		agent.setUnmarshaller(marshaller);
		return agent;
	}
}
