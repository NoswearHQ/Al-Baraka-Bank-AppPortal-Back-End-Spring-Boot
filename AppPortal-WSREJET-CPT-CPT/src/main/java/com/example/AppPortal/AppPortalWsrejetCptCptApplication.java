package com.example.AppPortal;

import java.util.HashMap;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.AppPortal.WSREJET.CPT.CPT.wsdl.REJETCPTCPTType.GREJETCPTCPTDetailType.MREJETCPTCPTDetailType;
import com.example.AppPortal.WSREJET.CPT.CPT.wsdl.WSREJETCPTCPTResponse;

@SpringBootApplication
public class AppPortalWsrejetCptCptApplication {
	HashMap<String, String> map = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(AppPortalWsrejetCptCptApplication.class, args);
	}
	/*@Bean
	public CommandLineRunner run(ClientWSREJET quoteClient) throws Exception {
		String company = "********";// Private data
		String password = "******";// Private data
		String userName = "CNPTWS";
		String ColumnName = "COMPTE.CL.CR";
		String CriteriaValue = "0007883180025661";
		String Operand = "EQ";
		
		return args -> {
			
					JAXBElement<WSREJETCPTCPTResponse> response = (JAXBElement<WSREJETCPTCPTResponse>) 
                    quoteClient.getTransactions(company,password,userName, ColumnName, CriteriaValue, Operand);
					
					List<MREJETCPTCPTDetailType> MWSBILLSDetailType = ((WSREJETCPTCPTResponse)response.getValue()).getREJETCPTCPTType().get(0).getGREJETCPTCPTDetailType().getMREJETCPTCPTDetailType();
					
				for(MREJETCPTCPTDetailType m: MWSBILLSDetailType){
					
			map.put("1", m.getAMT());
			map.put("2", m.getDATEECHEANCE());
			map.put("3", m.getNOMCLCR());

					}
					System.out.println(map);
					
					
		};
		
	}*/
}
