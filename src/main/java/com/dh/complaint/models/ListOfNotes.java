
package com.dh.complaint.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "notes"
})
public class ListOfNotes {

    @JsonProperty("notes")
    private List<Note> notes = new ArrayList<Note>();

    @JsonProperty("notes")
    public List<Note> getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

	@Override
	public String toString() {
		return "ListOfNotes [notes=" + notes + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(notes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListOfNotes other = (ListOfNotes) obj;
		return Objects.equals(notes, other.notes);
	}

   

}
