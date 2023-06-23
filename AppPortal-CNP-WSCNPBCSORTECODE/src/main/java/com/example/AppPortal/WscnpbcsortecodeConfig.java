package com.example.AppPortal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
@Configuration
public class WscnpbcsortecodeConfig {


	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.example.AppPortal.CNP.WSCNPBCSORTECODE.wsdl");
		return marshaller;
	}

	@Bean
	public CNPWSCNPBCSORTECODEAgent agent(Jaxb2Marshaller marshaller) {
		CNPWSCNPBCSORTECODEAgent agent = new CNPWSCNPBCSORTECODEAgent();
		agent.setDefaultUri("http://172.16.62.247:9095/WSCNP/services/WSCNPBCSORTCODE");

		agent.setMarshaller(marshaller);
		agent.setUnmarshaller(marshaller);
		return agent;
	}

}

