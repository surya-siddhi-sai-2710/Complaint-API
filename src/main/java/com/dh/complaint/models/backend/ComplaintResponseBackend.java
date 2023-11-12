package com.dh.complaint.models.backend;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ComplaintResponseType")
@XmlType(name = "ComplaintResponseType", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment", propOrder = {
			"complaint" })
public class ComplaintResponseBackend {

	@XmlElement(name = "complaint", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
	private ComplaintBackend complaint;

	public ComplaintBackend getComplaint() {
		return complaint;
	}

	public void setComplaint(ComplaintBackend complaint) {
		this.complaint = complaint;
	}

	@Override
	public String toString() {
		return "ComplaintResponseBackend [complaint=" + complaint + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(complaint);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComplaintResponseBackend other = (ComplaintResponseBackend) obj;
		return Objects.equals(complaint, other.complaint);
	}

	public ComplaintResponseBackend() {
		super();
	}

	public ComplaintResponseBackend(ComplaintBackend complaint) {
		super();
		this.complaint = complaint;
	}
}
