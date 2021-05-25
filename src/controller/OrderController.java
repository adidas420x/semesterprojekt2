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
	private EquipmentController equipmentController;
	private OrderDB orderDB;
	private EventController eventController;
	private Order order;
	private PersonController personController;

	public OrderController() throws DataAccessException {
		super();
		this.equipmentController = new EquipmentController();
		this.orderDB = new OrderDB();
		this.eventController = new EventController();
	}

	public Event findEventByID(String eventID) throws DataAccessException {
		Event e = eventController.findEventByID(eventID);
		order.setEvent(e);
		return e;
	}

	public Order createOrder(String orderID, LocalDate startDate, LocalDate endDate, Event event, Employee employee) {
		Order o = new Order(orderID, startDate, endDate, event, employee);
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

	public void addEquipmentToOrder(String eqID, int quantity) throws DataAccessException {
		equipmentController.getCopiesFromTemp(eqID, order.getStartDate(), order.getEndDate(), quantity);
	}

	public void saveOrder(Order order) throws DataAccessException {
		orderDB.insertOrder(order);
	}

}
