package com.example.AppPortal;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.example.AppPortal.KYC.TWSKYCPM2.Controller.TWSKYCPM2Model;
import com.example.AppPortal.KYC.TWSKYCPM2.wsdl.EnquiryInput;
import com.example.AppPortal.KYC.TWSKYCPM2.wsdl.EnquiryInputCollection;
import com.example.AppPortal.KYC.TWSKYCPM2.wsdl.ObjectFactory;
import com.example.AppPortal.KYC.TWSKYCPM2.wsdl.WEBSERVICEKYCPERSONNEMORALE;
import com.example.AppPortal.KYC.TWSKYCPM2.wsdl.WEBSERVICEKYCPERSONNEMORALEResponse;
import com.example.AppPortal.KYC.TWSKYCPM2.wsdl.WebRequestCommon;



public class TWSKYCPM2Agent  extends WebServiceGatewaySupport{ 
	private static final Logger log = LoggerFactory.getLogger(TWSKYCPM2Agent.class);
	public JAXBElement<WEBSERVICEKYCPERSONNEMORALEResponse> getTransactions(TWSKYCPM2Model twskycpm2Model){
		
		ObjectFactory of = new ObjectFactory();
		WEBSERVICEKYCPERSONNEMORALE request = of.createWEBSERVICEKYCPERSONNEMORALE();
		WebRequestCommon wrc = new WebRequestCommon();
		EnquiryInputCollection eic = new EnquiryInputCollection();
		EnquiryInput ei = new EnquiryInput();
		wrc.setCompany(twskycpm2Model.getCompany());
		wrc.setPassword(twskycpm2Model.getPassword());
		wrc.setUserName(twskycpm2Model.getUserName());
		eic.setColumnName(twskycpm2Model.getColumnName());
		eic.setCriteriaValue(twskycpm2Model.getCriteriaValue());
		eic.setOperand(twskycpm2Model.getOperand());
		ei.getEnquiryInputCollection().add(eic);
		request.setWebRequestCommon(wrc);
		request.setTWSKYCPM2Type(ei);
		JAXBElement<WEBSERVICEKYCPERSONNEMORALE> rq = of.createWEBSERVICEKYCPERSONNEMORALE(request) ;
		JAXBElement<WEBSERVICEKYCPERSONNEMORALEResponse> response = (JAXBElement<WEBSERVICEKYCPERSONNEMORALEResponse>)getWebServiceTemplate()
				.marshalSendAndReceive("http://172.16.62.247:9095/TWSKYCPM2/services?wsdl",
				rq,
				new SoapActionCallback(
						"http://172.16.62.247:9095/TWSKYCPM2/services/WEBSERVICEKYCPERSONNEMORALE"));

 
		return response;
	}
	
	public JAXBElement<WEBSERVICEKYCPERSONNEMORALEResponse> getTransactions(String company, String password,
			String userName, String ColumnName, String CriteriaValue, String Operand ) 
	{
		ObjectFactory of = new ObjectFactory();
		WEBSERVICEKYCPERSONNEMORALE request = of.createWEBSERVICEKYCPERSONNEMORALE();
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
		request.setTWSKYCPM2Type(ei);
		JAXBElement<WEBSERVICEKYCPERSONNEMORALE> rq = of.createWEBSERVICEKYCPERSONNEMORALE(request) ;
		JAXBElement<WEBSERVICEKYCPERSONNEMORALEResponse> response = (JAXBElement<WEBSERVICEKYCPERSONNEMORALEResponse>)getWebServiceTemplate()
				.marshalSendAndReceive("http://172.16.62.247:9095/TWSKYCPM2/services?wsdl",
				rq,
				new SoapActionCallback(
						"http://172.16.62.247:9095/TWSKYCPM2/services/WEBSERVICEKYCPERSONNEMORALE"));

		
return response;
	}

		
}
