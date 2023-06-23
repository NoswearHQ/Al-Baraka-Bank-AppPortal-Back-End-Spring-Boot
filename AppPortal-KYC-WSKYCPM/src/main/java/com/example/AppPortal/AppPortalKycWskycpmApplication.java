package com.example.AppPortal;

import java.util.HashMap;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.AppPortal.KYC.WSKYCPM.wsdl.TWSKYCPMType.GTWSKYCPMDetailType.MTWSKYCPMDetailType;
import com.example.AppPortal.KYC.WSKYCPM.wsdl.WSKYCPMResponse;

@SpringBootApplication
public class AppPortalKycWskycpmApplication {
	HashMap<String, String> map = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(AppPortalKycWskycpmApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(WSKYCPMAgent quoteAgent) throws Exception {
		String company = "******"; // Private data
		String password = "*****"; // Private data
		String userName = "OFSTWS";
		String ColumnName = "@ID";
		String CriteriaValue = "88713";
		String Operand = "EQ";
		
		return args -> {
			JAXBElement<WSKYCPMResponse> response = (JAXBElement<WSKYCPMResponse>) 
					quoteAgent.getTransactions(company, password, userName, ColumnName, CriteriaValue, Operand);
			List<MTWSKYCPMDetailType> MTWSKYCPMDetailType = ((WSKYCPMResponse)response.getValue()).getTWSKYCPMType().get(0).getGTWSKYCPMDetailType().getMTWSKYCPMDetailType();
			
			for(MTWSKYCPMDetailType m: MTWSKYCPMDetailType){
				map.put("1", m.getADDRESS());
				map.put("2", m.getCOUNTRY());
				map.put("3", m.getCOUNTRY());
			}
			System.out.println(map);
};
	}

}
