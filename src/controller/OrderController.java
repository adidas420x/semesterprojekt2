package controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import database.DataAccessException;
import database.EventDB;
import database.OrderDB;
import database.OrderDBIF;
import model.Copy;
import model.Customer;
import model.Employee;
import model.Equipment;
import model.Event;
import model.Order;

public class OrderController {
	private EquipmentController equipmentController;
	private OrderDBIF orderDB;
	private EventController eventController;
	private Order order;
	private PersonController personController;
	private static int idCounter;

	public OrderController() throws DataAccessException {
		super();
		this.equipmentController = new EquipmentController();
		this.orderDB = new OrderDB();
		this.eventController = new EventController();
		this.personController = new PersonController();
		this.idCounter = 0;
	}

	public Event findEventByID(String eventID) throws DataAccessException {
		return eventController.findEventByID(eventID);
	}

	public String generateOrderID(String orderID) {
		String newOID = String.valueOf(idCounter++ + 1);
		return newOID;
	}

	public Order createOrder(String orderID, LocalDate startDate, LocalDate endDate, Employee employee,
			String eventID) {
		order = new Order(orderID, startDate, endDate, employee, eventID);
		return order;
	}

	public Employee findEmployeeByID(String employeeID) throws DataAccessException {
		return personController.findEmployeeByID(employeeID);
	}

	public List<Equipment> findEquipment(String eqName, String eqID, LocalDate startDate, LocalDate endDate)
			throws DataAccessException {
		List<Equipment> equipments = equipmentController.findEquipment(eqName, eqID, startDate, endDate);
		return equipments;
	}

	public void addEquipmentToOrder(String eqID, int quantity) throws DataAccessException {
		List<Copy> copies = equipmentController.getCopiesFromTemp(eqID, order.getStartDate(), order.getEndDate(),
				quantity);
		order.addEquipmentToOrder(copies);
	}

	public void saveOrder() throws DataAccessException {
		orderDB.insertOrder(order);
	}

	public Order getOrder() {
		return order;
	}

	public int getEquipmentCountByID(String eqID) {
		return order.getEquipmentCountByID(eqID);
	}
}
