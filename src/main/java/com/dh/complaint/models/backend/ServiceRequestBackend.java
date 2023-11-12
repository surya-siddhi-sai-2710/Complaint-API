package com.dh.complaint.models.backend;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRequest", propOrder = { "amountOfProcess", "srDescription", "srSubArea", "cifNumber", "srService", "receivedCallDate", "srMobilePhoneNumber", "mobileNumber", "amount", "merchantName", "terminalCount", "bankCreatorCard", "posRequestType", "processNumber", "terminalNumber", "region", "financialClaimType", "dateOfProcess", "accountType", "merchantNumber", "dateOfDiscount", "discountCode", "accountNumber", "contactPersonName", "problemType", "heatNumber", "companyNotificationDate", "vendorEmail", "listOfServiceRequestAttachment" })
public class ServiceRequestBackend
{
    @XmlElement(name = "AmountOfProcess", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
    protected String amountOfProcess;
    
    @XmlElement(name = "SRDescription", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
    protected String srDescription;
    
    @XmlElement(name = "SRSubArea", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment", required = true)
    protected String srSubArea;
    
    @XmlElement(name = "CIFNumber", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment", required = true)
    protected String cifNumber;
    
    @XmlElement(name = "SRService", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment", required = true)
    protected String srService;
    
    @XmlElement(name = "ReceivedCallDate", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
    protected String receivedCallDate;
    
    @XmlElement(name = "SRMobilePhoneNumber", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
    protected String srMobilePhoneNumber;
    
    @XmlElement(name = "MobileNumber", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
    protected String mobileNumber;
    
    @XmlElement(name = "Amount", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
    protected Integer amount;
    
    @XmlElement(name = "MerchantName", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
    protected String merchantName;
    
    @XmlElement(name = "TerminalCount", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
    protected Integer terminalCount;
    
    @XmlElement(name = "BankCreatorCard", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
    protected String bankCreatorCard;
    
    @XmlElement(name = "POSRequestType", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
    protected String posRequestType;
    
    @XmlElement(name = "ProcessNumber", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
    protected String processNumber;
    
    @XmlElement(name = "TerminalNumber", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
    protected String terminalNumber;
    
    @XmlElement(name = "Region", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
    protected String region;
    
    @XmlElement(name = "FinancialClaimType", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
    protected String financialClaimType;
    
    @XmlElement(name = "DateOfProcess", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
    protected String dateOfProcess;
    
    @XmlElement(name = "AccountType", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
    protected String accountType;
    
    @XmlElement(name = "MerchantNumber", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
    protected String merchantNumber;
    
    @XmlElement(name = "DateOfDiscount", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
    protected String dateOfDiscount;
    
    @XmlElement(name = "DiscountCode", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
    protected String discountCode;
    
    @XmlElement(name = "AccountNumber", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
    protected String accountNumber;
    
    @XmlElement(name = "ContactPersonName", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
    protected String contactPersonName;
    
    @XmlElement(name = "ProblemType", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
    protected String problemType;
    
    @XmlElement(name = "HeatNumber", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
    protected String heatNumber;
    
    @XmlElement(name = "CompanyNotificationDate", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
    protected String companyNotificationDate;
    
    @XmlElement(name = "VendorEmail", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
    protected String vendorEmail;
    
    @XmlElement(name = "ListOfServiceRequestAttachment", namespace = "http://www.siebel.com/xml/Service%20Request%20Attachment")
    protected ListOfServiceRequestAttachmentBackend listOfServiceRequestAttachment;
    
    public String getAmountOfProcess() {
        return this.amountOfProcess;
    }
    
    public void setAmountOfProcess(final String amountOfProcess) {
        this.amountOfProcess = amountOfProcess;
    }
    
    public String getSRDescription() {
        return this.srDescription;
    }
    
    public void setSRDescription(final String srDescription) {
        this.srDescription = srDescription;
    }
    
    public String getSRSubArea() {
        return this.srSubArea;
    }
    
    public void setSRSubArea(final String srSubArea) {
        this.srSubArea = srSubArea;
    }
    
    public String getCIFNumber() {
        return this.cifNumber;
    }
    
    public void setCIFNumber(final String cifNumber) {
        this.cifNumber = cifNumber;
    }
    
    public String getSRService() {
        return this.srService;
    }
    
    public void setSRService(final String srService) {
        this.srService = srService;
    }
    
    public String getReceivedCallDate() {
        return this.receivedCallDate;
    }
    
    public void setReceivedCallDate(final String receivedCallDate) {
        this.receivedCallDate = receivedCallDate;
    }
    
    public String getSRMobilePhoneNumber() {
        return this.srMobilePhoneNumber;
    }
    
    public void setSRMobilePhoneNumber(final String srMobilePhoneNumber) {
        this.srMobilePhoneNumber = srMobilePhoneNumber;
    }
    
    public String getMobileNumber() {
        return this.mobileNumber;
    }
    
    public void setMobileNumber(final String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    
    public Integer getAmount() {
        return this.amount;
    }
    
    public void setAmount(final Integer integer) {
        this.amount = integer;
    }
    
    public String getMerchantName() {
        return this.merchantName;
    }
    
    public void setMerchantName(final String merchantName) {
        this.merchantName = merchantName;
    }
    
    public Integer getTerminalCount() {
        return this.terminalCount;
    }
    
    public void setTerminalCount(final Integer integer) {
        this.terminalCount = integer;
    }
    
    public String getBankCreatorCard() {
        return this.bankCreatorCard;
    }
    
    public void setBankCreatorCard(final String bankCreatorCard) {
        this.bankCreatorCard = bankCreatorCard;
    }
    
    public String getPOSRequestType() {
        return this.posRequestType;
    }
    
    public void setPOSRequestType(final String posRequestType) {
        this.posRequestType = posRequestType;
    }
    
    public String getProcessNumber() {
        return this.processNumber;
    }
    
    public void setProcessNumber(final String processNumber) {
        this.processNumber = processNumber;
    }
    
    public String getTerminalNumber() {
        return this.terminalNumber;
    }
    
    public void setTerminalNumber(final String terminalNumber) {
        this.terminalNumber = terminalNumber;
    }
    
    public String getRegion() {
        return this.region;
    }
    
    public void setRegion(final String region) {
        this.region = region;
    }
    
    public String getFinancialClaimType() {
        return this.financialClaimType;
    }
    
    public void setFinancialClaimType(final String financialClaimType) {
        this.financialClaimType = financialClaimType;
    }
    
    public String getDateOfProcess() {
        return this.dateOfProcess;
    }
    
    public void setDateOfProcess(final String dateOfProcess) {
        this.dateOfProcess = dateOfProcess;
    }
    
    public String getAccountType() {
        return this.accountType;
    }
    
    public void setAccountType(final String accountType) {
        this.accountType = accountType;
    }
    
    public String getMerchantNumber() {
        return this.merchantNumber;
    }
    
    public void setMerchantNumber(final String merchantNumber) {
        this.merchantNumber = merchantNumber;
    }
    
    public String getDateOfDiscount() {
        return this.dateOfDiscount;
    }
    
    public void setDateOfDiscount(final String dateOfDiscount) {
        this.dateOfDiscount = dateOfDiscount;
    }
    
    public String getDiscountCode() {
        return this.discountCode;
    }
    
    public void setDiscountCode(final String discountCode) {
        this.discountCode = discountCode;
    }
    
    public String getAccountNumber() {
        return this.accountNumber;
    }
    
    public void setAccountNumber(final String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public String getContactPersonName() {
        return this.contactPersonName;
    }
    
    public void setContactPersonName(final String contactPersonName) {
        this.contactPersonName = contactPersonName;
    }
    
    public String getProblemType() {
        return this.problemType;
    }
    
    public void setProblemType(final String problemType) {
        this.problemType = problemType;
    }
    
    public String getHeatNumber() {
        return this.heatNumber;
    }
    
    public void setHeatNumber(final String heatNumber) {
        this.heatNumber = heatNumber;
    }
    
    public String getCompanyNotificationDate() {
        return this.companyNotificationDate;
    }
    
    public void setCompanyNotificationDate(final String companyNotificationDate) {
        this.companyNotificationDate = companyNotificationDate;
    }
    
    public String getVendorEmail() {
        return this.vendorEmail;
    }
    
    public void setVendorEmail(final String vendorEmail) {
        this.vendorEmail = vendorEmail;
    }
    
    public ListOfServiceRequestAttachmentBackend getListOfServiceRequestAttachment() {
        return this.listOfServiceRequestAttachment;
    }
    
    public void setListOfServiceRequestAttachment(ListOfServiceRequestAttachmentBackend listOfServiceRequestAttachment) {
        this.listOfServiceRequestAttachment = listOfServiceRequestAttachment;
    }
    
}