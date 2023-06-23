package com.example.AppPortal;

import java.util.HashMap;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.AppPortal.KYC.WSKYCPMGETACTIONNAIRE.wsdl.TWSKYCPMGETACTIONNAIREType.GTWSKYCPMGETACTIONNAIREDetailType.MTWSKYCPMGETACTIONNAIREDetailType;
import com.example.AppPortal.KYC.WSKYCPMGETACTIONNAIRE.wsdl.WSKYCPMGETACTIONNAIREResponse;



@SpringBootApplication
public class AppPortalKycWskycpmgetactionnaireApplication {
	HashMap<String, String> map = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(AppPortalKycWskycpmgetactionnaireApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(WSKYCPMGETACTIONNAIREAgent quoteAgent) throws Exception {
		String company = "******";// Private data
		String password = "******";// Private data
		String userName = "OFSTWS";
		String ColumnName = "ID";
		String CriteriaValue = "880713";
		String Operand = "EQ";
		
		return args -> {
			JAXBElement<WSKYCPMGETACTIONNAIREResponse> response = (JAXBElement<WSKYCPMGETACTIONNAIREResponse>) 
					quoteAgent.getTransactions(company, password, userName, ColumnName, CriteriaValue, Operand);
			List<MTWSKYCPMGETACTIONNAIREDetailType> MTWSKYCPMBBGDetailType = ((WSKYCPMGETACTIONNAIREResponse)response.getValue()).getTWSKYCPMGETACTIONNAIREType().get(0).getGTWSKYCPMGETACTIONNAIREDetailType().getMTWSKYCPMGETACTIONNAIREDetailType();
			
			for(MTWSKYCPMGETACTIONNAIREDetailType m: MTWSKYCPMBBGDetailType){
				map.put("1", m.getNOM());
				map.put("2", m.getNUMID());
				map.put("3", m.getPRENOM());
			}
			System.out.println(map);
};
	}

}
