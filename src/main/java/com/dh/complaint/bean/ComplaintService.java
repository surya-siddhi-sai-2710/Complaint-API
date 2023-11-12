package com.dh.complaint.bean;

import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.dh.complaint.models.Attachment;
import com.dh.complaint.models.Complaint;
import com.dh.complaint.models.ComplaintRequest;
import com.dh.complaint.models.ComplaintResponse;
import com.dh.complaint.models.CreateComplaintRequest;
import com.dh.complaint.models.CreateComplaintResponse;
import com.dh.complaint.models.CreatePOSOutput;
import com.dh.complaint.models.CreateRequest;
import com.dh.complaint.models.backend.ComplaintBackend;
import com.dh.complaint.models.backend.CreatePOSInputBackend;
import com.dh.complaint.models.backend.CreatePOSOutputBackend;
import com.dh.complaint.models.backend.ListOfServiceRequestBackend;
import com.dh.complaint.models.backend.ListOfServiceRequestAttachmentBackend;
import com.dh.complaint.models.backend.ServiceRequestBackend;
import com.dh.complaint.models.backend.ServiceRequestAttachmentBackend;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.camel.Exchange;
import org.apache.camel.Message;

@Component
public class ComplaintService {
	
	XPath xPath = XPathFactory.newInstance().newXPath();
	
	private CreateComplaintRequest oCreateComplaintRequest;
	
	public ComplaintService() throws IOException {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            oDocumentBuilder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            // Handle the exception or log an error here
        	throw new IOException("Failed to create settings document builder", e);
        }
    }

	public CreateComplaintRequest getoCreateComplaintRequest() {
		return oCreateComplaintRequest;
	}

	public void setoCreateComplaintRequest(CreateComplaintRequest oCreateComplaintRequest) {
		this.oCreateComplaintRequest = oCreateComplaintRequest;
	}
	
	public void setCreateComplaintRequest(Exchange exchange) throws Exception {

		Message oMessage = exchange.getIn();

		this.setoCreateComplaintRequest(oMessage.getBody(CreateComplaintRequest.class));
	}
	
	

	public void preparePOSRequestBackend(Exchange exchange) throws Exception{
		
		Message oMessage = exchange.getIn();
		
		CreateComplaintRequest createComplaintRequest = this.getoCreateComplaintRequest();
		ComplaintRequest oComplaintRequest = createComplaintRequest.getComplaintRequest();
		
		// backend classes objects are initilized
		CreatePOSInputBackend oCreatePOSInput = new CreatePOSInputBackend();
		ListOfServiceRequestBackend olListOfServiceRequest = new ListOfServiceRequestBackend();
		ListOfServiceRequestAttachmentBackend ofServiceRequestAttachment = new ListOfServiceRequestAttachmentBackend();
		ServiceRequestBackend serviceRequest = new ServiceRequestBackend();
		
		
		
		//service request mapping
		serviceRequest.setSRDescription(oComplaintRequest.getSRDescription());
		serviceRequest.setSRSubArea(oComplaintRequest.getSubArea());
		serviceRequest.setCIFNumber(oComplaintRequest.getCif());
		serviceRequest.setSRService(oComplaintRequest.getSRService());
		serviceRequest.setReceivedCallDate(oComplaintRequest.getReceivedCallDate());
		serviceRequest.setSRMobilePhoneNumber(oComplaintRequest.getSRMobilePhoneNumber());
		serviceRequest.setMobileNumber(oComplaintRequest.getMobileNumber());
		serviceRequest.setAmount(oComplaintRequest.getAmount());
		serviceRequest.setMerchantName(oComplaintRequest.getMerchantName());
		serviceRequest.setTerminalCount(oComplaintRequest.getTerminalCount());
		serviceRequest.setBankCreatorCard(oComplaintRequest.getBankCreatorCard());
		serviceRequest.setProcessNumber(oComplaintRequest.getProcessNumber());
		serviceRequest.setTerminalNumber(oComplaintRequest.getTerminalNumber());
		serviceRequest.setRegion(oComplaintRequest.getRegion());
		serviceRequest.setFinancialClaimType(oComplaintRequest.getFinancialClaimType());
		serviceRequest.setDateOfProcess(oComplaintRequest.getDateOfProcess());
		serviceRequest.setAccountType(oComplaintRequest.getAccountType());
		serviceRequest.setMerchantNumber(oComplaintRequest.getMerchantNumber());
		serviceRequest.setDateOfDiscount(oComplaintRequest.getDateOfDiscount());
		serviceRequest.setDiscountCode(oComplaintRequest.getDiscountCode());
		serviceRequest.setContactPersonName(oComplaintRequest.getContactPersonName());
		serviceRequest.setProblemType(oComplaintRequest.getProblemType());
		serviceRequest.setHeatNumber(oComplaintRequest.getHeatNumber());
		serviceRequest.setCompanyNotificationDate(oComplaintRequest.getCompanyNotificationDate());
		serviceRequest.setVendorEmail(oComplaintRequest.getVendorEmail());
		
		
		//mapping service request attachment
		List<Attachment> attachment = oComplaintRequest.getAttachment();
		List<ServiceRequestAttachmentBackend> oServiceRequestAttachment = new ArrayList<ServiceRequestAttachmentBackend>();
		
		for(Attachment oAttachment : attachment) {
			
			ServiceRequestAttachmentBackend oServiceRequestAttachment1 = new ServiceRequestAttachmentBackend();
			oServiceRequestAttachment1.setAttachmentComments(oAttachment.getAttachmentComments());
			oServiceRequestAttachment1.setAttachmentFileBuffer(oAttachment.getAttachmentFileBuffer());
			oServiceRequestAttachment1.setAttachmentFileExtension(oAttachment.getAttachmentFileExtension());
			oServiceRequestAttachment1.setAttachmentFileName(oAttachment.getAttachmentFileName());
			oServiceRequestAttachment.add(oServiceRequestAttachment1);
			
		}
		
		ofServiceRequestAttachment.setServiceRequestAttachment(oServiceRequestAttachment);
		serviceRequest.setListOfServiceRequestAttachment(ofServiceRequestAttachment);
		olListOfServiceRequest.setServiceRequest(serviceRequest);
		oCreatePOSInput.setListOfServiceRequest(olListOfServiceRequest);
		
		
		oMessage.setBody(oCreatePOSInput);
		
		
	}
	
	public void setPOSRequestResponse(Exchange exchange) throws Exception {
		
		Message oMessage = exchange.getIn();
		
		Document oDocument = getDomObject((InputStream) oMessage.getBody(InputStream.class));
		
//		CreatePOSOutputBackend oCreatePOSOutputBackend = exchange.getIn().getBody(CreatePOSOutputBackend.class);
		
		NodeList CreatePOS_Output = (NodeList) xPath.compile("/CreatePOS_Output").evaluate(oDocument,
				XPathConstants.NODE);
		
		CreateComplaintResponse oCreateComplaintResponse = new CreateComplaintResponse();
		ComplaintResponse oComplaintResponse = new ComplaintResponse();
		Complaint complaint = new Complaint();
		
		
		complaint.setSRNumber((String) xPath.evaluate("SRNumber", CreatePOS_Output, XPathConstants.STRING));
		complaint.setStatus((String) xPath.evaluate("Status", CreatePOS_Output, XPathConstants.STRING));
		complaint.setStatusMessage((String) xPath.evaluate("StatusMessage", CreatePOS_Output, XPathConstants.STRING));
		
//		ComplaintBackend complaintBackend = new ComplaintBackend();
//		oCreatePOSOutput.setErrorCode(oCreatePOSOutputBackend.getErrorCode());
//		oCreatePOSOutput.setErrorMessage(oCreatePOSOutputBackend.getErrorMessage());
//		oCreatePOSOutput.setSrNumber(oCreatePOSOutputBackend.getSRNumber());
		
		oComplaintResponse.setComplaint(complaint);
		oCreateComplaintResponse.setComplaintResponse(oComplaintResponse);
		
		
		
//		oMessage.setBody(oCreateComplaintResponse);
		oMessage.setBody(oCreateComplaintResponse);
		

	}
	
	
	private static DocumentBuilder oDocumentBuilder;
	
	public synchronized Document getDomObject(InputStream payload)
			throws SAXException, IOException, XPathExpressionException 
			{
		Document oDocument = oDocumentBuilder.parse(payload);
		return oDocument;
	}

	
}
