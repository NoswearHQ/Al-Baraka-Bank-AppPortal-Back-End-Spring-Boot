package com.example.AppPortal;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.example.AppPortal.KYC.WSKYCPM.Controller.WSKYCPMModel;
import com.example.AppPortal.KYC.WSKYCPM.wsdl.EnquiryInput;
import com.example.AppPortal.KYC.WSKYCPM.wsdl.EnquiryInputCollection;
import com.example.AppPortal.KYC.WSKYCPM.wsdl.ObjectFactory;
import com.example.AppPortal.KYC.WSKYCPM.wsdl.WSKYCPM;
import com.example.AppPortal.KYC.WSKYCPM.wsdl.WSKYCPMResponse;
import com.example.AppPortal.KYC.WSKYCPM.wsdl.WebRequestCommon;




public class WSKYCPMAgent  extends WebServiceGatewaySupport{ 
	private static final Logger log = LoggerFactory.getLogger(WSKYCPMAgent.class);
	public JAXBElement<WSKYCPMResponse> getTransactions(WSKYCPMModel wskycpmModel ) {
		
		ObjectFactory of = new ObjectFactory();
		WSKYCPM request = of.createWSKYCPM();
		WebRequestCommon wrc = new WebRequestCommon();
		EnquiryInputCollection eic = new EnquiryInputCollection();
		EnquiryInput ei = new EnquiryInput();
		wrc.setCompany(wskycpmModel.getCompany());
		wrc.setPassword(wskycpmModel.getPassword());
		wrc.setUserName(wskycpmModel.getUserName());
		eic.setColumnName(wskycpmModel.getColumnName());
		eic.setCriteriaValue(wskycpmModel.getCriteriaValue());
		eic.setOperand(wskycpmModel.getOperand());
		ei.getEnquiryInputCollection().add(eic);
		
		request.setWebRequestCommon(wrc);
		request.setTWSKYCPMType(ei);
		JAXBElement<WSKYCPM> rq = of.createWSKYCPM(request) ;
		JAXBElement<WSKYCPMResponse> response = (JAXBElement<WSKYCPMResponse>)getWebServiceTemplate()
				.marshalSendAndReceive("http://172.16.62.247:9095/TWS.KYC/services?wsdl",
				rq,
				new SoapActionCallback(
						"http://172.16.62.247:9095/TWS.KYC/services/WSKYCPM"));


return response;
}
	public JAXBElement<WSKYCPMResponse> getTransactions(String company, String password,
			String userName, String ColumnName, String CriteriaValue, String Operand ) {
		

		ObjectFactory of = new ObjectFactory();
		WSKYCPM request = of.createWSKYCPM();
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
		request.setTWSKYCPMType(ei);
		JAXBElement<WSKYCPM> rq = of.createWSKYCPM(request) ;
		JAXBElement<WSKYCPMResponse> response = (JAXBElement<WSKYCPMResponse>)getWebServiceTemplate()
				.marshalSendAndReceive("http://172.16.62.247:9095/TWS.KYC/services?wsdl",
				rq,
				new SoapActionCallback(
						"http://172.16.62.247:9095/TWS.KYC/services/WSKYCPM"));


return response;
}

}
