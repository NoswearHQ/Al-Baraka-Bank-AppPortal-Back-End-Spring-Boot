package com.example.AppPortal.KYC.WSKYCPMGETACTIONNAIRE.Controller;

public class WSKYCPMGETACTIONNAIREModel {
	private String company;
	private String password;
	private String userName;
	private String ColumnName;
	private String CriteriaValue;
	private String operand;
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
		return "AuthModel [company=" + company + ", password=" + password + ", userName=" + userName + ", ColumnName="
				+ ColumnName + ", CriteriaValue=" + CriteriaValue + ", operand=" + operand + ", getCompany()="
				+ getCompany() + ", getPassword()=" + getPassword() + ", getUserName()=" + getUserName()
				+ ", getColumnName()=" + getColumnName() + ", getCriteriaValue()=" + getCriteriaValue() + ", getOperand()="
				+ getOperand() + "]";
	}


	}





