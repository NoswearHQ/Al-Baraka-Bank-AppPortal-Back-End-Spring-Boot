package com.example.AppPortal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration

public class WSBILLSConfig 
{

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.example.AppPortal.WSBILLS.wsdl");
		return marshaller;
	}

	@Bean
	public ClientWSBILLS client(Jaxb2Marshaller marshaller) 
	{
		ClientWSBILLS client = new ClientWSBILLS();
		client.setDefaultUri("http://172.16.62.246:9095/BILLS/services/WSBILLS");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}