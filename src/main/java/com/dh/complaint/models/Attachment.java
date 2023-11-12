
package com.dh.complaint.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "attachmentComments",
    "attachmentFileExtension",
    "attachmentFileName",
    "attachmentFileBuffer"
})
public class Attachment {

    @JsonProperty("attachmentComments")
    private String attachmentComments;
    @JsonProperty("attachmentFileExtension")
    private String attachmentFileExtension;
    @JsonProperty("attachmentFileName")
    private String attachmentFileName;
    @JsonProperty("attachmentFileBuffer")
    private String attachmentFileBuffer;

    @JsonProperty("attachmentComments")
    public String getAttachmentComments() {
        return attachmentComments;
    }

    @JsonProperty("attachmentComments")
    public void setAttachmentComments(String attachmentComments) {
        this.attachmentComments = attachmentComments;
    }

    @JsonProperty("attachmentFileExtension")
    public String getAttachmentFileExtension() {
        return attachmentFileExtension;
    }

    @JsonProperty("attachmentFileExtension")
    public void setAttachmentFileExtension(String attachmentFileExtension) {
        this.attachmentFileExtension = attachmentFileExtension;
    }

    @JsonProperty("attachmentFileName")
    public String getAttachmentFileName() {
        return attachmentFileName;
    }

    @JsonProperty("attachmentFileName")
    public void setAttachmentFileName(String attachmentFileName) {
        this.attachmentFileName = attachmentFileName;
    }

    @JsonProperty("attachmentFileBuffer")
    public String getAttachmentFileBuffer() {
        return attachmentFileBuffer;
    }

    @JsonProperty("attachmentFileBuffer")
    public void setAttachmentFileBuffer(String attachmentFileBuffer) {
        this.attachmentFileBuffer = attachmentFileBuffer;
    }

	@Override
	public String toString() {
		return "Attachment [attachmentComments=" + attachmentComments + ", attachmentFileExtension="
				+ attachmentFileExtension + ", attachmentFileName=" + attachmentFileName + ", attachmentFileBuffer="
				+ attachmentFileBuffer + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(attachmentComments, attachmentFileBuffer, attachmentFileExtension, attachmentFileName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Attachment other = (Attachment) obj;
		return Objects.equals(attachmentComments, other.attachmentComments)
				&& Objects.equals(attachmentFileBuffer, other.attachmentFileBuffer)
				&& Objects.equals(attachmentFileExtension, other.attachmentFileExtension)
				&& Objects.equals(attachmentFileName, other.attachmentFileName);
	}

}
