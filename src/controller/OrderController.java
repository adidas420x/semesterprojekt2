package controller;

import java.time.LocalDate;

import database.DataAccessException;
import database.OrderDB;
import database.OrderDBIF;
import model.Event;
import model.Order;

public class OrderController {

	private OrderController orderController;
	private EquipmentController equipmentController;
	private OrderDBIF orderDB;
	private EventController eventController;
	private Order order;
	
	
	public OrderController() throws DataAccessException {
		super();
		this.orderController = new OrderController();
		this.equipmentController = new EquipmentController();
		this.orderDB = new OrderDB();
		this.eventController = new EventController();
		this.order = null;
		
	}
	
	public Event findEventByID(String eventID) throws DataAccessException {
		Event e = eventController.findEventByID(eventID);
		return e;
	}
	
	public Order createOrder(String eventID, LocalDate startDate, LocalDate endDate, String employeeID) {
		Event e = eventController.findEventByID(eventID);
		
		Order o = new Order(e, startDate, endDate, employeeID);
		return o;
		
	}
}
