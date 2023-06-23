package com.example.AppPortal.controller;





import javax.jws.WebService;
import javax.xml.bind.JAXBElement;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.AppPortal.*;
import com.example.AppPortal.Auth.wsdl.WSAUTHENTIFICATIONResponse;
@RestController
 
@WebService(name = "WSAUTH", targetNamespace="http://172.16.62.248:9095/WSAUTH/services" )
@CrossOrigin(origins = "http://localhost:4200")
public class AuthAppPortalController {
	@Autowired

	ClientWSAuth clt;
	
	@RequestMapping("/")
	public String index( ) {
	
		return "index";
	}
	@RequestMapping("**")
	public String Notfound404() {
		return "Sorry you are in the wrong place !";
	}
	
	
	/*@PostMapping(value = "/loginn") 
    public WSResponse requestOTP(@RequestParam(value="company") String company,
    		                 @RequestParam(value="password") String password,
    		                 @RequestParam(value="userName") String userName,
    		                 @RequestParam(value="columnName") String columnName,
    		                 @RequestParam(value="criteriaValue") String criteriaValue,
    		                 @RequestParam(value="operand") String operand) {
		
		JAXBElement<WSAUTHENTIFICATIONResponse> response = (JAXBElement<WSAUTHENTIFICATIONResponse>) clt.getTransactions(company,password,userName, columnName, criteriaValue, operand);
				
				List<MUSERAUTHDetailType> MUSERAUTHDetailType = ((WSAUTHENTIFICATIONResponse)response.getValue()).getUSERAUTHType().get(0).getGUSERAUTHDetailType().getMUSERAUTHDetailType();
				HashMap<String, String> map = new HashMap<>();
			for(MUSERAUTHDetailType m: MUSERAUTHDetailType){
				
		map.put("1", m.getAGENCE());
		map.put("2", m.getAPP());
		map.put("3", m.getCODEAGENCE());

				}
			
			String message = "cc";
			return new WSResponse(message,message);
	}
	*/
	
														//POST With parameters {RequestParam}
	
	@RequestMapping(value = "/LOGParam", method = RequestMethod.POST)
	public JAXBElement<WSAUTHENTIFICATIONResponse>  getTransactions(
			@RequestParam(value="company")		String company, 
			@RequestParam(value="password")	String password,
			@RequestParam(value="userName")	String userName, 
			@RequestParam(value="ColumnName")	String ColumnName, 
			@RequestParam(value="CriteriaValue")	String CriteriaValue, 
			@RequestParam(value="Operand")	String Operand ){
		
	try {
			//System.out.println("dd");
			return clt.getTransactions(company, password, userName, ColumnName, CriteriaValue, Operand);
			
		} catch (Exception e)
	{
		e.toString();
		return clt.getTransactions(company, password, userName, ColumnName, CriteriaValue, Operand);
		}
	}
	
	
	
	
													//POST With Class Object {RequestBody}
	
	
	@RequestMapping(value = "/LOGModel", method = RequestMethod.POST)
	public JAXBElement<WSAUTHENTIFICATIONResponse> getTransactions(@RequestBody AuthModel authModel)
	{
		return clt.getTransactions(authModel);
		
	}
	
	

}