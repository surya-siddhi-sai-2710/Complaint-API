package com.dh.complaint.models.backend;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "listOfServiceRequest" })
@XmlRootElement(name = "CreatePOS_Input", namespace = "http://siebel.com/CustomUI")
public class CreatePOSInputBackend
{
    @XmlElement(name = "ListOfServiceRequest", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment", required = true)
    protected ListOfServiceRequestBackend listOfServiceRequest;
    
    public ListOfServiceRequestBackend getListOfServiceRequest() {
        return this.listOfServiceRequest;
    }
    
    public void setListOfServiceRequest(final ListOfServiceRequestBackend listOfServiceRequest) {
        this.listOfServiceRequest = listOfServiceRequest;
    }
}