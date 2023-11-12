
package com.dh.complaint.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Type",
    "Area",
    "DupFlg",
    "Attrib1",
    "Attrib2",
    "Attrib3",
    "Attrib4",
    "Attrib5",
    "Attrib6",
    "Attrib7",
    "Attrib8",
    "Attrib9",
    "Attrib10",
    "Attrib11",
    "Attrib12",
    "Attrib13",
    "Attrib14",
    "Attrib15",
    "Attrib16",
    "Attrib17",
    "Attrib18",
    "Attrib19",
    "Attrib20",
    "Attrib21",
    "Attrib22",
    "Attrib23",
    "Attrib24",
    "Attrib25",
    "Attrib26",
    "Attrib27",
    "Attrib28",
    "Attrib29",
    "Attrib30",
    "CreditCard",
    "Source",
    "SRDescription",
    "subArea",
    "cif",
    "SRService",
    "SRMobilePhoneNumber",
    "merchantName",
    "terminalCount",
    "terminalNumber",
    "attachment",
    "processAmount",
    "receivedCallDate",
    "mobileNumber",
    "amount",
    "bankCreatorCard",
    "processNumber",
    "dateOfProcess",
    "accountType",
    "merchantNumber",
    "dateOfDiscount",
    "discountCode",
    "accountId",
    "contactPersonName",
    "problemType",
    "heatNumber",
    "companyNotificationDate",
    "vendorEmail",
    "region",
    "financialClaimType",
    "requestType",
    "atmCardNumber",
    "listOfNotes"
})
public class ComplaintRequest {

    @JsonProperty("Type")
    private String type;
    @JsonProperty("Area")
    private String area;
    @JsonProperty("DupFlg")
    private String dupFlg;
    @JsonProperty("Attrib1")
    private String attrib1;
    @JsonProperty("Attrib2")
    private String attrib2;
    @JsonProperty("Attrib3")
    private String attrib3;
    @JsonProperty("Attrib4")
    private String attrib4;
    @JsonProperty("Attrib5")
    private String attrib5;
    @JsonProperty("Attrib6")
    private String attrib6;
    @JsonProperty("Attrib7")
    private String attrib7;
    @JsonProperty("Attrib8")
    private String attrib8;
    @JsonProperty("Attrib9")
    private String attrib9;
    @JsonProperty("Attrib10")
    private String attrib10;
    @JsonProperty("Attrib11")
    private String attrib11;
    @JsonProperty("Attrib12")
    private String attrib12;
    @JsonProperty("Attrib13")
    private String attrib13;
    @JsonProperty("Attrib14")
    private String attrib14;
    @JsonProperty("Attrib15")
    private String attrib15;
    @JsonProperty("Attrib16")
    private String attrib16;
    @JsonProperty("Attrib17")
    private String attrib17;
    @JsonProperty("Attrib18")
    private String attrib18;
    @JsonProperty("Attrib19")
    private String attrib19;
    @JsonProperty("Attrib20")
    private String attrib20;
    @JsonProperty("Attrib21")
    private String attrib21;
    @JsonProperty("Attrib22")
    private String attrib22;
    @JsonProperty("Attrib23")
    private String attrib23;
    @JsonProperty("Attrib24")
    private String attrib24;
    @JsonProperty("Attrib25")
    private String attrib25;
    @JsonProperty("Attrib26")
    private String attrib26;
    @JsonProperty("Attrib27")
    private String attrib27;
    @JsonProperty("Attrib28")
    private String attrib28;
    @JsonProperty("Attrib29")
    private String attrib29;
    @JsonProperty("Attrib30")
    private String attrib30;
    @JsonProperty("CreditCard")
    private String creditCard;
    @JsonProperty("Source")
    private String source;
    @JsonProperty("SRDescription")
    private String sRDescription;
    @JsonProperty("subArea")
    private String subArea;
    @JsonProperty("cif")
    private String cif;
    @JsonProperty("SRService")
    private String sRService;
    @JsonProperty("SRMobilePhoneNumber")
    private String sRMobilePhoneNumber;
    @JsonProperty("merchantName")
    private String merchantName;
    @JsonProperty("terminalCount")
    private Integer terminalCount;
    @JsonProperty("terminalNumber")
    private String terminalNumber;
    @JsonProperty("attachment")
    private List<Attachment> attachment = new ArrayList<Attachment>();
    @JsonProperty("processAmount")
    private Integer processAmount;
    @JsonProperty("receivedCallDate")
    private String receivedCallDate;
    @JsonProperty("mobileNumber")
    private String mobileNumber;
    @JsonProperty("amount")
    private Integer amount;
    @JsonProperty("bankCreatorCard")
    private String bankCreatorCard;
    @JsonProperty("processNumber")
    private String processNumber;
    @JsonProperty("dateOfProcess")
    private String dateOfProcess;
    @JsonProperty("accountType")
    private String accountType;
    @JsonProperty("merchantNumber")
    private String merchantNumber;
    @JsonProperty("dateOfDiscount")
    private String dateOfDiscount;
    @JsonProperty("discountCode")
    private String discountCode;
    @JsonProperty("accountId")
    private String accountId;
    @JsonProperty("contactPersonName")
    private String contactPersonName;
    @JsonProperty("problemType")
    private String problemType;
    @JsonProperty("heatNumber")
    private String heatNumber;
    @JsonProperty("companyNotificationDate")
    private String companyNotificationDate;
    @JsonProperty("vendorEmail")
    private String vendorEmail;
    @JsonProperty("region")
    private String region;
    @JsonProperty("financialClaimType")
    private String financialClaimType;
    @JsonProperty("requestType")
    private String requestType;
    @JsonProperty("atmCardNumber")
    private String atmCardNumber;
    @JsonProperty("listOfNotes")
    private ListOfNotes listOfNotes;

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("Area")
    public String getArea() {
        return area;
    }

    @JsonProperty("Area")
    public void setArea(String area) {
        this.area = area;
    }

    @JsonProperty("DupFlg")
    public String getDupFlg() {
        return dupFlg;
    }

    @JsonProperty("DupFlg")
    public void setDupFlg(String dupFlg) {
        this.dupFlg = dupFlg;
    }

    @JsonProperty("Attrib1")
    public String getAttrib1() {
        return attrib1;
    }

    @JsonProperty("Attrib1")
    public void setAttrib1(String attrib1) {
        this.attrib1 = attrib1;
    }

    @JsonProperty("Attrib2")
    public String getAttrib2() {
        return attrib2;
    }

    @JsonProperty("Attrib2")
    public void setAttrib2(String attrib2) {
        this.attrib2 = attrib2;
    }

    @JsonProperty("Attrib3")
    public String getAttrib3() {
        return attrib3;
    }

    @JsonProperty("Attrib3")
    public void setAttrib3(String attrib3) {
        this.attrib3 = attrib3;
    }

    @JsonProperty("Attrib4")
    public String getAttrib4() {
        return attrib4;
    }

    @JsonProperty("Attrib4")
    public void setAttrib4(String attrib4) {
        this.attrib4 = attrib4;
    }

    @JsonProperty("Attrib5")
    public String getAttrib5() {
        return attrib5;
    }

    @JsonProperty("Attrib5")
    public void setAttrib5(String attrib5) {
        this.attrib5 = attrib5;
    }

    @JsonProperty("Attrib6")
    public String getAttrib6() {
        return attrib6;
    }

    @JsonProperty("Attrib6")
    public void setAttrib6(String attrib6) {
        this.attrib6 = attrib6;
    }

    @JsonProperty("Attrib7")
    public String getAttrib7() {
        return attrib7;
    }

    @JsonProperty("Attrib7")
    public void setAttrib7(String attrib7) {
        this.attrib7 = attrib7;
    }

    @JsonProperty("Attrib8")
    public String getAttrib8() {
        return attrib8;
    }

    @JsonProperty("Attrib8")
    public void setAttrib8(String attrib8) {
        this.attrib8 = attrib8;
    }

    @JsonProperty("Attrib9")
    public String getAttrib9() {
        return attrib9;
    }

    @JsonProperty("Attrib9")
    public void setAttrib9(String attrib9) {
        this.attrib9 = attrib9;
    }

    @JsonProperty("Attrib10")
    public String getAttrib10() {
        return attrib10;
    }

    @JsonProperty("Attrib10")
    public void setAttrib10(String attrib10) {
        this.attrib10 = attrib10;
    }

    @JsonProperty("Attrib11")
    public String getAttrib11() {
        return attrib11;
    }

    @JsonProperty("Attrib11")
    public void setAttrib11(String attrib11) {
        this.attrib11 = attrib11;
    }

    @JsonProperty("Attrib12")
    public String getAttrib12() {
        return attrib12;
    }

    @JsonProperty("Attrib12")
    public void setAttrib12(String attrib12) {
        this.attrib12 = attrib12;
    }

    @JsonProperty("Attrib13")
    public String getAttrib13() {
        return attrib13;
    }

    @JsonProperty("Attrib13")
    public void setAttrib13(String attrib13) {
        this.attrib13 = attrib13;
    }

    @JsonProperty("Attrib14")
    public String getAttrib14() {
        return attrib14;
    }

    @JsonProperty("Attrib14")
    public void setAttrib14(String attrib14) {
        this.attrib14 = attrib14;
    }

    @JsonProperty("Attrib15")
    public String getAttrib15() {
        return attrib15;
    }

    @JsonProperty("Attrib15")
    public void setAttrib15(String attrib15) {
        this.attrib15 = attrib15;
    }

    @JsonProperty("Attrib16")
    public String getAttrib16() {
        return attrib16;
    }

    @JsonProperty("Attrib16")
    public void setAttrib16(String attrib16) {
        this.attrib16 = attrib16;
    }

    @JsonProperty("Attrib17")
    public String getAttrib17() {
        return attrib17;
    }

    @JsonProperty("Attrib17")
    public void setAttrib17(String attrib17) {
        this.attrib17 = attrib17;
    }

    @JsonProperty("Attrib18")
    public String getAttrib18() {
        return attrib18;
    }

    @JsonProperty("Attrib18")
    public void setAttrib18(String attrib18) {
        this.attrib18 = attrib18;
    }

    @JsonProperty("Attrib19")
    public String getAttrib19() {
        return attrib19;
    }

    @JsonProperty("Attrib19")
    public void setAttrib19(String attrib19) {
        this.attrib19 = attrib19;
    }

    @JsonProperty("Attrib20")
    public String getAttrib20() {
        return attrib20;
    }

    @JsonProperty("Attrib20")
    public void setAttrib20(String attrib20) {
        this.attrib20 = attrib20;
    }

    @JsonProperty("Attrib21")
    public String getAttrib21() {
        return attrib21;
    }

    @JsonProperty("Attrib21")
    public void setAttrib21(String attrib21) {
        this.attrib21 = attrib21;
    }

    @JsonProperty("Attrib22")
    public String getAttrib22() {
        return attrib22;
    }

    @JsonProperty("Attrib22")
    public void setAttrib22(String attrib22) {
        this.attrib22 = attrib22;
    }

    @JsonProperty("Attrib23")
    public String getAttrib23() {
        return attrib23;
    }

    @JsonProperty("Attrib23")
    public void setAttrib23(String attrib23) {
        this.attrib23 = attrib23;
    }

    @JsonProperty("Attrib24")
    public String getAttrib24() {
        return attrib24;
    }

    @JsonProperty("Attrib24")
    public void setAttrib24(String attrib24) {
        this.attrib24 = attrib24;
    }

    @JsonProperty("Attrib25")
    public String getAttrib25() {
        return attrib25;
    }

    @JsonProperty("Attrib25")
    public void setAttrib25(String attrib25) {
        this.attrib25 = attrib25;
    }

    @JsonProperty("Attrib26")
    public String getAttrib26() {
        return attrib26;
    }

    @JsonProperty("Attrib26")
    public void setAttrib26(String attrib26) {
        this.attrib26 = attrib26;
    }

    @JsonProperty("Attrib27")
    public String getAttrib27() {
        return attrib27;
    }

    @JsonProperty("Attrib27")
    public void setAttrib27(String attrib27) {
        this.attrib27 = attrib27;
    }

    @JsonProperty("Attrib28")
    public String getAttrib28() {
        return attrib28;
    }

    @JsonProperty("Attrib28")
    public void setAttrib28(String attrib28) {
        this.attrib28 = attrib28;
    }

    @JsonProperty("Attrib29")
    public String getAttrib29() {
        return attrib29;
    }

    @JsonProperty("Attrib29")
    public void setAttrib29(String attrib29) {
        this.attrib29 = attrib29;
    }

    @JsonProperty("Attrib30")
    public String getAttrib30() {
        return attrib30;
    }

    @JsonProperty("Attrib30")
    public void setAttrib30(String attrib30) {
        this.attrib30 = attrib30;
    }

    @JsonProperty("CreditCard")
    public String getCreditCard() {
        return creditCard;
    }

    @JsonProperty("CreditCard")
    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    @JsonProperty("Source")
    public String getSource() {
        return source;
    }

    @JsonProperty("Source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("SRDescription")
    public String getSRDescription() {
        return sRDescription;
    }

    @JsonProperty("SRDescription")
    public void setSRDescription(String sRDescription) {
        this.sRDescription = sRDescription;
    }

    @JsonProperty("subArea")
    public String getSubArea() {
        return subArea;
    }

    @JsonProperty("subArea")
    public void setSubArea(String subArea) {
        this.subArea = subArea;
    }

    @JsonProperty("cif")
    public String getCif() {
        return cif;
    }

    @JsonProperty("cif")
    public void setCif(String cif) {
        this.cif = cif;
    }

    @JsonProperty("SRService")
    public String getSRService() {
        return sRService;
    }

    @JsonProperty("SRService")
    public void setSRService(String sRService) {
        this.sRService = sRService;
    }

    @JsonProperty("SRMobilePhoneNumber")
    public String getSRMobilePhoneNumber() {
        return sRMobilePhoneNumber;
    }

    @JsonProperty("SRMobilePhoneNumber")
    public void setSRMobilePhoneNumber(String sRMobilePhoneNumber) {
        this.sRMobilePhoneNumber = sRMobilePhoneNumber;
    }

    @JsonProperty("merchantName")
    public String getMerchantName() {
        return merchantName;
    }

    @JsonProperty("merchantName")
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    @JsonProperty("terminalCount")
    public Integer getTerminalCount() {
        return terminalCount;
    }

    @JsonProperty("terminalCount")
    public void setTerminalCount(Integer terminalCount) {
        this.terminalCount = terminalCount;
    }

    @JsonProperty("terminalNumber")
    public String getTerminalNumber() {
        return terminalNumber;
    }

    @JsonProperty("terminalNumber")
    public void setTerminalNumber(String terminalNumber) {
        this.terminalNumber = terminalNumber;
    }

    @JsonProperty("attachment")
    public List<Attachment> getAttachment() {
        return attachment;
    }

    @JsonProperty("attachment")
    public void setAttachment(List<Attachment> attachment) {
        this.attachment = attachment;
    }

    @JsonProperty("processAmount")
    public Integer getProcessAmount() {
        return processAmount;
    }

    @JsonProperty("processAmount")
    public void setProcessAmount(Integer processAmount) {
        this.processAmount = processAmount;
    }

    @JsonProperty("receivedCallDate")
    public String getReceivedCallDate() {
        return receivedCallDate;
    }

    @JsonProperty("receivedCallDate")
    public void setReceivedCallDate(String receivedCallDate) {
        this.receivedCallDate = receivedCallDate;
    }

    @JsonProperty("mobileNumber")
    public String getMobileNumber() {
        return mobileNumber;
    }

    @JsonProperty("mobileNumber")
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @JsonProperty("amount")
    public Integer getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @JsonProperty("bankCreatorCard")
    public String getBankCreatorCard() {
        return bankCreatorCard;
    }

    @JsonProperty("bankCreatorCard")
    public void setBankCreatorCard(String bankCreatorCard) {
        this.bankCreatorCard = bankCreatorCard;
    }

    @JsonProperty("processNumber")
    public String getProcessNumber() {
        return processNumber;
    }

    @JsonProperty("processNumber")
    public void setProcessNumber(String processNumber) {
        this.processNumber = processNumber;
    }

    @JsonProperty("dateOfProcess")
    public String getDateOfProcess() {
        return dateOfProcess;
    }

    @JsonProperty("dateOfProcess")
    public void setDateOfProcess(String dateOfProcess) {
        this.dateOfProcess = dateOfProcess;
    }

    @JsonProperty("accountType")
    public String getAccountType() {
        return accountType;
    }

    @JsonProperty("accountType")
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @JsonProperty("merchantNumber")
    public String getMerchantNumber() {
        return merchantNumber;
    }

    @JsonProperty("merchantNumber")
    public void setMerchantNumber(String merchantNumber) {
        this.merchantNumber = merchantNumber;
    }

    @JsonProperty("dateOfDiscount")
    public String getDateOfDiscount() {
        return dateOfDiscount;
    }

    @JsonProperty("dateOfDiscount")
    public void setDateOfDiscount(String dateOfDiscount) {
        this.dateOfDiscount = dateOfDiscount;
    }

    @JsonProperty("discountCode")
    public String getDiscountCode() {
        return discountCode;
    }

    @JsonProperty("discountCode")
    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    @JsonProperty("accountId")
    public String getAccountId() {
        return accountId;
    }

    @JsonProperty("accountId")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @JsonProperty("contactPersonName")
    public String getContactPersonName() {
        return contactPersonName;
    }

    @JsonProperty("contactPersonName")
    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName;
    }

    @JsonProperty("problemType")
    public String getProblemType() {
        return problemType;
    }

    @JsonProperty("problemType")
    public void setProblemType(String problemType) {
        this.problemType = problemType;
    }

    @JsonProperty("heatNumber")
    public String getHeatNumber() {
        return heatNumber;
    }

    @JsonProperty("heatNumber")
    public void setHeatNumber(String heatNumber) {
        this.heatNumber = heatNumber;
    }

    @JsonProperty("companyNotificationDate")
    public String getCompanyNotificationDate() {
        return companyNotificationDate;
    }

    @JsonProperty("companyNotificationDate")
    public void setCompanyNotificationDate(String companyNotificationDate) {
        this.companyNotificationDate = companyNotificationDate;
    }

    @JsonProperty("vendorEmail")
    public String getVendorEmail() {
        return vendorEmail;
    }

    @JsonProperty("vendorEmail")
    public void setVendorEmail(String vendorEmail) {
        this.vendorEmail = vendorEmail;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("financialClaimType")
    public String getFinancialClaimType() {
        return financialClaimType;
    }

    @JsonProperty("financialClaimType")
    public void setFinancialClaimType(String financialClaimType) {
        this.financialClaimType = financialClaimType;
    }

    @JsonProperty("requestType")
    public String getRequestType() {
        return requestType;
    }

    @JsonProperty("requestType")
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    @JsonProperty("atmCardNumber")
    public String getAtmCardNumber() {
        return atmCardNumber;
    }

    @JsonProperty("atmCardNumber")
    public void setAtmCardNumber(String atmCardNumber) {
        this.atmCardNumber = atmCardNumber;
    }

    @JsonProperty("listOfNotes")
    public ListOfNotes getListOfNotes() {
        return listOfNotes;
    }

    @JsonProperty("listOfNotes")
    public void setListOfNotes(ListOfNotes listOfNotes) {
        this.listOfNotes = listOfNotes;
    }

	@Override
	public String toString() {
		return "ComplaintRequest [type=" + type + ", area=" + area + ", dupFlg=" + dupFlg + ", attrib1=" + attrib1
				+ ", attrib2=" + attrib2 + ", attrib3=" + attrib3 + ", attrib4=" + attrib4 + ", attrib5=" + attrib5
				+ ", attrib6=" + attrib6 + ", attrib7=" + attrib7 + ", attrib8=" + attrib8 + ", attrib9=" + attrib9
				+ ", attrib10=" + attrib10 + ", attrib11=" + attrib11 + ", attrib12=" + attrib12 + ", attrib13="
				+ attrib13 + ", attrib14=" + attrib14 + ", attrib15=" + attrib15 + ", attrib16=" + attrib16
				+ ", attrib17=" + attrib17 + ", attrib18=" + attrib18 + ", attrib19=" + attrib19 + ", attrib20="
				+ attrib20 + ", attrib21=" + attrib21 + ", attrib22=" + attrib22 + ", attrib23=" + attrib23
				+ ", attrib24=" + attrib24 + ", attrib25=" + attrib25 + ", attrib26=" + attrib26 + ", attrib27="
				+ attrib27 + ", attrib28=" + attrib28 + ", attrib29=" + attrib29 + ", attrib30=" + attrib30
				+ ", creditCard=" + creditCard + ", source=" + source + ", sRDescription=" + sRDescription
				+ ", subArea=" + subArea + ", cif=" + cif + ", sRService=" + sRService + ", sRMobilePhoneNumber="
				+ sRMobilePhoneNumber + ", merchantName=" + merchantName + ", terminalCount=" + terminalCount
				+ ", terminalNumber=" + terminalNumber + ", attachment=" + attachment + ", processAmount="
				+ processAmount + ", receivedCallDate=" + receivedCallDate + ", mobileNumber=" + mobileNumber
				+ ", amount=" + amount + ", bankCreatorCard=" + bankCreatorCard + ", processNumber=" + processNumber
				+ ", dateOfProcess=" + dateOfProcess + ", accountType=" + accountType + ", merchantNumber="
				+ merchantNumber + ", dateOfDiscount=" + dateOfDiscount + ", discountCode=" + discountCode
				+ ", accountId=" + accountId + ", contactPersonName=" + contactPersonName + ", problemType="
				+ problemType + ", heatNumber=" + heatNumber + ", companyNotificationDate=" + companyNotificationDate
				+ ", vendorEmail=" + vendorEmail + ", region=" + region + ", financialClaimType=" + financialClaimType
				+ ", requestType=" + requestType + ", atmCardNumber=" + atmCardNumber + ", listOfNotes=" + listOfNotes
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountId, accountType, amount, area, atmCardNumber, attachment, attrib1, attrib10,
				attrib11, attrib12, attrib13, attrib14, attrib15, attrib16, attrib17, attrib18, attrib19, attrib2,
				attrib20, attrib21, attrib22, attrib23, attrib24, attrib25, attrib26, attrib27, attrib28, attrib29,
				attrib3, attrib30, attrib4, attrib5, attrib6, attrib7, attrib8, attrib9, bankCreatorCard, cif,
				companyNotificationDate, contactPersonName, creditCard, dateOfDiscount, dateOfProcess, discountCode,
				dupFlg, financialClaimType, heatNumber, listOfNotes, merchantName, merchantNumber, mobileNumber,
				problemType, processAmount, processNumber, receivedCallDate, region, requestType, sRDescription,
				sRMobilePhoneNumber, sRService, source, subArea, terminalCount, terminalNumber, type, vendorEmail);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComplaintRequest other = (ComplaintRequest) obj;
		return Objects.equals(accountId, other.accountId) && Objects.equals(accountType, other.accountType)
				&& Objects.equals(amount, other.amount) && Objects.equals(area, other.area)
				&& Objects.equals(atmCardNumber, other.atmCardNumber) && Objects.equals(attachment, other.attachment)
				&& Objects.equals(attrib1, other.attrib1) && Objects.equals(attrib10, other.attrib10)
				&& Objects.equals(attrib11, other.attrib11) && Objects.equals(attrib12, other.attrib12)
				&& Objects.equals(attrib13, other.attrib13) && Objects.equals(attrib14, other.attrib14)
				&& Objects.equals(attrib15, other.attrib15) && Objects.equals(attrib16, other.attrib16)
				&& Objects.equals(attrib17, other.attrib17) && Objects.equals(attrib18, other.attrib18)
				&& Objects.equals(attrib19, other.attrib19) && Objects.equals(attrib2, other.attrib2)
				&& Objects.equals(attrib20, other.attrib20) && Objects.equals(attrib21, other.attrib21)
				&& Objects.equals(attrib22, other.attrib22) && Objects.equals(attrib23, other.attrib23)
				&& Objects.equals(attrib24, other.attrib24) && Objects.equals(attrib25, other.attrib25)
				&& Objects.equals(attrib26, other.attrib26) && Objects.equals(attrib27, other.attrib27)
				&& Objects.equals(attrib28, other.attrib28) && Objects.equals(attrib29, other.attrib29)
				&& Objects.equals(attrib3, other.attrib3) && Objects.equals(attrib30, other.attrib30)
				&& Objects.equals(attrib4, other.attrib4) && Objects.equals(attrib5, other.attrib5)
				&& Objects.equals(attrib6, other.attrib6) && Objects.equals(attrib7, other.attrib7)
				&& Objects.equals(attrib8, other.attrib8) && Objects.equals(attrib9, other.attrib9)
				&& Objects.equals(bankCreatorCard, other.bankCreatorCard) && Objects.equals(cif, other.cif)
				&& Objects.equals(companyNotificationDate, other.companyNotificationDate)
				&& Objects.equals(contactPersonName, other.contactPersonName)
				&& Objects.equals(creditCard, other.creditCard) && Objects.equals(dateOfDiscount, other.dateOfDiscount)
				&& Objects.equals(dateOfProcess, other.dateOfProcess)
				&& Objects.equals(discountCode, other.discountCode) && Objects.equals(dupFlg, other.dupFlg)
				&& Objects.equals(financialClaimType, other.financialClaimType)
				&& Objects.equals(heatNumber, other.heatNumber) && Objects.equals(listOfNotes, other.listOfNotes)
				&& Objects.equals(merchantName, other.merchantName)
				&& Objects.equals(merchantNumber, other.merchantNumber)
				&& Objects.equals(mobileNumber, other.mobileNumber) && Objects.equals(problemType, other.problemType)
				&& Objects.equals(processAmount, other.processAmount)
				&& Objects.equals(processNumber, other.processNumber)
				&& Objects.equals(receivedCallDate, other.receivedCallDate) && Objects.equals(region, other.region)
				&& Objects.equals(requestType, other.requestType) && Objects.equals(sRDescription, other.sRDescription)
				&& Objects.equals(sRMobilePhoneNumber, other.sRMobilePhoneNumber)
				&& Objects.equals(sRService, other.sRService) && Objects.equals(source, other.source)
				&& Objects.equals(subArea, other.subArea) && Objects.equals(terminalCount, other.terminalCount)
				&& Objects.equals(terminalNumber, other.terminalNumber) && Objects.equals(type, other.type)
				&& Objects.equals(vendorEmail, other.vendorEmail);
	}

	public ComplaintRequest() {
		super();
	}

	public ComplaintRequest(String type, String area, String dupFlg, String attrib1, String attrib2, String attrib3,
			String attrib4, String attrib5, String attrib6, String attrib7, String attrib8, String attrib9,
			String attrib10, String attrib11, String attrib12, String attrib13, String attrib14, String attrib15,
			String attrib16, String attrib17, String attrib18, String attrib19, String attrib20, String attrib21,
			String attrib22, String attrib23, String attrib24, String attrib25, String attrib26, String attrib27,
			String attrib28, String attrib29, String attrib30, String creditCard, String source, String sRDescription,
			String subArea, String cif, String sRService, String sRMobilePhoneNumber, String merchantName,
			Integer terminalCount, String terminalNumber, List<Attachment> attachment, Integer processAmount,
			String receivedCallDate, String mobileNumber, Integer amount, String bankCreatorCard, String processNumber,
			String dateOfProcess, String accountType, String merchantNumber, String dateOfDiscount, String discountCode,
			String accountId, String contactPersonName, String problemType, String heatNumber,
			String companyNotificationDate, String vendorEmail, String region, String financialClaimType,
			String requestType, String atmCardNumber, ListOfNotes listOfNotes) {
		super();
		this.type = type;
		this.area = area;
		this.dupFlg = dupFlg;
		this.attrib1 = attrib1;
		this.attrib2 = attrib2;
		this.attrib3 = attrib3;
		this.attrib4 = attrib4;
		this.attrib5 = attrib5;
		this.attrib6 = attrib6;
		this.attrib7 = attrib7;
		this.attrib8 = attrib8;
		this.attrib9 = attrib9;
		this.attrib10 = attrib10;
		this.attrib11 = attrib11;
		this.attrib12 = attrib12;
		this.attrib13 = attrib13;
		this.attrib14 = attrib14;
		this.attrib15 = attrib15;
		this.attrib16 = attrib16;
		this.attrib17 = attrib17;
		this.attrib18 = attrib18;
		this.attrib19 = attrib19;
		this.attrib20 = attrib20;
		this.attrib21 = attrib21;
		this.attrib22 = attrib22;
		this.attrib23 = attrib23;
		this.attrib24 = attrib24;
		this.attrib25 = attrib25;
		this.attrib26 = attrib26;
		this.attrib27 = attrib27;
		this.attrib28 = attrib28;
		this.attrib29 = attrib29;
		this.attrib30 = attrib30;
		this.creditCard = creditCard;
		this.source = source;
		this.sRDescription = sRDescription;
		this.subArea = subArea;
		this.cif = cif;
		this.sRService = sRService;
		this.sRMobilePhoneNumber = sRMobilePhoneNumber;
		this.merchantName = merchantName;
		this.terminalCount = terminalCount;
		this.terminalNumber = terminalNumber;
		this.attachment = attachment;
		this.processAmount = processAmount;
		this.receivedCallDate = receivedCallDate;
		this.mobileNumber = mobileNumber;
		this.amount = amount;
		this.bankCreatorCard = bankCreatorCard;
		this.processNumber = processNumber;
		this.dateOfProcess = dateOfProcess;
		this.accountType = accountType;
		this.merchantNumber = merchantNumber;
		this.dateOfDiscount = dateOfDiscount;
		this.discountCode = discountCode;
		this.accountId = accountId;
		this.contactPersonName = contactPersonName;
		this.problemType = problemType;
		this.heatNumber = heatNumber;
		this.companyNotificationDate = companyNotificationDate;
		this.vendorEmail = vendorEmail;
		this.region = region;
		this.financialClaimType = financialClaimType;
		this.requestType = requestType;
		this.atmCardNumber = atmCardNumber;
		this.listOfNotes = listOfNotes;
	}

   

}
