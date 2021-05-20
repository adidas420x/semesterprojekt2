package controller;

import java.time.LocalDate;

import database.DataAccessException;
import database.OrderDB;
import database.OrderDBIF;
import model.Customer;
import model.Employee;
import model.Equipment;
import model.Event;
import model.Order;

public class OrderController {

	private OrderController orderController;
	private EquipmentController equipmentController;
	private OrderDBIF orderDB;
	private EventController eventController;
	private Order order;
	private PersonController personController;

	
	
	public OrderController() throws DataAccessException {
		super();
		this.orderController = new OrderController();
		this.equipmentController = new EquipmentController();
		this.orderDB = new OrderDB();
		this.eventController = new EventController();
		//this.order = new Order();
	}
	
	public Event findEventByID(String eventID) throws DataAccessException {
		Event e = eventController.findEventByID(eventID);
		order.setEvent(e);
		return e ;
	}
	
	public Employee findEmployeeByID(String employeeID) throws DataAccessException {
		Employee emp = personController.findEmployeeByID(employeeID);
		order.setEmployee(emp);
		return emp;
	}
	
	public Equipment findEquipmentById(String eqID) {
		
	}
	
	public Equipment findEquipment(String nameID) {
		//skal have regex til at sortere mellem navn eller id
		if(nameID == "sksksks") {
			findequ
		} else {
			
		}
	}
	
	public Customer findCustomer(String phone) throws DataAccessException {
		Customer c = customerController.findCustomerByPhone(phone);
	    saleOrder.setCustomer(c);
		return c;

	}
	
	public Order createOrder(Event event, LocalDate startDate, LocalDate endDate, Employee employee, String eventID) {
		Event e = findEventById(eventID);
		
		Order o = new Order(event, startDate, endDate,  employee);
		return o;	
	}
}
