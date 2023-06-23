package com.example.AppPortal.SIBDETAILS.Controller;

import javax.xml.bind.JAXBElement;

import com.example.AppPortal.SIBDETAILS.wsdl.WSCNPSIBTELDETAILSResponse;

public class SibDetailsModel {
	private String company;
	private String password;
	private String userName;
	private String ColumnName;
	private String CriteriaValue;
	private String operand;
	private String ColumnName1;
	public String getColumnName1() {
		return ColumnName1;
	}
	public void setColumnName1(String columnName1) {
		ColumnName1 = columnName1;
	}
	public String getCriteriaValue1() {
		return CriteriaValue1;
	}
	public void setCriteriaValue1(String criteriaValue1) {
		CriteriaValue1 = criteriaValue1;
	}
	public String getOperand1() {
		return operand1;
	}
	public void setOperand1(String operand1) {
		this.operand1 = operand1;
	}
	public String getColumnName2() {
		return ColumnName2;
	}
	public void setColumnName2(String columnName2) {
		ColumnName2 = columnName2;
	}
	public String getCriteriaValue2() {
		return CriteriaValue2;
	}
	public void setCriteriaValue2(String criteriaValue2) {
		CriteriaValue2 = criteriaValue2;
	}
	public String getOperand2() {
		return operand2;
	}
	public void setOperand2(String operand2) {
		this.operand2 = operand2;
	}
	private String CriteriaValue1;
	private String operand1;
	private String ColumnName2;
	private String CriteriaValue2;
	private String operand2;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getColumnName() {
		return ColumnName;
	}
	public void setColumnName(String columnName) {
		ColumnName = columnName;
	}
	public String getCriteriaValue() {
		return CriteriaValue;
	}
	public void setCriteriaValue(String criteriaValue) {
		CriteriaValue = criteriaValue;
	}
	public String getOperand() {
		return operand;
	}
	public void setOperand(String operand) {
		this.operand = operand;
	}
	@Override
	public String toString() {
		return "SibDetailsModel [company=" + company + ", password=" + password + ", userName=" + userName
				+ ", ColumnName=" + ColumnName + ", CriteriaValue=" + CriteriaValue + ", operand=" + operand
				+ ", ColumnName1=" + ColumnName1 + ", CriteriaValue1=" + CriteriaValue1 + ", operand1=" + operand1
				+ ", ColumnName2=" + ColumnName2 + ", CriteriaValue2=" + CriteriaValue2 + ", operand2=" + operand2
				+ "]";
	}
	
	


	}



