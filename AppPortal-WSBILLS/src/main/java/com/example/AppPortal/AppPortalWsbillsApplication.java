package com.example.AppPortal;

import java.util.HashMap;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.AppPortal.WSBILLS.wsdl.WSBILLSResponse;
import com.example.AppPortal.WSBILLS.wsdl.WSBILLSType.GWSBILLSDetailType.MWSBILLSDetailType;

@SpringBootApplication
public class AppPortalWsbillsApplication {
	HashMap<String, String> map = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(AppPortalWsbillsApplication.class, args);
	}
	/*@Bean
	public CommandLineRunner run(ClientWSBILLS quoteClient) throws Exception {
		String company = "*******";// Private data
		String password = "******";// Private data
		String userName = "CNPTWS";
		String ColumnName = "RIB.CEDANT";
		String CriteriaValue = "3223788101110475180";
		String Operand = "EQ";
		
		return args -> {
			
					JAXBElement<WSBILLSResponse> response = (JAXBElement<WSBILLSResponse>) 
                    quoteClient.getTransactions(company,password,userName, ColumnName, CriteriaValue, Operand);
					
					List<MWSBILLSDetailType> MWSBILLSDetailType = ((WSBILLSResponse)response.getValue()).getWSBILLSType().get(0).getGWSBILLSDetailType().getMWSBILLSDetailType();
					
				for(MWSBILLSDetailType m: MWSBILLSDetailType){
					
			map.put("1", m.getADRESSE());
			map.put("2", m.getAUDITDATETIME());
			map.put("3", m.getDATEEFFET());

					}
					System.out.println(map);
					
					
		};
		
	}*/

}
