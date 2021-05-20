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
		this.order = new Order();
		
	}
	
	public Event findEventByID(String eventID) throws DataAccessException {
		Event e = eventController.findEventByID(eventID);
		return e ;
	}
	
	public Order createOrder(String orderID, LocalDate startDate, LocalDate endDate, String eventStatus, Event event) {
		Order o = new Order(orderID, startDate, endDate, eventStatus, event);
		return o;	
	}
}
