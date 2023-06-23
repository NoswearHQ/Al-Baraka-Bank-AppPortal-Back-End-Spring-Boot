package com.example.AppPortal;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


import com.example.AppPortal.CNP.WSCNPBCSORTECODE.Controller.CNPWSCNPBCSORTECODEModel;
import com.example.AppPortal.CNP.WSCNPBCSORTECODE.wsdl.BCSORTCODEType;
import com.example.AppPortal.CNP.WSCNPBCSORTECODE.wsdl.EnquiryInput;
import com.example.AppPortal.CNP.WSCNPBCSORTECODE.wsdl.EnquiryInputCollection;
import com.example.AppPortal.CNP.WSCNPBCSORTECODE.wsdl.ObjectFactory;
import com.example.AppPortal.CNP.WSCNPBCSORTECODE.wsdl.WSCNPBCSORTCODE;
import com.example.AppPortal.CNP.WSCNPBCSORTECODE.wsdl.WSCNPBCSORTCODEResponse;
import com.example.AppPortal.CNP.WSCNPBCSORTECODE.wsdl.WebRequestCommon;

public class CNPWSCNPBCSORTECODEAgent extends WebServiceGatewaySupport{
	private static final Logger log = LoggerFactory.getLogger(CNPWSCNPBCSORTECODEAgent.class);
	//private WebRequestCommon company;
public JAXBElement<WSCNPBCSORTCODEResponse> getTransactions(CNPWSCNPBCSORTECODEModel cnpWSCNPBCSORTECODEModel ) {
		

		ObjectFactory of = new ObjectFactory();
		WSCNPBCSORTCODE request = of.createWSCNPBCSORTCODE();
		WebRequestCommon wrc = new WebRequestCommon();
		
		BCSORTCODEType BC = new BCSORTCODEType();
		
		EnquiryInputCollection eic = new EnquiryInputCollection();
		
		EnquiryInput ei = new EnquiryInput();
		
		wrc.setCompany(cnpWSCNPBCSORTECODEModel.getCompany());
		wrc.setPassword(cnpWSCNPBCSORTECODEModel.getPassword());
		wrc.setUserName(cnpWSCNPBCSORTECODEModel.getUserName());
		eic.setColumnName(cnpWSCNPBCSORTECODEModel.getColumnName());
		eic.setCriteriaValue(cnpWSCNPBCSORTECODEModel.getCriteriaValue());
		eic.setOperand(cnpWSCNPBCSORTECODEModel.getOperand());
		ei.getEnquiryInputCollection().add(eic);			

		request.setWebRequestCommon(wrc);
		request.setBCSORTCODEType(ei);
		log.info("Requesting info for " + cnpWSCNPBCSORTECODEModel.getUserName());
		
		
		JAXBElement<WSCNPBCSORTCODE> rq = of.createWSCNPBCSORTCODE(request);
		JAXBElement<WSCNPBCSORTCODEResponse> response = (JAXBElement<WSCNPBCSORTCODEResponse>) getWebServiceTemplate()
				.marshalSendAndReceive("http://172.16.62.247:9095/WSCNP/services?wsdl",
						rq,
						new SoapActionCallback(
								"http://172.16.62.247:9095/WSCNP/services/WSCNPBCSORTCODE"));


		return response;
}
	public JAXBElement<WSCNPBCSORTCODEResponse> getTransactions(String company, String password,
			String userName, String ColumnName, String CriteriaValue, String Operand ) {
		ObjectFactory of = new ObjectFactory();
		WSCNPBCSORTCODE request = of.createWSCNPBCSORTCODE();
		WebRequestCommon wrc = new WebRequestCommon();
		
		BCSORTCODEType BC = new BCSORTCODEType();
		
		EnquiryInputCollection eic = new EnquiryInputCollection();
		
		EnquiryInput ei = new EnquiryInput();
		
		wrc.setCompany(company);
		wrc.setPassword(password);
		wrc.setUserName(userName);
		eic.setColumnName(ColumnName);
		eic.setCriteriaValue(CriteriaValue);
		eic.setOperand(Operand);
		ei.getEnquiryInputCollection().add(eic);			

		request.setWebRequestCommon(wrc);
		request.setBCSORTCODEType(ei);

		log.info("Requesting info for " + userName);
	

		JAXBElement<WSCNPBCSORTCODE> rq = of.createWSCNPBCSORTCODE(request);
		JAXBElement<WSCNPBCSORTCODEResponse> response = (JAXBElement<WSCNPBCSORTCODEResponse>) getWebServiceTemplate()
				.marshalSendAndReceive("http://172.16.62.247:9095/WSCNP/services?wsdl",
						rq,
						new SoapActionCallback(
								"http://172.16.62.247:9095/WSCNP/services/WSCNPBCSORTCODE"));


		return response;
}
	
	}
	


