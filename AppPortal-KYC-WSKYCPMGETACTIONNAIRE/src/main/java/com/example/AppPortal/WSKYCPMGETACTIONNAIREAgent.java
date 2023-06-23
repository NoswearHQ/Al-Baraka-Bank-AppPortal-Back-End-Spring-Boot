package com.example.AppPortal;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


import com.example.AppPortal.KYC.WSKYCPMGETACTIONNAIRE.Controller.WSKYCPMGETACTIONNAIREModel;
import com.example.AppPortal.KYC.WSKYCPMGETACTIONNAIRE.wsdl.EnquiryInput;
import com.example.AppPortal.KYC.WSKYCPMGETACTIONNAIRE.wsdl.EnquiryInputCollection;
import com.example.AppPortal.KYC.WSKYCPMGETACTIONNAIRE.wsdl.ObjectFactory;
import com.example.AppPortal.KYC.WSKYCPMGETACTIONNAIRE.wsdl.WSKYCPMGETACTIONNAIRE;
import com.example.AppPortal.KYC.WSKYCPMGETACTIONNAIRE.wsdl.WSKYCPMGETACTIONNAIREResponse;
import com.example.AppPortal.KYC.WSKYCPMGETACTIONNAIRE.wsdl.WebRequestCommon;



public class WSKYCPMGETACTIONNAIREAgent extends WebServiceGatewaySupport{ 
	private static final Logger log = LoggerFactory.getLogger(WSKYCPMGETACTIONNAIREAgent.class);
	public JAXBElement<WSKYCPMGETACTIONNAIREResponse> getTransactions(WSKYCPMGETACTIONNAIREModel wskycpmgetactionnaireModel ){
		ObjectFactory of = new ObjectFactory();
		WSKYCPMGETACTIONNAIRE request = of.createWSKYCPMGETACTIONNAIRE();
		WebRequestCommon wrc = new WebRequestCommon();
		EnquiryInputCollection eic = new EnquiryInputCollection();
		EnquiryInput ei = new EnquiryInput();
		wrc.setCompany(wskycpmgetactionnaireModel.getCompany());
		wrc.setPassword(wskycpmgetactionnaireModel.getPassword());
		wrc.setUserName(wskycpmgetactionnaireModel.getUserName());
		eic.setColumnName(wskycpmgetactionnaireModel.getColumnName());
		eic.setCriteriaValue(wskycpmgetactionnaireModel.getCriteriaValue());
		eic.setOperand(wskycpmgetactionnaireModel.getOperand());
		ei.getEnquiryInputCollection().add(eic);
		
		request.setWebRequestCommon(wrc);
		request.setTWSKYCPMGETACTIONNAIREType(ei);
		JAXBElement<WSKYCPMGETACTIONNAIRE> rq = of.createWSKYCPMGETACTIONNAIRE(request) ;
		JAXBElement<WSKYCPMGETACTIONNAIREResponse> response = (JAXBElement<WSKYCPMGETACTIONNAIREResponse>)getWebServiceTemplate()
				.marshalSendAndReceive("http://172.16.62.247:9095/TWS.KYC/services?wsdl",
				rq,
				new SoapActionCallback(
						"http://172.16.62.247:9095/TWS.KYC/services/WSKYCPMGETACTIONNAIRE"));


return response;
}
	public JAXBElement<WSKYCPMGETACTIONNAIREResponse> getTransactions(String company, String password,
			String userName, String ColumnName, String CriteriaValue, String Operand ) {
		ObjectFactory of = new ObjectFactory();
		WSKYCPMGETACTIONNAIRE request = of.createWSKYCPMGETACTIONNAIRE();
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
		request.setTWSKYCPMGETACTIONNAIREType(ei);
		JAXBElement<WSKYCPMGETACTIONNAIRE> rq = of.createWSKYCPMGETACTIONNAIRE(request) ;
		JAXBElement<WSKYCPMGETACTIONNAIREResponse> response = (JAXBElement<WSKYCPMGETACTIONNAIREResponse>)getWebServiceTemplate()
				.marshalSendAndReceive("http://172.16.62.247:9095/TWS.KYC/services?wsdl",
				rq,
				new SoapActionCallback(
						"http://172.16.62.247:9095/TWS.KYC/services/WSKYCPMGETACTIONNAIRE"));


return response;
}
}
