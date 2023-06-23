package com.example.AppPortal;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


import com.example.AppPortal.CNP.DIGITTOSTRING.Controller.DigitToStringModel;
import com.example.AppPortal.CNP.DIGITTOSTRING.wsdl.*;


public class DigitToStringAgent extends WebServiceGatewaySupport{
	private static final Logger log = LoggerFactory.getLogger(DigitToStringAgent.class);
	public JAXBElement<WSCNPDIGITTOSTRINGResponse> getTransactions(DigitToStringModel digitToStringModel)
	{
		ObjectFactory of = new ObjectFactory();
		WSCNPDIGITTOSTRING request = of.createWSCNPDIGITTOSTRING();
		WebRequestCommon wrc = new WebRequestCommon();
		EnquiryInputCollection eic = new EnquiryInputCollection();
		EnquiryInput ei = new EnquiryInput();
		DIGITTOSTRINGType chq = new DIGITTOSTRINGType();
		wrc.setCompany(digitToStringModel.getCompany());
		wrc.setPassword(digitToStringModel.getPassword());
		wrc.setUserName(digitToStringModel.getUserName());
		eic.setColumnName(digitToStringModel.getColumnName());
		eic.setCriteriaValue(digitToStringModel.getCriteriaValue());
		eic.setOperand(digitToStringModel.getOperand());
		ei.getEnquiryInputCollection().add(eic);
		request.setWebRequestCommon(wrc);
		request.setDIGITTOSTRINGType(ei);
		log.info("Requesting info for " + digitToStringModel.getUserName());
		
		JAXBElement<WSCNPDIGITTOSTRING> rq = of.createWSCNPDIGITTOSTRING(request);
		JAXBElement<WSCNPDIGITTOSTRINGResponse> response = (JAXBElement<WSCNPDIGITTOSTRINGResponse>) getWebServiceTemplate()
				.marshalSendAndReceive("http://172.16.62.247:9095/WSCNP/services?wsdl",
						rq,
						new SoapActionCallback(
								"http://172.16.62.247:9095/WSCNP/services/WSCNPDIGITTOSTRING"));


		return response;

	}
	public JAXBElement<WSCNPDIGITTOSTRINGResponse> getTransactions(String company, String password,
			String userName, String ColumnName, String CriteriaValue, String Operand ) 
	{
		ObjectFactory of = new ObjectFactory();
		WSCNPDIGITTOSTRING request = of.createWSCNPDIGITTOSTRING();
		WebRequestCommon wrc = new WebRequestCommon();
		EnquiryInputCollection eic = new EnquiryInputCollection();
		EnquiryInput ei = new EnquiryInput();
		DIGITTOSTRINGType chq = new DIGITTOSTRINGType();
		
		wrc.setCompany(company);
		wrc.setPassword(password);
		wrc.setUserName(userName);
		eic.setColumnName(ColumnName);
		eic.setCriteriaValue(CriteriaValue);
		eic.setOperand(Operand);
		ei.getEnquiryInputCollection().add(eic);			

		request.setWebRequestCommon(wrc);
		request.setDIGITTOSTRINGType(ei);
		JAXBElement<WSCNPDIGITTOSTRING> rq = of.createWSCNPDIGITTOSTRING(request);
		JAXBElement<WSCNPDIGITTOSTRINGResponse> response = (JAXBElement<WSCNPDIGITTOSTRINGResponse>) getWebServiceTemplate()
				.marshalSendAndReceive("http://172.16.62.247:9095/WSCNP/services?wsdl",
						rq,
						new SoapActionCallback(
								"http://172.16.62.247:9095/WSCNP/services/WSCNPDIGITTOSTRING"));


		return response;

	}
	}

