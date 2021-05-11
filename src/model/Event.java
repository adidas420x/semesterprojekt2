package model;

import java.time.LocalDate;

public class Event {

	private String id;
	private String status;
	private LocalDate startDate;
	private LocalDate endDate;
	
	public Event(String id, String status, LocalDate startDate, LocalDate endDate) {
		super();
		this.id = id;
		this.status = status;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	
}
