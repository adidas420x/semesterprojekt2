package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {

	private String orderID;
	private LocalDate startDate;
	private LocalDate endDate;
	private String eventID;
	private Employee employee;
	private List<Copy> copies;

	public Order(String orderID, LocalDate startDate, LocalDate endDate, Employee employee, String eventID) {
		super();
		this.orderID = orderID;
		this.startDate = startDate;
		this.endDate = endDate;
		this.employee = employee;
		this.eventID = eventID;
		this.copies = new ArrayList<>();
	}
	
	
	public int getEquipmentCountByID(String eqID) {
		return (int) copies.parallelStream().filter(Copy-> Copy.getEqID().equals(eqID)).count();
	}
	
	public void addEquipmentToOrder(List<Copy> copies){
		this.copies.addAll(copies);
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

	public String getEventID() {
		return eventID;
	}


	public void setEventID(String eventID) {
		this.eventID = eventID;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
