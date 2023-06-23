package com.example.AppPortal;

import java.util.HashMap;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class AppPortalWsprevOutApplication {
	HashMap<String, String> map = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(AppPortalWsprevOutApplication.class, args);
	}
	/*@Bean
	public CommandLineRunner run(ClientWSPREVOUT quoteClient) throws Exception {
		String company = "TN0010001";
		String password = "123456";
		String userName = "CNPTWS";
		String ColumnName = "COMPTE.CL.CR";
		String CriteriaValue = "0007883180025661";
		String Operand = "EQ";
		
		return args -> {
			
					JAXBElement<WSREJETCPTCPTResponse> response = (JAXBElement<WSREJETCPTCPTResponse>) 
                    quoteClient.getTransactions(company,password,userName, ColumnName, CriteriaValue, Operand);
					
					List<MREJETCPTCPTDetailType> MWSBILLSDetailType = ((WSREJETCPTCPTResponse)response.getValue()).getREJETCPTCPTType().get(0).getGREJETCPTCPTDetailType().getMREJETCPTCPTDetailType();
					
				for(MREJETCPTCPTDetailType m: MWSBILLSDetailType){
					
			map.put("1", m.getAMT());
			map.put("2", m.getDATEECHEANCE());
			map.put("3", m.getNOMCLCR());

					}
					System.out.println(map);
					
					
		};
		
	}*/
}
