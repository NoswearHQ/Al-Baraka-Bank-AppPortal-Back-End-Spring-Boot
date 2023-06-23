package com.example.AppPortal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class WSKYCPPConfig {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.example.AppPortal.KYC.WSKYCPP.wsdl");
		return marshaller;
	}
	@Bean
	public WSKYCPPAgent agent(Jaxb2Marshaller marshaller) {
		WSKYCPPAgent agent = new WSKYCPPAgent();
		agent.setDefaultUri("http://172.16.62.247:9095/WSKYC2/services/TWSKYC");

		agent.setMarshaller(marshaller);
		agent.setUnmarshaller(marshaller);
		return agent;
	}
}
