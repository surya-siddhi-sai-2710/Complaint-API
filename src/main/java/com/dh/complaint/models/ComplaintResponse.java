
package com.dh.complaint.models;

import java.util.Objects;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "complaint"
})
public class ComplaintResponse {

    @JsonProperty("complaint")
    private Complaint complaint;

    @JsonProperty("complaint")
    public Complaint getComplaint() {
        return complaint;
    }

    @JsonProperty("complaint")
    public void setComplaint(Complaint complaint) {
        this.complaint = complaint;
    }

	@Override
	public String toString() {
		return "ComplaintResponse [complaint=" + complaint + "]";
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
		ComplaintResponse other = (ComplaintResponse) obj;
		return Objects.equals(complaint, other.complaint);
	}

	public ComplaintResponse(Complaint complaint) {
		super();
		this.complaint = complaint;
	}

	public ComplaintResponse() {
		super();
	}

}
