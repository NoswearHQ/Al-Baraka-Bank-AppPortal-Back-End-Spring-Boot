package com.example.AppPortal;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.example.AppPortal.CNP.CHEQUERETURNED.Controller.ChequeReturnedModel;
import com.example.AppPortal.CNP.CHEQUERETURNED.wsdl.CHEQUESRTNDType;
import com.example.AppPortal.CNP.CHEQUERETURNED.wsdl.EnquiryInput;
import com.example.AppPortal.CNP.CHEQUERETURNED.wsdl.EnquiryInputCollection;
import com.example.AppPortal.CNP.CHEQUERETURNED.wsdl.ObjectFactory;
import com.example.AppPortal.CNP.CHEQUERETURNED.wsdl.WSCNPCHEQUESRETURNED;
import com.example.AppPortal.CNP.CHEQUERETURNED.wsdl.WSCNPCHEQUESRETURNEDResponse;
import com.example.AppPortal.CNP.CHEQUERETURNED.wsdl.WebRequestCommon;




public class ChequeReturnedAgent extends WebServiceGatewaySupport{
	private static final Logger log = LoggerFactory.getLogger(ChequeReturnedAgent.class);
	//private WebRequestCommon company;
	public JAXBElement<WSCNPCHEQUESRETURNEDResponse> getTransactions(ChequeReturnedModel chequeReturnedModel ) {
		
		
		ObjectFactory of = new ObjectFactory();
		WSCNPCHEQUESRETURNED request = of.createWSCNPCHEQUESRETURNED();
		WebRequestCommon wrc = new WebRequestCommon();
		EnquiryInputCollection eic = new EnquiryInputCollection();
		EnquiryInput ei = new EnquiryInput();
		CHEQUESRTNDType chq = new CHEQUESRTNDType();
		wrc.setCompany(chequeReturnedModel.getCompany());
		wrc.setPassword(chequeReturnedModel.getPassword());
		wrc.setUserName(chequeReturnedModel.getUserName());
		eic.setColumnName(chequeReturnedModel.getColumnName());
		eic.setCriteriaValue(chequeReturnedModel.getCriteriaValue());
		eic.setOperand(chequeReturnedModel.getOperand());
		ei.getEnquiryInputCollection().add(eic);	
		
		request.setWebRequestCommon(wrc);
		request.setCHEQUESRTNDType(ei);
		log.info("Requesting info for " + chequeReturnedModel.getUserName());


		JAXBElement<WSCNPCHEQUESRETURNED> rq = of.createWSCNPCHEQUESRETURNED(request);
		JAXBElement<WSCNPCHEQUESRETURNEDResponse> response = (JAXBElement<WSCNPCHEQUESRETURNEDResponse>) getWebServiceTemplate()
				.marshalSendAndReceive("http://172.16.62.247:9095/WSCNP/services?wsdl",
						rq,
						new SoapActionCallback(
								"http://172.16.62.247:9095/WSCNP/services/WSCNPCHEQUESRETURNED"));


		return response;
}
	
	public JAXBElement<WSCNPCHEQUESRETURNEDResponse> getTransactions(String company, String password,
			String userName, String ColumnName, String CriteriaValue, String Operand ) {
		ObjectFactory of = new ObjectFactory();
		WSCNPCHEQUESRETURNED request = of.createWSCNPCHEQUESRETURNED();
		WebRequestCommon wrc = new WebRequestCommon();
		EnquiryInputCollection eic = new EnquiryInputCollection();
		EnquiryInput ei = new EnquiryInput();
		CHEQUESRTNDType chq = new CHEQUESRTNDType();
		wrc.setCompany(company);
		wrc.setPassword(password);
		wrc.setUserName(userName);
		eic.setColumnName(ColumnName);
		eic.setCriteriaValue(CriteriaValue);
		eic.setOperand(Operand);
		ei.getEnquiryInputCollection().add(eic);			

		request.setWebRequestCommon(wrc);
		request.setCHEQUESRTNDType(ei);

		log.info("Requesting info for " + userName);
		JAXBElement<WSCNPCHEQUESRETURNED> rq = of.createWSCNPCHEQUESRETURNED(request);
		JAXBElement<WSCNPCHEQUESRETURNEDResponse> response = (JAXBElement<WSCNPCHEQUESRETURNEDResponse>) getWebServiceTemplate()
				.marshalSendAndReceive("http://172.16.62.247:9095/WSCNP/services?wsdl",
						rq,
						new SoapActionCallback(
								"http://172.16.62.247:9095/WSCNP/services/WSCNPCHEQUESRETURNED"));


		return response;
}
}
