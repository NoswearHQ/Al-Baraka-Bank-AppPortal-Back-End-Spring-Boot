package com.example.AppPortal;

import java.util.HashMap;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.AppPortal.CNP.SIBCOMPDETAILS.wsdl.SCOMPDETAILSType.GSCOMPDETAILSDetailType.MSCOMPDETAILSDetailType;
import com.example.AppPortal.CNP.SIBCOMPDETAILS.wsdl.WSCNPSIBTELCOMPDETAILSResponse;

@SpringBootApplication
public class AppPortalCnpSibcompdetailsApplication {
	HashMap<String, String> map = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(AppPortalCnpSibcompdetailsApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(SibComptDetailsAgent quoteAgent) throws Exception {
		String company = "*******";// Private data
		String password = "*******";// Private data
		String userName = "NOSWEAR";
		String ColumnName = "@ID";
		String CriteriaValue = "82120190102.8.002.1";
		String Operand = "EQ";
		
		return args -> {
			
			JAXBElement<WSCNPSIBTELCOMPDETAILSResponse> response = (JAXBElement<WSCNPSIBTELCOMPDETAILSResponse>) 
                 quoteAgent.getTransactions(company, password, userName, ColumnName, CriteriaValue, Operand);
					
		List<MSCOMPDETAILSDetailType> mSCOMPDETAILSDetailType = ((WSCNPSIBTELCOMPDETAILSResponse)response.getValue()).getSCOMPDETAILSType().get(0).getGSCOMPDETAILSDetailType().getMSCOMPDETAILSDetailType();

		
		for(MSCOMPDETAILSDetailType m: mSCOMPDETAILSDetailType){
			
	
	map.put("1", m.getTYPE());
	map.put("2", m.getADRESSE1());
	map.put("3", m.getADRESSE2());
	map.put("4", m.getNOMPRENOM());
	map.put("5", m.getNUMIDVISA());
	map.put("6", m.getRCCL());
	map.put("7", m.getID());
	
	
	

			}
			System.out.println(map);
			
			
};

}

}