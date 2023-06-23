package com.example.AppPortal;

import java.util.HashMap;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.AppPortal.CNP.CHEQUERETURNED.wsdl.CHEQUESRTNDType.GCHEQUESRTNDDetailType.MCHEQUESRTNDDetailType;
import com.example.AppPortal.CNP.CHEQUERETURNED.wsdl.WSCNPCHEQUESRETURNEDResponse;


@SpringBootApplication
public class AppPortalCnpChequereturnedApplication {
	HashMap<String, String> map = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(AppPortalCnpChequereturnedApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(ChequeReturnedAgent quoteAgent) throws Exception {
		String company = "*********"; // Private data
		String password = "*******";// Private data
		String userName = "NOSWEAR";
		String ColumnName = "@ID";
		String CriteriaValue = "0572286";
		String Operand = "EQ";
		
		return args -> {
			
					JAXBElement<WSCNPCHEQUESRETURNEDResponse> response = (JAXBElement<WSCNPCHEQUESRETURNEDResponse>) 
                    quoteAgent.getTransactions(company, password, userName, ColumnName, CriteriaValue, Operand);
					
					List<MCHEQUESRTNDDetailType> mCHEQUESRTNDDetailType = ((WSCNPCHEQUESRETURNEDResponse)response.getValue()).getCHEQUESRTNDType().get(0).getGCHEQUESRTNDDetailType().getMCHEQUESRTNDDetailType();
					
				for(MCHEQUESRTNDDetailType m: mCHEQUESRTNDDetailType){
					
			map.put("1", m.getID());
			map.put("2", m.getACCOUNTCCY());
			map.put("3", m.getACCOUNTHN());
			map.put("4", m.getACCOUNTNO());
			map.put("5", m.getBENEFICIARY());
			map.put("6", m.getCHEQUEAMOUNT());
			map.put("7", m.getCHEQUECCY());
			map.put("8", m.getCHEQUEDATE());
			map.put("9", m.getCHEQUESTATUS());
			map.put("10", m.getCLEARINGMODE());
			map.put("11", m.getDATEANR());
			map.put("12", m.getDATEARP());
			map.put("13", m.getDATECHQISSUED());
			map.put("14", m.getDATEPROTET());
			map.put("15", m.getDATEUNBLOCKED());
			map.put("16", m.getFEESHN());
			map.put("17", m.getINPCHEQUESTATUS());
			map.put("18", m.getINPREASON());
			map.put("19", m.getINPRETURNDATE());
			map.put("20", m.getINTRETARD());
			map.put("21", m.getNEXTREVIEWDATE());
			map.put("22", m.getNUMBERPROTET());
			map.put("23", m.getPENALTY());
			map.put("24", m.getPLACE());
			map.put("25", m.getPREAVISREFNO());
			map.put("26", m.getPRESENTINGBANK());
			map.put("27", m.getPROVISIONACCT());
			map.put("28", m.getPROVISIONAMT());
			map.put("29", m.getPROVISIONCCY());
			map.put("30", m.getREASON());
			map.put("31", m.getREGULARISATNDATE());
			map.put("32", m.getREGULARIZE());
			map.put("33", m.getREJECTED());
			map.put("34", m.getRETURNDATE());
			map.put("35", m.getRIBBENEFICIARY());
			

					}
					System.out.println(map);
					
					
		};
		
	}

}
