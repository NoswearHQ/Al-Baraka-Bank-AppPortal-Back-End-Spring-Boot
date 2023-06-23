package com.example.AppPortal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;



@Configuration
public class AuthCOnfig {

	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.example.AppPortal.Auth.wsdl");
		return marshaller;
	}

	@Bean
	public ClientWSAuth client(Jaxb2Marshaller marshaller) {
		ClientWSAuth client = new ClientWSAuth();
		client.setDefaultUri("http://172.16.62.247:9095/WSAUTH/services/WSAUTHENTIFICATION");

		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}
