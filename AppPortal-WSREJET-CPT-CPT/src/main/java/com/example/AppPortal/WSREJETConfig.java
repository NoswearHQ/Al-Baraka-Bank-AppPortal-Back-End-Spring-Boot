package com.example.AppPortal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
@Configuration

public class WSREJETConfig {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.example.AppPortal.WSREJET.CPT.CPT.wsdl");
		return marshaller;
	}

	@Bean
	public ClientWSREJET client(Jaxb2Marshaller marshaller) 
	{
		ClientWSREJET client = new ClientWSREJET();
		client.setDefaultUri("http://172.16.62.246:9095/prelevement/services/WSREJETCPTCPT");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}