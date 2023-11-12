
package com.dh.complaint.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ComplaintRequest"
})
public class CreateRequest {

    @JsonProperty("ComplaintRequest")
    private ComplaintRequest complaintRequest;

    @JsonProperty("ComplaintRequest")
    public ComplaintRequest getComplaintRequest() {
        return complaintRequest;
    }

    @JsonProperty("ComplaintRequest")
    public void setComplaintRequest(ComplaintRequest complaintRequest) {
        this.complaintRequest = complaintRequest;
    }

	@Override
	public String toString() {
		return "CreateRequest [complaintRequest=" + complaintRequest + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(complaintRequest);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreateRequest other = (CreateRequest) obj;
		return Objects.equals(complaintRequest, other.complaintRequest);
	}

	public CreateRequest(ComplaintRequest complaintRequest) {
		super();
		this.complaintRequest = complaintRequest;
	}

	public CreateRequest() {
		super();
	}
	
	
   

}
