package model;

import java.time.LocalDate;

public class Order {

	private Event event;
	private LocalDate startDate;
	private LocalDate endDate;
	private Employee employee;

	public Order(Event event, LocalDate startDate, LocalDate endDate, Employee employee) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.event = event;
		this.employee = employee;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
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

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
