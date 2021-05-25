package model;

import java.time.LocalDate;

public class Event {

	private String eventID;
	private String name;
	private Person phoneNo;
	
	public Event(String eventID, String name) {
		super();
		this.eventID = eventID;
		this.name = name;
	}

	public String getEventID() {
		return eventID;
	}

	public void setEventID(String eventID) {
		this.eventID = eventID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNo(Person phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public Person getPhoneNo() {
		return phoneNo;
	}
	
}
