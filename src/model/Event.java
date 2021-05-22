package model;

import java.time.LocalDate;

public class Event {

	private String eventID;
	private String name;
	private Customer customer;
	
	public Event(String eventID, String name, Customer customer) {
		super();
		this.eventID = eventID;
		this.name = name;
		this.customer = customer;
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

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
