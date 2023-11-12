package com.dh.complaint.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ComplaintResponse"
})
public class CreateComplaintResponse {
	
	@JsonProperty("ComplaintResponse")
    private ComplaintResponse complaintResponse;

	public CreateComplaintResponse() {
		super();
	}

	public CreateComplaintResponse(ComplaintResponse complaintResponse) {
		super();
		this.complaintResponse = complaintResponse;
	}

	public ComplaintResponse getComplaintResponse() {
		return complaintResponse;
	}

	public void setComplaintResponse(ComplaintResponse complaintResponse) {
		this.complaintResponse = complaintResponse;
	}

	@Override
	public String toString() {
		return "CreateComplaintResponse [complaintResponse=" + complaintResponse + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(complaintResponse);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreateComplaintResponse other = (CreateComplaintResponse) obj;
		return Objects.equals(complaintResponse, other.complaintResponse);
	}
	
	

}
