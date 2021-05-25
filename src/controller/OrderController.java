
package controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import database.DataAccessException;
import database.OrderDB;
import database.OrderDBIF;
import model.Customer;
import model.Employee;
import model.Equipment;
import model.Event;
import model.Order;

public class OrderController {

//	private OrderController orderController;
	private EquipmentController equipmentController;
	private OrderDBIF orderDB;
	private EventController eventController;
	private Order order;
	private PersonController personController;
	private Equipment equipment;

	public OrderController() throws DataAccessException {
		super();
//		this.orderController = new OrderController();
		this.equipmentController = new EquipmentController();
		this.orderDB = new OrderDB();
		this.eventController = new EventController();
		// this.order = new Order();
	}

	public Event findEventByID(String eventID) throws DataAccessException {
		Event e = eventController.findEventByID(eventID);
		order.setEvent(e);
		return e;
	}

	public Order createOrder(String orderID, LocalDate startDate, LocalDate endDate, Event event,
			Employee employee) {
		Order o = new Order(orderID, endDate, endDate, event, employee);
		return o;
	}
	
	public Employee findEmployeeByID(String employeeID) throws DataAccessException {
		Employee emp = personController.findEmployeeByID(employeeID);
		order.setEmployee(emp);
		return emp;
	}

	public List<Equipment> findEquipment(String eqName, String eqID, LocalDate startDate, LocalDate endDate)
			throws DataAccessException {
		List<Equipment> equipments = equipmentController.findEquipment(eqName, eqID, startDate, endDate);

		return equipments;
	}


}
