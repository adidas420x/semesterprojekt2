package model;

import java.time.LocalDate;

public class Order {

	private Event event;
	private LocalDate startDate;
	private LocalDate endDate;
	private Employee employee;


	public Order(Event event,  LocalDate startDate, LocalDate endDate, Employee employee) {
		super();
		this.orderID = orderID;
		this.startDate = startDate;
		this.endDate = endDate;
		this.eventStatus = eventStatus;
		this.event = event;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
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

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getEventStatus() {
		return eventStatus;
	}

	public void setEventStatus(String eventStatus) {
		this.eventStatus = eventStatus;
	}

}
