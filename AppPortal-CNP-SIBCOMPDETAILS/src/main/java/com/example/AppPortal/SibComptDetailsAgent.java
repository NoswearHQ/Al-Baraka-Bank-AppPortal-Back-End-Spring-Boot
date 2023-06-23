package com.example.AppPortal;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


import com.example.AppPortal.CNP.SIBCOMPDETAILS.Controller.SibComptDetailsModel;
import com.example.AppPortal.CNP.SIBCOMPDETAILS.wsdl.EnquiryInput;
import com.example.AppPortal.CNP.SIBCOMPDETAILS.wsdl.EnquiryInputCollection;
import com.example.AppPortal.CNP.SIBCOMPDETAILS.wsdl.ObjectFactory;
import com.example.AppPortal.CNP.SIBCOMPDETAILS.wsdl.SCOMPDETAILSType;
import com.example.AppPortal.CNP.SIBCOMPDETAILS.wsdl.WSCNPSIBTELCOMPDETAILS;
import com.example.AppPortal.CNP.SIBCOMPDETAILS.wsdl.WSCNPSIBTELCOMPDETAILSResponse;
import com.example.AppPortal.CNP.SIBCOMPDETAILS.wsdl.WebRequestCommon;



public class SibComptDetailsAgent extends  WebServiceGatewaySupport {
	
	private static final Logger log = LoggerFactory.getLogger(SibComptDetailsAgent.class);
	public JAXBElement<WSCNPSIBTELCOMPDETAILSResponse> getTransactions(SibComptDetailsModel sibComptDetailsModel)
	{
		
	
	ObjectFactory of = new ObjectFactory();
	WSCNPSIBTELCOMPDETAILS request = of.createWSCNPSIBTELCOMPDETAILS();
	WebRequestCommon wrc = new WebRequestCommon();
	EnquiryInputCollection eic = new EnquiryInputCollection();
	EnquiryInput ei = new EnquiryInput();
	SCOMPDETAILSType chq = new SCOMPDETAILSType();
	
	wrc.setCompany(sibComptDetailsModel.getCompany());
	wrc.setPassword(sibComptDetailsModel.getPassword());
	wrc.setUserName(sibComptDetailsModel.getUserName());
	eic.setColumnName(sibComptDetailsModel.getColumnName());
	eic.setCriteriaValue(sibComptDetailsModel.getCriteriaValue());
	eic.setOperand(sibComptDetailsModel.getOperand());
	ei.getEnquiryInputCollection().add(eic);
	request.setWebRequestCommon(wrc);
	request.setSCOMPDETAILSType(ei);
	JAXBElement<WSCNPSIBTELCOMPDETAILS> rq = of.createWSCNPSIBTELCOMPDETAILS(request);
	JAXBElement<WSCNPSIBTELCOMPDETAILSResponse> response = (JAXBElement<WSCNPSIBTELCOMPDETAILSResponse>) getWebServiceTemplate()
			.marshalSendAndReceive("http://172.16.62.247:9095/WSCNP/services?wsdl",
					rq,
					new SoapActionCallback(
							"http://172.16.62.247:9095/WSCNP/services/WSCNPDIGITTOSTRING"));


	return response;
	}
	
	public JAXBElement<WSCNPSIBTELCOMPDETAILSResponse> getTransactions(String company, String password,
			String userName, String ColumnName, String CriteriaValue, String Operand ) 
	{
		ObjectFactory of = new ObjectFactory();
		WSCNPSIBTELCOMPDETAILS request = of.createWSCNPSIBTELCOMPDETAILS();
		WebRequestCommon wrc = new WebRequestCommon();
		EnquiryInputCollection eic = new EnquiryInputCollection();
		EnquiryInput ei = new EnquiryInput();
		SCOMPDETAILSType chq = new SCOMPDETAILSType();
		
		wrc.setCompany(company);
		wrc.setPassword(password);
		wrc.setUserName(userName);
		eic.setColumnName(ColumnName);
		eic.setCriteriaValue(CriteriaValue);
		eic.setOperand(Operand);
		ei.getEnquiryInputCollection().add(eic);			

		request.setWebRequestCommon(wrc);
		request.setSCOMPDETAILSType(ei);
		JAXBElement<WSCNPSIBTELCOMPDETAILS> rq = of.createWSCNPSIBTELCOMPDETAILS(request);
		JAXBElement<WSCNPSIBTELCOMPDETAILSResponse> response = (JAXBElement<WSCNPSIBTELCOMPDETAILSResponse>) getWebServiceTemplate()
				.marshalSendAndReceive("http://172.16.62.247:9095/WSCNP/services?wsdl",
						rq,
						new SoapActionCallback(
								"http://172.16.62.247:9095/WSCNP/services/WSCNPSIBTELCOMPDETAILS"));


		return response;
		}
		
	}
	
	



