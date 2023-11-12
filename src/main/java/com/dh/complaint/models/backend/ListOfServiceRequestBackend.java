package com.dh.complaint.models.backend;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfServiceRequest", propOrder = { "serviceRequest" })
public class ListOfServiceRequestBackend
{
    @XmlElement(name = "ServiceRequest", required = true, namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
    protected ServiceRequestBackend serviceRequest;
    
    public ServiceRequestBackend getServiceRequest() {
        return this.serviceRequest;
    }
    
    public void setServiceRequest(final ServiceRequestBackend serviceRequest) {
        this.serviceRequest = serviceRequest;
    }
}