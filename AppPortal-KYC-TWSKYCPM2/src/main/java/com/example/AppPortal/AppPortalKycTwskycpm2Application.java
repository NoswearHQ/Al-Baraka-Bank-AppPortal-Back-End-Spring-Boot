package com.example.AppPortal;

import java.util.HashMap;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.AppPortal.KYC.TWSKYCPM2.wsdl.TWSKYCPM2Type.GTWSKYCPM2DetailType.MTWSKYCPM2DetailType;
import com.example.AppPortal.KYC.TWSKYCPM2.wsdl.WEBSERVICEKYCPERSONNEMORALEResponse;

@SpringBootApplication
public class AppPortalKycTwskycpm2Application {
	HashMap<String, String> map = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(AppPortalKycTwskycpm2Application.class, args);
	}
	@Bean
	public CommandLineRunner run(TWSKYCPM2Agent quoteAgent) throws Exception {
		String company = "TN0010001";
		String password = "123456";
		String userName = "OFSTWS";
		String ColumnName = "ID";
		String CriteriaValue = "111196";
		String Operand = "EQ";
		
		return args -> {
			JAXBElement<WEBSERVICEKYCPERSONNEMORALEResponse> response = (JAXBElement<WEBSERVICEKYCPERSONNEMORALEResponse>) 
					quoteAgent.getTransactions(company, password, userName, ColumnName, CriteriaValue, Operand);
			List<MTWSKYCPM2DetailType> MTWSKYCPM2DetailType = ((WEBSERVICEKYCPERSONNEMORALEResponse)response.getValue()).getTWSKYCPM2Type().get(0).getGTWSKYCPM2DetailType().getMTWSKYCPM2DetailType();
			
			for(MTWSKYCPM2DetailType m: MTWSKYCPM2DetailType){
				map.put("1", m.getDATETODAY());
				map.put("2", m.getCOUNTRY());
				map.put("3", m.getAGENCE());
				
			}
			System.out.println(map);
};
	}

}
