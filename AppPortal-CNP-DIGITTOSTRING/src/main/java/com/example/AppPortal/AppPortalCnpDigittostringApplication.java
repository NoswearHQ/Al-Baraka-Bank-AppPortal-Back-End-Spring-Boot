package com.example.AppPortal;

import java.util.HashMap;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.AppPortal.CNP.DIGITTOSTRING.wsdl.*;
import com.example.AppPortal.CNP.DIGITTOSTRING.wsdl.DIGITTOSTRINGType.GDIGITTOSTRINGDetailType.MDIGITTOSTRINGDetailType;

@SpringBootApplication
public class AppPortalCnpDigittostringApplication {
	HashMap<String, String> map = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(AppPortalCnpDigittostringApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(DigitToStringAgent quoteAgent) throws Exception {
		String company = "TN0010001";
		String password = "369369";
		String userName = "NOSWEAR";
		String ColumnName = "DIGIT";
		String CriteriaValue = "1200";
		String Operand = "EQ";
		
		return args -> {
			
			JAXBElement<WSCNPDIGITTOSTRINGResponse> response = (JAXBElement<WSCNPDIGITTOSTRINGResponse>) 
                 quoteAgent.getTransactions(company, password, userName, ColumnName, CriteriaValue, Operand);
					
		List<MDIGITTOSTRINGDetailType> mDIGITTOSTRINGDetailType = ((WSCNPDIGITTOSTRINGResponse)response.getValue()).getDIGITTOSTRINGType().get(0).getGDIGITTOSTRINGDetailType().getMDIGITTOSTRINGDetailType();

		
		for(MDIGITTOSTRINGDetailType m: mDIGITTOSTRINGDetailType){
			
	
	map.put("1", m.getCONVERTED());
	
	

			}
			System.out.println(map);
			
			
};

}

}