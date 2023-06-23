package com.example.AppPortal;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import javax.xml.bind.JAXBElement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.AppPortal.SIBDETAILS.wsdl.SDETAILSType.GSDETAILSDetailType.MSDETAILSDetailType;
import com.example.AppPortal.SIBDETAILS.wsdl.WSCNPSIBTELDETAILSResponse;



@SpringBootApplication
public class AppPortalCnpSibdetailsApplication {
	HashMap<String, String> map = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(AppPortalCnpSibdetailsApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(SibDetailsAgent quoteAgent) throws Exception {
		String company = "TN0010001";
		String password = "369369";
		String userName = "NOSWEAR";
		
		String ColumnName = "NUMERO.CHEQUE";
		String CriteriaValue = "5443787";
		String Operand = "EQ";
		
		
return args -> {
			
			JAXBElement<WSCNPSIBTELDETAILSResponse> response = (JAXBElement<WSCNPSIBTELDETAILSResponse>) 
                 quoteAgent.getTransactions(company, password, userName, ColumnName, CriteriaValue, Operand);
					
		List<MSDETAILSDetailType> mSDETAILSDetailType = ((WSCNPSIBTELDETAILSResponse)response.getValue()).getSDETAILSType().get(0).getGSDETAILSDetailType().getMSDETAILSDetailType();

		
		for(MSDETAILSDetailType m: mSDETAILSDetailType){
			
	
	map.put("1", m.getADRESSENUMERO());
	map.put("2", m.getCODEAGCDEST());
	map.put("3", m.getCODECENTREREG());
	map.put("4", m.getCODEDEVISE());
	map.put("5", m.getCODEDEVISEPOS());
	map.put("6", m.getCODEINSTDEST());
	map.put("7", m.getCODEPOSTAL());
	map.put("8", m.getCODEREMETTANT());
	map.put("9", m.getCODEVALEUR());
	map.put("10", m.getDATECNP());
	

	map.put("21", m.getDATEDLVRCHEQUE());
	map.put("22", m.getDATEEMISSION());
	map.put("23", m.getDATEEMISSPAPILLON());
	map.put("24", m.getDATEETABCNP());
	map.put("25", m.getDATEOPERATION());
	map.put("26", m.getDATEPREAVIS());
	map.put("27", m.getDATEPRSNTCHEQUE());
	map.put("28", m.getFLAG());
	map.put("29", m.getID());
	map.put("30", m.getIDENTIFIANTRCS());
	

	map.put("31", m.getLIEUEMISSION());
	//map.put("32", m.getM());
	map.put("33", m.getMNTINTERET());
	map.put("34", m.getMNTREGULARISE());
	map.put("35", m.getMONTANTCHEQUE());
	map.put("36", m.getMONTANTPROVISION());
	map.put("37", m.getMONTANTRECLAME());
	map.put("38", m.getMOTIFREJET());
	map.put("39", m.getNAMEPORTEUR());
	map.put("40", m.getNATURECOMPTE());
	

	map.put("41", m.getNATUREPERSONNE());
	map.put("42", m.getNATUREREMETTANT());
	map.put("43", m.getNMBRENRGCMPLT());
	map.put("44", m.getNOMRUE());
	map.put("45", m.getNUMEROCHEQUE());
	map.put("46", m.getNUMEROCNP());
	map.put("47", m.getNUMEROCRDIDENTITE());
	map.put("48", m.getNUMEROLOT());
	map.put("49", m.getNUMEROPOSTALE());
	map.put("50", m.getNUMPAPILLON());

	map.put("51", m.getQUALITE());
	map.put("52", m.getRANG());
	map.put("53", m.getREFCLEPULC());
	map.put("54", m.getRIBPORTEUR());
	map.put("55", m.getSENS());
	map.put("56", m.getSIGNELECT());
	map.put("57", m.getSITUATIONPORTEUR());
	map.put("58", m.getTYPEPERSONNE());
	
	
		}
		for (Entry<String, String> mapentry : map.entrySet()) {
	           System.out.println("clé: "+mapentry.getKey() 
	                              + " | valeur: " + mapentry.getValue());
	        }			
			
};

}

}
