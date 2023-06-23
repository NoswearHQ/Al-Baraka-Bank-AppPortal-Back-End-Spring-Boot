package com.example.AppPortal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration

public class WSPREVOUTConfig 
{
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.example.AppPortal.WSPREV.OUT.wsdl");
		return marshaller;
	}

	@Bean
	public ClientWSPREVOUT client(Jaxb2Marshaller marshaller) 
	{
		ClientWSPREVOUT client = new ClientWSPREVOUT();
		client.setDefaultUri("http://172.16.62.246:9095/prelevement/services/WSSIBTELPRELEVOUT");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}
