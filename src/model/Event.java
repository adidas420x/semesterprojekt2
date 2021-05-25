package model;

import java.time.LocalDate;

public class Event {

	private String eventID;
	private String name;
	private Customer customer;
	
	public Event(String eventID, String name) {
		super();
		this.eventID = eventID;
		this.name = name;
	}

	public void addCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return customer;
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
	
}
