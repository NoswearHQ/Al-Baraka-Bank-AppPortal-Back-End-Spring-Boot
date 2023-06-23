package com.example.AppPortal;

import java.util.HashMap;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import com.example.AppPortal.KYC.WSKYCPP.wsdl.TWSKYCResponse;
import com.example.AppPortal.KYC.WSKYCPP.wsdl.TWSKYCPP2Type;
import com.example.AppPortal.KYC.WSKYCPP.wsdl.TWSKYCPP2Type.GTWSKYCPP2DetailType.MTWSKYCPP2DetailType;;


@SpringBootApplication
public class AppPortalKycWskycppApplication {
	HashMap<String, String> map = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(AppPortalKycWskycppApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(WSKYCPPAgent quoteAgent) throws Exception {
		String company = "TN0010001";
		String password = "123456";
		String userName = "OFSTWS";
		String ColumnName = "ID";
		String CriteriaValue = "108108";
		String Operand = "EQ";
		
		return args -> {
			JAXBElement<TWSKYCResponse> response = (JAXBElement<TWSKYCResponse>) 
					quoteAgent.getTransactions(company, password, userName, ColumnName, CriteriaValue, Operand);
			List<MTWSKYCPP2DetailType> mTWSKYCPP2DetailType = ((TWSKYCResponse)response.getValue()).getTWSKYCPP2Type().get(0).getGTWSKYCPP2DetailType().getMTWSKYCPP2DetailType();
			
			for(MTWSKYCPP2DetailType m: mTWSKYCPP2DetailType){
				map.put("1", m.getADRESSE());
				map.put("2", m.getAGENCE());
				map.put("3", m.getANNUALBONUS());
			}
			System.out.println(map);
};
	}
}