package com.dh.complaint.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreatePOSOutput {

	@JsonProperty("ErrorCode")
	protected String errorCode;
	@JsonProperty("ErrorMessage")
    protected String errorMessage;
	@JsonProperty("SRNumber")
    protected String srNumber;
	
	public CreatePOSOutput(String errorCode, String errorMessage, String srNumber) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.srNumber = srNumber;
	}
	
	public CreatePOSOutput() {
		super();
	}
	
	@Override
	public String toString() {
		return "CreatePOSOutput [errorCode=" + errorCode + ", errorMessage=" + errorMessage + ", srNumber=" + srNumber
				+ "]";
	}
	
	public String getErrorCode() {
		return errorCode;
	}
	
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public String getSrNumber() {
		return srNumber;
	}
	
	public void setSrNumber(String srNumber) {
		this.srNumber = srNumber;
	}
	
}
