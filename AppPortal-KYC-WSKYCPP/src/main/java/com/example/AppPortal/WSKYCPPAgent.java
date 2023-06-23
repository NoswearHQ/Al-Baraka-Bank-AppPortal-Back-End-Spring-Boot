package com.example.AppPortal;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.example.AppPortal.KYC.WSKYCPP.Controller.WSKYCPPModel;
import com.example.AppPortal.KYC.WSKYCPP.wsdl.EnquiryInput;
import com.example.AppPortal.KYC.WSKYCPP.wsdl.EnquiryInputCollection;
import com.example.AppPortal.KYC.WSKYCPP.wsdl.ObjectFactory;
import com.example.AppPortal.KYC.WSKYCPP.wsdl.TWSKYC;
import com.example.AppPortal.KYC.WSKYCPP.wsdl.TWSKYCResponse;
import com.example.AppPortal.KYC.WSKYCPP.wsdl.WebRequestCommon;



public class WSKYCPPAgent  extends WebServiceGatewaySupport{ 
	private static final Logger log = LoggerFactory.getLogger(WSKYCPPAgent.class);
	public JAXBElement<TWSKYCResponse> getTransactions(WSKYCPPModel kycModel ) {
	
		
		ObjectFactory of = new ObjectFactory();
		TWSKYC request = of.createTWSKYC();
		WebRequestCommon wrc = new WebRequestCommon();
		EnquiryInputCollection eic = new EnquiryInputCollection();
		EnquiryInput ei = new EnquiryInput();
		wrc.setCompany(kycModel.getCompany());
		wrc.setPassword(kycModel.getPassword());
		wrc.setUserName(kycModel.getUserName());
		eic.setColumnName(kycModel.getColumnName());
		eic.setCriteriaValue(kycModel.getCriteriaValue());
		eic.setOperand(kycModel.getOperand());
		ei.getEnquiryInputCollection().add(eic);
		
		request.setWebRequestCommon(wrc);
		request.setTWSKYCPP2Type(ei);
		
		JAXBElement<TWSKYC> rq = of.createTWSKYC(request) ;
		JAXBElement<TWSKYCResponse> response = (JAXBElement<TWSKYCResponse>)getWebServiceTemplate()
				.marshalSendAndReceive("http://172.16.62.247:9095/WSKYC2/services?wsdl",
				rq,
				new SoapActionCallback(
						"http://172.16.62.247:9095/WSKYC2/services/TWSKYC"));


return response;
}
	public JAXBElement<TWSKYCResponse> getTransactions(String company, String password,
			String userName, String ColumnName, String CriteriaValue, String Operand ) {
		ObjectFactory of = new ObjectFactory();
		TWSKYC request = of.createTWSKYC();
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
		request.setTWSKYCPP2Type(ei);
		JAXBElement<TWSKYC> rq = of.createTWSKYC(request) ;
		JAXBElement<TWSKYCResponse> response = (JAXBElement<TWSKYCResponse>)getWebServiceTemplate()
				.marshalSendAndReceive("http://172.16.62.247:9095/WSKYC2/services?wsdl",
				rq,
				new SoapActionCallback(
						"http://172.16.62.247:9095/WSKYC2/services/TWSKYC"));


return response;
}

}
