package com.example.AppPortal.CNP.CHEQUERETURNED.Controller;

import javax.jws.WebService;
import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.AppPortal.ChequeReturnedAgent;
import com.example.AppPortal.CNP.CHEQUERETURNED.wsdl.WSCNPCHEQUESRETURNEDResponse;


@RestController

@WebService(name = "WSAUTH", targetNamespace="http://172.16.62.248:9095/WSCNP/services" )
@CrossOrigin(origins = "http://localhost:4200")
public class ChequeReturnedController {
	@Autowired

	ChequeReturnedAgent clt;
	
	@RequestMapping("/")
	public String index( ) {
	
		return "index";
	}
	@RequestMapping("**")
	public String Notfound404() {
		return "Sorry you are in the wrong place !";
	}
	
	
	@RequestMapping(value = "/ChequeReturnedParam", method = RequestMethod.POST)
	public JAXBElement<WSCNPCHEQUESRETURNEDResponse>  getTransactions(
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

	@RequestMapping(value = "/ChequeReturnedModel", method = RequestMethod.POST)
	public JAXBElement<WSCNPCHEQUESRETURNEDResponse> getTransactions(@RequestBody ChequeReturnedModel chequeReturnedModel)
	{
		return clt.getTransactions(chequeReturnedModel);
		
	}
}
