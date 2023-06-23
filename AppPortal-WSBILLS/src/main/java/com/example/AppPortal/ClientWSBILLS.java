package com.example.AppPortal;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.example.AppPortal.WSBILLS.controller.WSBILLSModel;
import com.example.AppPortal.WSBILLS.wsdl.EnquiryInput;
import com.example.AppPortal.WSBILLS.wsdl.EnquiryInputCollection;
import com.example.AppPortal.WSBILLS.wsdl.ObjectFactory;
import com.example.AppPortal.WSBILLS.wsdl.WSBILLS;
import com.example.AppPortal.WSBILLS.wsdl.WSBILLSResponse;
import com.example.AppPortal.WSBILLS.wsdl.WSBILLSType;
import com.example.AppPortal.WSBILLS.wsdl.WebRequestCommon;

public class ClientWSBILLS  extends WebServiceGatewaySupport {
	private static final Logger log = LoggerFactory.getLogger(WSBILLSConfig.class);
	
	private String ColumnName1 = "DATE.OPERATION";
	private String CriteriaValue1 = "20190102";
	private String Operand1 = "EQ";
	public JAXBElement<WSBILLSResponse> getTransactions(String company, String password,
			String userName, String ColumnName, String CriteriaValue, String Operand ) 
	{
		
		ObjectFactory of = new ObjectFactory();
		WSBILLS request = of.createWSBILLS();
		
		
		WebRequestCommon wrc = new WebRequestCommon();
		
		WSBILLSType ft = new WSBILLSType();
		
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
		request.setWSBILLSType(ei);
		
		
		JAXBElement<WSBILLS> rq = of.createWSBILLS(request);
		
		JAXBElement<WSBILLSResponse> response = (JAXBElement<WSBILLSResponse>) getWebServiceTemplate()
				.marshalSendAndReceive("http://172.16.62.246:9095/BILLS/services",
						rq,
						new SoapActionCallback(
								"http://172.16.62.246:9095/BILLS/services?wsdl"));


		return response;
}
	public JAXBElement<WSBILLSResponse> getTransactions(WSBILLSModel wsbillsModel)
	{
		ObjectFactory of = new ObjectFactory();
		WSBILLS request = of.createWSBILLS();
		
		
		WebRequestCommon wrc = new WebRequestCommon();
		
		WSBILLSType ft = new WSBILLSType();
		
		EnquiryInputCollection eic = new EnquiryInputCollection();
		EnquiryInputCollection eic1 = new EnquiryInputCollection();
		EnquiryInputCollection eic2 = new EnquiryInputCollection();
		EnquiryInputCollection eic3 = new EnquiryInputCollection();
		EnquiryInputCollection eic4 = new EnquiryInputCollection();

		EnquiryInput ei = new EnquiryInput();
		
		wrc.setCompany(wsbillsModel.getCompany());
		wrc.setPassword(wsbillsModel.getPassword());
		wrc.setUserName(wsbillsModel.getUserName());
		
		
		eic.setColumnName(wsbillsModel.getColumnName());
		eic.setCriteriaValue(wsbillsModel.getCriteriaValue());
		eic.setOperand(wsbillsModel.getOperand());
		
		eic1.setColumnName(wsbillsModel.getColumnName1());
		eic1.setCriteriaValue(wsbillsModel.getCriteriaValue1());
		eic1.setOperand(wsbillsModel.getOperand1());
		
		eic2.setColumnName(wsbillsModel.getColumnName2());
		eic2.setCriteriaValue(wsbillsModel.getCriteriaValue2());
		eic2.setOperand(wsbillsModel.getOperand2());
		
		
		eic3.setColumnName(wsbillsModel.getColumnName3());
		eic3.setCriteriaValue(wsbillsModel.getCriteriaValue3());
		eic3.setOperand(wsbillsModel.getOperand3());
		
		eic4.setColumnName(wsbillsModel.getColumnName4());
		eic4.setCriteriaValue(wsbillsModel.getCriteriaValue4());
		eic4.setOperand(wsbillsModel.getOperand4());
		
		
		ei.getEnquiryInputCollection().add(eic);
		ei.getEnquiryInputCollection().add(eic1);
		ei.getEnquiryInputCollection().add(eic2);
		ei.getEnquiryInputCollection().add(eic3);
		ei.getEnquiryInputCollection().add(eic4);

		
		request.setWebRequestCommon(wrc);
		request.setWSBILLSType(ei);
		
		
		JAXBElement<WSBILLS> rq = of.createWSBILLS(request);
		
		JAXBElement<WSBILLSResponse> response = (JAXBElement<WSBILLSResponse>) getWebServiceTemplate()
				.marshalSendAndReceive("http://172.16.62.246:9095/BILLS/services",
						rq,
						new SoapActionCallback(
								"http://172.16.62.246:9095/BILLS/services?wsdl"));


		return response;
}

	
}
