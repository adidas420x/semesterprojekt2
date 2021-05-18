package model;

import java.time.LocalDate;

public class Order {

	private String orderID;
	private LocalDate eventStartDate;
	private LocalDate eventEndDate;
	private String eventStatus;
	private Event event;

	public Order(String orderID, LocalDate eventStartDate, LocalDate eventEndDate, String eventStatus, Event event) {
		super();
		this.orderID = orderID;
		this.eventStartDate = eventStartDate;
		this.eventEndDate = eventEndDate;
		this.eventStatus = eventStatus;
		this.event = event;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
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

}
