package com.dh.complaint.models.backend;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfServiceRequestAttachment", propOrder = { "serviceRequestAttachment" })
public class ListOfServiceRequestAttachmentBackend
{
    @XmlElement(name = "ServiceRequestAttachment", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
    protected List<ServiceRequestAttachmentBackend> serviceRequestAttachment;

	public List<ServiceRequestAttachmentBackend> getServiceRequestAttachment() {
		return serviceRequestAttachment;
	}

	public void setServiceRequestAttachment(List<ServiceRequestAttachmentBackend> serviceRequestAttachment) {
		this.serviceRequestAttachment = serviceRequestAttachment;
	}
    
}