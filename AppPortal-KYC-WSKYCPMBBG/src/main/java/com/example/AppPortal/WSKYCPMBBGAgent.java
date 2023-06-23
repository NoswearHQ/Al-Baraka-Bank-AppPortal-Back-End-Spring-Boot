package com.example.AppPortal;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


import com.example.AppPortal.KYC.WSKYCPMBBG.Controller.WSKYCPMBBGModel;
import com.example.AppPortal.KYC.WSKYCPMBBG.wsdl.EnquiryInput;
import com.example.AppPortal.KYC.WSKYCPMBBG.wsdl.EnquiryInputCollection;
import com.example.AppPortal.KYC.WSKYCPMBBG.wsdl.ObjectFactory;
import com.example.AppPortal.KYC.WSKYCPMBBG.wsdl.WSKYCPMBBG;
import com.example.AppPortal.KYC.WSKYCPMBBG.wsdl.WSKYCPMBBGResponse;
import com.example.AppPortal.KYC.WSKYCPMBBG.wsdl.WebRequestCommon;


public class WSKYCPMBBGAgent extends WebServiceGatewaySupport{ 
	private static final Logger log = LoggerFactory.getLogger(WSKYCPMBBGAgent.class);
	public JAXBElement<WSKYCPMBBGResponse> getTransactions(WSKYCPMBBGModel wskycpmbbgModel ) {
		ObjectFactory of = new ObjectFactory();
		WSKYCPMBBG request = of.createWSKYCPMBBG();
		WebRequestCommon wrc = new WebRequestCommon();
		EnquiryInputCollection eic = new EnquiryInputCollection();
		EnquiryInput ei = new EnquiryInput();
		wrc.setCompany(wskycpmbbgModel.getCompany());
		wrc.setPassword(wskycpmbbgModel.getPassword());
		wrc.setUserName(wskycpmbbgModel.getUserName());
		eic.setColumnName(wskycpmbbgModel.getColumnName());
		eic.setCriteriaValue(wskycpmbbgModel.getCriteriaValue());
		eic.setOperand(wskycpmbbgModel.getOperand());
		ei.getEnquiryInputCollection().add(eic);
		
		request.setWebRequestCommon(wrc);
		request.setTWSKYCPMBBGType(ei);
		
		JAXBElement<WSKYCPMBBG> rq = of.createWSKYCPMBBG(request) ;
		JAXBElement<WSKYCPMBBGResponse> response = (JAXBElement<WSKYCPMBBGResponse>)getWebServiceTemplate()
				.marshalSendAndReceive("http://172.16.62.247:9095/TWS.KYC/services?wsdl",
				rq,
				new SoapActionCallback(
						"http://172.16.62.247:9095/TWS.KYC/services/WSKYCPMBBG"));


return response;
}
	public JAXBElement<WSKYCPMBBGResponse> getTransactions(String company, String password,
			String userName, String ColumnName, String CriteriaValue, String Operand ) {
		ObjectFactory of = new ObjectFactory();
		WSKYCPMBBG request = of.createWSKYCPMBBG();
		WebRequestCommon wrc = new WebRequestCommon();
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
request.setTWSKYCPMBBGType(ei);
		
		JAXBElement<WSKYCPMBBG> rq = of.createWSKYCPMBBG(request) ;
		JAXBElement<WSKYCPMBBGResponse> response = (JAXBElement<WSKYCPMBBGResponse>)getWebServiceTemplate()
				.marshalSendAndReceive("http://172.16.62.247:9095/TWS.KYC/services?wsdl",
				rq,
				new SoapActionCallback(
						"http://172.16.62.247:9095/TWS.KYC/services/WSKYCPMBBG"));


return response;
}

	}

