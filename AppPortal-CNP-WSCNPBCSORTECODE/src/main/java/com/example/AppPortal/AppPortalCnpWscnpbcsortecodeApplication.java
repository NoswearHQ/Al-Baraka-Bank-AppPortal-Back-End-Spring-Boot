package com.example.AppPortal;

import java.util.HashMap;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.AppPortal.CNP.WSCNPBCSORTECODE.wsdl.*;
import com.example.AppPortal.CNP.WSCNPBCSORTECODE.wsdl.BCSORTCODEType.GBCSORTCODEDetailType.MBCSORTCODEDetailType;

@SpringBootApplication
public class AppPortalCnpWscnpbcsortecodeApplication {
	HashMap<String, String> map = new HashMap<>();
	public static void main(String[] args) {
		SpringApplication.run(AppPortalCnpWscnpbcsortecodeApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(CNPWSCNPBCSORTECODEAgent quoteAgent) throws Exception {
		String company = "****";// Private data
		String password = "******";// Private data
		String userName = "NOSWEAR";
		String ColumnName = "@ID";
		String CriteriaValue = "32000";
		String Operand = "EQ";
		
		return args -> {
			
					JAXBElement<WSCNPBCSORTCODEResponse> response = (JAXBElement<WSCNPBCSORTCODEResponse>) 
                    quoteAgent.getTransactions(company, password, userName, ColumnName, CriteriaValue, Operand);
					
					List<MBCSORTCODEDetailType> mBCSORTCODEDetailType = ((WSCNPBCSORTCODEResponse)response.getValue()).getBCSORTCODEType().get(0).getGBCSORTCODEDetailType().getMBCSORTCODEDetailType();
					
				for(MBCSORTCODEDetailType m: mBCSORTCODEDetailType){
					
			map.put("1", m.getID());
			map.put("2", m.getNAME());
			map.put("3", m.getPOSTCODE());

					}
					System.out.println(map);
					
					
		};
		
	}

}