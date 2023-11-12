package com.dh.complaint.models.backend;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ComplaintType")
@XmlType(name = "ComplaintType", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment", propOrder = {
		"SRNumber", "Status", "StatusMessage" })

public class ComplaintBackend {

	@XmlElement(name = "SRNumber", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
	private String sRNumber;

	@XmlElement(name = "Status", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
	private String status;

	@XmlElement(name = "StatusMessage", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
	private String statusMessage;

	public String getsRNumber() {
		return sRNumber;
	}

	public void setsRNumber(String sRNumber) {
		this.sRNumber = sRNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public ComplaintBackend() {
		super();
	}

	public ComplaintBackend(String sRNumber, String status, String statusMessage) {
		super();
		this.sRNumber = sRNumber;
		this.status = status;
		this.statusMessage = statusMessage;
	}
}
