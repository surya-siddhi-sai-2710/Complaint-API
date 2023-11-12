package com.dh.complaint.models.backend;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "errorCode", "errorMessage", "srNumber" })
@XmlRootElement(name = "CreatePOS_Output")
public class CreatePOSOutputBackend
{
    @XmlElement(name = "ErrorCode", required = true)
    protected String errorCode;
    @XmlElement(name = "ErrorMessage", required = true)
    protected String errorMessage;
    @XmlElement(name = "SRNumber", required = true)
    protected String srNumber;
    
    public String getErrorCode() {
        return this.errorCode;
    }
    
    public void setErrorCode(final String errorCode) {
        this.errorCode = errorCode;
    }
    
    public String getErrorMessage() {
        return this.errorMessage;
    }
    
    public void setErrorMessage(final String errorMessage) {
        this.errorMessage = errorMessage;
    }
    
    public String getSRNumber() {
        return this.srNumber;
    }
    
    public void setSRNumber(final String srNumber) {
        this.srNumber = srNumber;
    }

	@Override
	public String toString() {
		return "CreatePOSOutput [errorCode=" + errorCode + ", errorMessage=" + errorMessage + ", srNumber=" + srNumber
				+ "]";
	}

	public CreatePOSOutputBackend(String errorCode, String errorMessage, String srNumber) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.srNumber = srNumber;
	}

	public CreatePOSOutputBackend() {
		super();
	}
    
    
}