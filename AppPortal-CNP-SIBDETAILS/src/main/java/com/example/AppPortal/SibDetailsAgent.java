package com.example.AppPortal;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


import com.example.AppPortal.SIBDETAILS.Controller.SibDetailsModel;
import com.example.AppPortal.SIBDETAILS.wsdl.EnquiryInput;
import com.example.AppPortal.SIBDETAILS.wsdl.EnquiryInputCollection;
import com.example.AppPortal.SIBDETAILS.wsdl.ObjectFactory;
import com.example.AppPortal.SIBDETAILS.wsdl.SDETAILSType;
import com.example.AppPortal.SIBDETAILS.wsdl.WSCNPSIBTELDETAILS;
import com.example.AppPortal.SIBDETAILS.wsdl.WSCNPSIBTELDETAILSResponse;
import com.example.AppPortal.SIBDETAILS.wsdl.WebRequestCommon;

public class SibDetailsAgent extends WebServiceGatewaySupport {
	private static final Logger log = LoggerFactory.getLogger(SibDetailsAgent.class);
	
	private String ColumnName1 = "SENS";
	private String CriteriaValue1 = "1";
	private String Operand1 = "EQ";
	
	private	String ColumnName2 = "CODE.VALEUR";
	private String CriteriaValue2 = "82";
	private String Operand2 = "EQ";
	
	public JAXBElement<WSCNPSIBTELDETAILSResponse> getTransactions(SibDetailsModel sibDetailsModel)
	{
		ObjectFactory of = new ObjectFactory();
		WSCNPSIBTELDETAILS request = of.createWSCNPSIBTELDETAILS();
		WebRequestCommon wrc = new WebRequestCommon();
		EnquiryInputCollection eic = new EnquiryInputCollection();
		EnquiryInput ei = new EnquiryInput();
		SDETAILSType chq = new SDETAILSType();
		
		EnquiryInputCollection eic1 = new EnquiryInputCollection();
		EnquiryInputCollection eic2 = new EnquiryInputCollection();
		
		wrc.setCompany(sibDetailsModel.getCompany());
		wrc.setPassword(sibDetailsModel.getPassword());
		wrc.setUserName(sibDetailsModel.getUserName());
		
		
		eic.setColumnName(sibDetailsModel.getColumnName());
		eic.setCriteriaValue(sibDetailsModel.getCriteriaValue());
		eic.setOperand(sibDetailsModel.getOperand());
		
		
		eic1.setColumnName(sibDetailsModel.getColumnName1());
		eic1.setCriteriaValue(sibDetailsModel.getCriteriaValue1());
		eic1.setOperand(sibDetailsModel.getOperand1());
	
		
		eic2.setColumnName(sibDetailsModel.getColumnName2());
		eic2.setCriteriaValue(sibDetailsModel.getCriteriaValue2());
		eic2.setOperand(sibDetailsModel.getOperand2());
	
		
		ei.getEnquiryInputCollection().add(eic);
		ei.getEnquiryInputCollection().add(eic1);
		ei.getEnquiryInputCollection().add(eic2);
		request.setWebRequestCommon(wrc);
		request.setSDETAILSType(ei);
		log.info("Requesting info for " + sibDetailsModel.getUserName());
		
		JAXBElement<WSCNPSIBTELDETAILS> rq = of.createWSCNPSIBTELDETAILS(request);
		JAXBElement<WSCNPSIBTELDETAILSResponse> response = (JAXBElement<WSCNPSIBTELDETAILSResponse>) getWebServiceTemplate()
				.marshalSendAndReceive("http://172.16.62.247:9095/WSCNP/services?wsdl",
						rq,
						new SoapActionCallback(
								"http://172.16.62.247:9095/WSCNP/services/WSCNPSIBTELDETAILS"));


		return response;

	}
	public JAXBElement<WSCNPSIBTELDETAILSResponse> getTransactions(String company, String password,
			String userName, String ColumnName, String CriteriaValue, String Operand) 
	{
		
		
		
		ObjectFactory of = new ObjectFactory();
		WSCNPSIBTELDETAILS request = of.createWSCNPSIBTELDETAILS();
		WebRequestCommon wrc = new WebRequestCommon();
		EnquiryInputCollection eic = new EnquiryInputCollection();
		EnquiryInputCollection eic1 = new EnquiryInputCollection();
		EnquiryInputCollection eic2 = new EnquiryInputCollection();
		EnquiryInput ei = new EnquiryInput();
		SDETAILSType chq = new SDETAILSType();
		
		wrc.setCompany(company);
		wrc.setPassword(password);
		wrc.setUserName(userName);
		
		eic.setColumnName(ColumnName);
		eic.setCriteriaValue(CriteriaValue);
		eic.setOperand(Operand);
		
		
		eic1.setColumnName(ColumnName1);
		eic1.setCriteriaValue(CriteriaValue1);
		eic1.setOperand(Operand1);
		
		
		eic2.setColumnName(ColumnName2);
		eic2.setCriteriaValue(CriteriaValue2);
		eic2.setOperand(Operand2);
		
		ei.getEnquiryInputCollection().add(eic);			
		ei.getEnquiryInputCollection().add(eic1);
		ei.getEnquiryInputCollection().add(eic2);
		
		request.setWebRequestCommon(wrc);
		request.setSDETAILSType(ei);
		
		JAXBElement<WSCNPSIBTELDETAILS> rq = of.createWSCNPSIBTELDETAILS(request);
		JAXBElement<WSCNPSIBTELDETAILSResponse> response = (JAXBElement<WSCNPSIBTELDETAILSResponse>) getWebServiceTemplate()
				.marshalSendAndReceive("http://172.16.62.247:9095/WSCNP/services?wsdl",
						rq,
						new SoapActionCallback(
								"http://172.16.62.247:9095/WSCNP/services/WSCNPSIBTELDETAILS"));


		return response;

	}
}
