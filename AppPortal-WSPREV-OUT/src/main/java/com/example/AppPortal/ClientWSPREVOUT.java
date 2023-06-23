package com.example.AppPortal;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


import com.example.AppPortal.WSPREV.OUT.controller.WSPREVOUTModel;
import com.example.AppPortal.WSPREV.OUT.wsdl.EnquiryInput;
import com.example.AppPortal.WSPREV.OUT.wsdl.EnquiryInputCollection;
import com.example.AppPortal.WSPREV.OUT.wsdl.ObjectFactory;
import com.example.AppPortal.WSPREV.OUT.wsdl.SIBTELPRELEVOUTType;
import com.example.AppPortal.WSPREV.OUT.wsdl.WSSIBTELPRELEVOUT;
import com.example.AppPortal.WSPREV.OUT.wsdl.WSSIBTELPRELEVOUTResponse;
import com.example.AppPortal.WSPREV.OUT.wsdl.WebRequestCommon;


public class ClientWSPREVOUT extends WebServiceGatewaySupport {
	private static final Logger log = LoggerFactory.getLogger(ClientWSPREVOUT.class);
	
	private String ColumnName1 = "DATE.OPERATION";
	private String CriteriaValue1 = "20190102";
	private String Operand1 = "EQ";
	public JAXBElement<WSSIBTELPRELEVOUTResponse> getTransactions(String company, String password,
			String userName, String ColumnName, String CriteriaValue, String Operand ) 
	{
		
		ObjectFactory of = new ObjectFactory();
		WSSIBTELPRELEVOUT request = of.createWSSIBTELPRELEVOUT();
		
		
		WebRequestCommon wrc = new WebRequestCommon();
		
		SIBTELPRELEVOUTType ft = new SIBTELPRELEVOUTType();
		
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
		request.setSIBTELPRELEVOUTType(ei);
		
		
		JAXBElement<WSSIBTELPRELEVOUT> rq = of.createWSSIBTELPRELEVOUT(request);
		
		JAXBElement<WSSIBTELPRELEVOUTResponse> response = (JAXBElement<WSSIBTELPRELEVOUTResponse>) getWebServiceTemplate()
				.marshalSendAndReceive("http://172.16.62.246:9095/prelevement/services",
						rq,
						new SoapActionCallback(
								"http://172.16.62.246:9095/prelevement/services?wsdl"));


		return response;
}
	public JAXBElement<WSSIBTELPRELEVOUTResponse> getTransactions(WSPREVOUTModel wsprevoutModel)
	{
		ObjectFactory of = new ObjectFactory();
		WSSIBTELPRELEVOUT request = of.createWSSIBTELPRELEVOUT();
		
		
		WebRequestCommon wrc = new WebRequestCommon();
		
		SIBTELPRELEVOUTType ft = new SIBTELPRELEVOUTType();
		
		EnquiryInputCollection eic = new EnquiryInputCollection();
		EnquiryInputCollection eic1 = new EnquiryInputCollection();
		EnquiryInputCollection eic2 = new EnquiryInputCollection();
		EnquiryInputCollection eic3 = new EnquiryInputCollection();

		EnquiryInput ei = new EnquiryInput();
		

		wrc.setCompany(wsprevoutModel.getCompany());
		wrc.setPassword(wsprevoutModel.getPassword());
		wrc.setUserName(wsprevoutModel.getUserName());
		
		
		eic.setColumnName(wsprevoutModel.getColumnName());
		eic.setCriteriaValue(wsprevoutModel.getCriteriaValue());
		eic.setOperand(wsprevoutModel.getOperand());
		
		eic1.setColumnName(wsprevoutModel.getColumnName1());
		eic1.setCriteriaValue(wsprevoutModel.getCriteriaValue1());
		eic1.setOperand(wsprevoutModel.getOperand1());
		
		eic2.setColumnName(wsprevoutModel.getColumnName2());
		eic2.setCriteriaValue(wsprevoutModel.getCriteriaValue2());
		eic2.setOperand(wsprevoutModel.getOperand2());
		
		
		eic3.setColumnName(wsprevoutModel.getColumnName3());
		eic3.setCriteriaValue(wsprevoutModel.getCriteriaValue3());
		eic3.setOperand(wsprevoutModel.getOperand3());
		
		
		
		
		ei.getEnquiryInputCollection().add(eic);			
		ei.getEnquiryInputCollection().add(eic1);
		ei.getEnquiryInputCollection().add(eic2);
		ei.getEnquiryInputCollection().add(eic3);

		request.setWebRequestCommon(wrc);
		request.setSIBTELPRELEVOUTType(ei);
JAXBElement<WSSIBTELPRELEVOUT> rq = of.createWSSIBTELPRELEVOUT(request);
		
		JAXBElement<WSSIBTELPRELEVOUTResponse> response = (JAXBElement<WSSIBTELPRELEVOUTResponse>) getWebServiceTemplate()
				.marshalSendAndReceive("http://172.16.62.246:9095/prelevement/services",
						rq,
						new SoapActionCallback(
								"http://172.16.62.246:9095/prelevement/services?wsdl"));


		return response;
}
}
