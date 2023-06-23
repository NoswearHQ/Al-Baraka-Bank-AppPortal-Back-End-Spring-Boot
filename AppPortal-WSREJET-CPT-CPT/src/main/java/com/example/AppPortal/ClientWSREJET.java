package com.example.AppPortal;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.example.AppPortal.WSREJET.CPT.CPT.controller.WSREJETModel;
import com.example.AppPortal.WSREJET.CPT.CPT.wsdl.EnquiryInput;
import com.example.AppPortal.WSREJET.CPT.CPT.wsdl.EnquiryInputCollection;
import com.example.AppPortal.WSREJET.CPT.CPT.wsdl.ObjectFactory;
import com.example.AppPortal.WSREJET.CPT.CPT.wsdl.REJETCPTCPTType;
import com.example.AppPortal.WSREJET.CPT.CPT.wsdl.WSREJETCPTCPT;
import com.example.AppPortal.WSREJET.CPT.CPT.wsdl.WSREJETCPTCPTResponse;
import com.example.AppPortal.WSREJET.CPT.CPT.wsdl.WebRequestCommon;



public class ClientWSREJET extends WebServiceGatewaySupport {
	private static final Logger log = LoggerFactory.getLogger(ClientWSREJET.class);
	
	private String ColumnName1 = "MOTIF.REJET";
	private String CriteriaValue1 = "";
	private String Operand1 = "NE";
	public JAXBElement<WSREJETCPTCPTResponse> getTransactions(String company, String password,
			String userName, String ColumnName, String CriteriaValue, String Operand ) 
	{
		
		ObjectFactory of = new ObjectFactory();
		WSREJETCPTCPT request = of.createWSREJETCPTCPT();
		
		
		WebRequestCommon wrc = new WebRequestCommon();
		
		REJETCPTCPTType ft = new REJETCPTCPTType();
		
		EnquiryInputCollection eic = new EnquiryInputCollection();
		EnquiryInputCollection eic1 = new EnquiryInputCollection();

		EnquiryInput ei = new EnquiryInput();
		

		wrc.setCompany(company);
		wrc.setPassword(password);
		wrc.setUserName(userName);
		
		
		eic.setColumnName(ColumnName);
		eic.setCriteriaValue(CriteriaValue);
		eic.setOperand(Operand);
		
		eic1.setColumnName(ColumnName1);
		eic1.setCriteriaValue(CriteriaValue1);
		eic1.setOperand(Operand1);
		
		ei.getEnquiryInputCollection().add(eic);			
		ei.getEnquiryInputCollection().add(eic1);

		request.setWebRequestCommon(wrc);
		request.setREJETCPTCPTType(ei);
		
		
		JAXBElement<WSREJETCPTCPT> rq = of.createWSREJETCPTCPT(request);
		
		JAXBElement<WSREJETCPTCPTResponse> response = (JAXBElement<WSREJETCPTCPTResponse>) getWebServiceTemplate()
				.marshalSendAndReceive("http://172.16.62.246:9095/prelevement/services",
						rq,
						new SoapActionCallback(
								"http://172.16.62.246:9095/prelevement/services?wsdl"));


		return response;
}
	public JAXBElement<WSREJETCPTCPTResponse> getTransactions(WSREJETModel wsrejetModel)
	{
		
		ObjectFactory of = new ObjectFactory();
		WSREJETCPTCPT request = of.createWSREJETCPTCPT();
		
		
		WebRequestCommon wrc = new WebRequestCommon();
		
		REJETCPTCPTType ft = new REJETCPTCPTType();
		
		EnquiryInputCollection eic = new EnquiryInputCollection();
		EnquiryInputCollection eic1 = new EnquiryInputCollection();
		EnquiryInputCollection eic2 = new EnquiryInputCollection();
		EnquiryInput ei = new EnquiryInput();

		wrc.setCompany(wsrejetModel.getCompany());
		wrc.setPassword(wsrejetModel.getPassword());
		wrc.setUserName(wsrejetModel.getUserName());
		
		
		eic.setColumnName(wsrejetModel.getColumnName());
		eic.setCriteriaValue(wsrejetModel.getCriteriaValue());
		eic.setOperand(wsrejetModel.getOperand());
		
		eic1.setColumnName(wsrejetModel.getColumnName1());
		eic1.setCriteriaValue(wsrejetModel.getCriteriaValue1());
		eic1.setOperand(wsrejetModel.getOperand1());
		
		eic2.setColumnName(wsrejetModel.getColumnName2());
		eic2.setCriteriaValue(wsrejetModel.getCriteriaValue2());
		eic2.setOperand(wsrejetModel.getOperand2());
		ei.getEnquiryInputCollection().add(eic);
		ei.getEnquiryInputCollection().add(eic1);
		ei.getEnquiryInputCollection().add(eic2);

		request.setWebRequestCommon(wrc);
		request.setREJETCPTCPTType(ei);
		
		
		
JAXBElement<WSREJETCPTCPT> rq = of.createWSREJETCPTCPT(request);
		
		JAXBElement<WSREJETCPTCPTResponse> response = (JAXBElement<WSREJETCPTCPTResponse>) getWebServiceTemplate()
				.marshalSendAndReceive("http://172.16.62.246:9095/prelevement/services",
						rq,
						new SoapActionCallback(
								"http://172.16.62.246:9095/prelevement/services?wsdl"));


		return response;
}


}
