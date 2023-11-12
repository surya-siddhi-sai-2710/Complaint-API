package com.dh.complaint.route;

import javax.xml.bind.JAXBContext;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

import com.dh.complaint.models.ComplaintRequest;
import com.dh.complaint.models.CreateComplaintRequest;
import com.dh.complaint.models.CreateComplaintResponse;
import com.dh.complaint.models.CreatePOSOutput;
import com.dh.complaint.models.backend.ComplaintBackend;
import com.dh.complaint.models.backend.CreatePOSInputBackend;
import com.dh.complaint.models.backend.CreatePOSOutputBackend;

@Component
public class ComplaintRouteBuilder extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		restConfiguration().bindingMode(RestBindingMode.auto);
		 rest("/api")
		.post("/complaint/v1")
		.type(CreateComplaintRequest.class)
		.outType(CreateComplaintResponse.class)
		.consumes("application/json")
		.produces("application/json")
		.to("direct:invoke-POS-request");
		 
		 JaxbDataFormat createPOSInputFormat = new JaxbDataFormat();
		 JAXBContext jaxcon = JAXBContext.newInstance(CreatePOSInputBackend.class);
		 createPOSInputFormat.setContext(jaxcon); 
		
		from("direct:invoke-POS-request")
		.to("bean:complaintService?method=setCreateComplaintRequest")
		.to("bean:complaintService?method=preparePOSRequestBackend")
		.log("log1")
		.marshal(createPOSInputFormat)
//		.marshal().jacksonXml(CreatePOSInputBackend.class)
		.log("log after marshall: ${body}")
		.to("{{Complaint_Url.host}}"+"/api/complaint/v1?bridgeEndpoint=true")
		.log("${body}")
//		.unmarshal().jacksonXml(CreatePOSOutput.class)
		.to("bean:complaintService?method=setPOSRequestResponse")
		.log("log2 : ${body}")
		.setHeader("Content-Type", constant("application/json"));
	}
}
