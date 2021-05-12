package model;

import java.time.LocalDate;

public class Order {

	private LocalDate eventStartDate;
	private LocalDate eventEndDate;
	private String eventStatus;
	private String employeeID;
	
	public Order(LocalDate eventStartDate, LocalDate eventEndDate, String eventStatus, String employeeID) {
		super();
		this.eventStartDate = eventStartDate;
		this.eventEndDate = eventEndDate;
		this.eventStatus = eventStatus;
		this.employeeID = employeeID;
	}

	public LocalDate getEventStartDate() {
		return eventStartDate;
	}

	public void setEventStartDate(LocalDate eventStartDate) {
		this.eventStartDate = eventStartDate;
	}

	public LocalDate getEventEndDate() {
		return eventEndDate;
	}

	public void setEventEndDate(LocalDate eventEndDate) {
		this.eventEndDate = eventEndDate;
	}

	public String getEventStatus() {
		return eventStatus;
	}

	public void setEventStatus(String eventStatus) {
		this.eventStatus = eventStatus;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	
	
	
}
