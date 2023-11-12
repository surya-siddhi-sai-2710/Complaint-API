
package com.dh.complaint.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "note",
    "noteType"
})
public class Note {

    @JsonProperty("note")
    private String note;
    @JsonProperty("noteType")
    private String noteType;

    @JsonProperty("note")
    public String getNote() {
        return note;
    }

    @JsonProperty("note")
    public void setNote(String note) {
        this.note = note;
    }

    @JsonProperty("noteType")
    public String getNoteType() {
        return noteType;
    }

    @JsonProperty("noteType")
    public void setNoteType(String noteType) {
        this.noteType = noteType;
    }

	@Override
	public String toString() {
		return "Note [note=" + note + ", noteType=" + noteType + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(note, noteType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Note other = (Note) obj;
		return Objects.equals(note, other.note) && Objects.equals(noteType, other.noteType);
	}

    

}
