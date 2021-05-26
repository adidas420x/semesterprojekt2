package model;

import java.time.LocalDate;
import java.util.UUID;

public class Order {

	private String orderID;
	private LocalDate startDate;
	private LocalDate endDate;
	private Event event;
	private Employee employee;
	public static long idCounter = 0;

	public Order(String orderID, LocalDate startDate, LocalDate endDate, Employee employee) {
		super();
		this.orderID = orderID;
		this.startDate = startDate;
		this.endDate = endDate;
		this.employee = employee;
	}

	public static synchronized String generateOrderID() {
		return String.valueOf(idCounter++);
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

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
