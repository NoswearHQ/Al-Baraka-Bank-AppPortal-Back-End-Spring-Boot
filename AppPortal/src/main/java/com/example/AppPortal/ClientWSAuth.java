package com.example.AppPortal;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import com.example.AppPortal.Auth.wsdl.*;
import com.example.AppPortal.Auth.wsdl.WSAUTHENTIFICATION;
import com.example.AppPortal.Auth.wsdl.WSAUTHENTIFICATIONResponse;
import com.example.AppPortal.Auth.wsdl.WebRequestCommon;
import com.example.AppPortal.controller.AuthModel;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClientWSAuth  extends WebServiceGatewaySupport{
	
	private static final Logger log = LoggerFactory.getLogger(ClientWSAuth.class);
	//private WebRequestCommon company;
	
	
	public JAXBElement<WSAUTHENTIFICATIONResponse> getTransactions(String company, String password,
			String userName, String ColumnName, String CriteriaValue, String Operand ) {


			ObjectFactory of = new ObjectFactory();
		
			WSAUTHENTIFICATION request = of.createWSAUTHENTIFICATION();
			
			
			WebRequestCommon wrc = new WebRequestCommon();
			
			USERAUTHType ft = new USERAUTHType();
			
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
			request.setUSERAUTHType(ei);

			log.info("Requesting info for " + userName);
		

			JAXBElement<WSAUTHENTIFICATION> rq = of.createWSAUTHENTIFICATION(request);
			
			JAXBElement<WSAUTHENTIFICATIONResponse> response = (JAXBElement<WSAUTHENTIFICATIONResponse>) getWebServiceTemplate()
					.marshalSendAndReceive("http://172.16.62.247:9095/WSAUTH/services",
							rq,
							new SoapActionCallback(
									"http://172.16.62.247:9095/WSAUTH/services/WSAUTHENTIFICATION"));


			return response;
	}


	public JAXBElement<WSAUTHENTIFICATIONResponse> getTransactions( AuthModel authModel) {
	
		ObjectFactory of = new ObjectFactory();
		
		WSAUTHENTIFICATION request = of.createWSAUTHENTIFICATION();
		
		
		WebRequestCommon wrc = new WebRequestCommon();
		
		USERAUTHType ft = new USERAUTHType();
		
		EnquiryInputCollection eic = new EnquiryInputCollection();
		
		EnquiryInput ei = new EnquiryInput();
		
		wrc.setCompany(authModel.getCompany());
		wrc.setPassword(authModel.getPassword());
		wrc.setUserName(authModel.getUserName());
		eic.setColumnName(authModel.getColumnName());
		eic.setCriteriaValue(authModel.getCriteriaValue());
		eic.setOperand(authModel.getOperand());
		ei.getEnquiryInputCollection().add(eic);			

		request.setWebRequestCommon(wrc);
		request.setUSERAUTHType(ei);
		log.info("Requesting info for " + authModel.getUserName());
		

		JAXBElement<WSAUTHENTIFICATION> rq = of.createWSAUTHENTIFICATION(request);
		
		JAXBElement<WSAUTHENTIFICATIONResponse> response = (JAXBElement<WSAUTHENTIFICATIONResponse>) getWebServiceTemplate()
				.marshalSendAndReceive("http://172.16.62.247:9095/WSAUTH/services",
						rq,
						new SoapActionCallback(
								"http://172.16.62.247:9095/WSAUTH/services/WSAUTHENTIFICATION"));


		return response;
	}


	
	
}
