
package com.dh.complaint.models;

import java.util.Objects;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sRNumber",
    "status",
    "statusMessage"
})
public class Complaint {

    @JsonProperty("sRNumber")
    private String sRNumber;
    @JsonProperty("status")
    private String status;
    @JsonProperty("statusMessage")
    private String statusMessage;

    @JsonProperty("sRNumber")
    public String getSRNumber() {
        return sRNumber;
    }

    @JsonProperty("sRNumber")
    public void setSRNumber(String sRNumber) {
        this.sRNumber = sRNumber;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("statusMessage")
    public String getStatusMessage() {
        return statusMessage;
    }

    @JsonProperty("statusMessage")
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

	@Override
	public String toString() {
		return "Complaint [sRNumber=" + sRNumber + ", status=" + status + ", statusMessage=" + statusMessage + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(sRNumber, status, statusMessage);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complaint other = (Complaint) obj;
		return Objects.equals(sRNumber, other.sRNumber) && Objects.equals(status, other.status)
				&& Objects.equals(statusMessage, other.statusMessage);
	}

	public Complaint(String sRNumber, String status, String statusMessage) {
		super();
		this.sRNumber = sRNumber;
		this.status = status;
		this.statusMessage = statusMessage;
	}

	public Complaint() {
		super();
	}

	
}
