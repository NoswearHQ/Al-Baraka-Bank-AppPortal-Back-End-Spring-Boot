package com.example.AppPortal;

import javax.xml.bind.JAXBElement;

import java.util.HashMap;
import java.util.List;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.AppPortal.Auth.wsdl.*;
import com.example.AppPortal.ClientWSAuth;
import com.example.AppPortal.Auth.wsdl.USERAUTHType.GUSERAUTHDetailType.MUSERAUTHDetailType;

import com.example.AppPortal.Auth.wsdl.WSAUTHENTIFICATIONResponse;

import jdk.nashorn.api.scripting.JSObject;




@SpringBootApplication
public class AppPortalApplication {
	HashMap<String, String> map = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(AppPortalApplication.class, args);
	}
	
	@Bean
	
	public CommandLineRunner run(ClientWSAuth quoteClient) throws Exception {
		String company = "******";
		String password = "********";
		String userName = "NOSWEAR";
		String ColumnName = "SIGN.ON.NAME";
		String CriteriaValue = "NOSWEAR";
		String Operand = "EQ";
		
		return args -> {
			
					JAXBElement<WSAUTHENTIFICATIONResponse> response = (JAXBElement<WSAUTHENTIFICATIONResponse>) 
                    quoteClient.getTransactions(company,password,userName, ColumnName, CriteriaValue, Operand);
					
					List<MUSERAUTHDetailType> MUSERAUTHDetailType = ((WSAUTHENTIFICATIONResponse)response.getValue()).getUSERAUTHType().get(0).getGUSERAUTHDetailType().getMUSERAUTHDetailType();
					
			/*	for(MUSERAUTHDetailType m: MUSERAUTHDetailType){
					
			map.put("1", m.getAGENCE());
			map.put("2", m.getAPP());
			map.put("3", m.getCODEAGENCE());

					}
					System.out.println(map);*/
					
					
		};
		
	}
	

}
