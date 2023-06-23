package com.example.AppPortal;

import java.util.HashMap;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.AppPortal.KYC.WSKYCPMBBG.wsdl.TWSKYCPMBBGType.GTWSKYCPMBBGDetailType.MTWSKYCPMBBGDetailType;
import com.example.AppPortal.KYC.WSKYCPMBBG.wsdl.WSKYCPMBBGResponse;


@SpringBootApplication
public class AppPortalKycWskycpmbbgApplication {
	HashMap<String, String> map = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(AppPortalKycWskycpmbbgApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(WSKYCPMBBGAgent quoteAgent) throws Exception {
		String company = "TN0010001";
		String password = "123456";
		String userName = "OFSTWS";
		String ColumnName = "ID";
		String CriteriaValue = "88713";
		String Operand = "EQ";
		
		return args -> {
			JAXBElement<WSKYCPMBBGResponse> response = (JAXBElement<WSKYCPMBBGResponse>) 
					quoteAgent.getTransactions(company, password, userName, ColumnName, CriteriaValue, Operand);
			List<MTWSKYCPMBBGDetailType> MTWSKYCPMBBGDetailType = ((WSKYCPMBBGResponse)response.getValue()).getTWSKYCPMBBGType().get(0).getGTWSKYCPMBBGDetailType().getMTWSKYCPMBBGDetailType();
			
			for(MTWSKYCPMBBGDetailType m: MTWSKYCPMBBGDetailType){
				map.put("1", m.getBANQUECHECK());
				map.put("2", m.getBANQUEETRANGERE());
				map.put("3", m.getBANQUELOCALE());
			}
			System.out.println(map);
};
	}

}
