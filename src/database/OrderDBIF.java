package database;

import model.Order;

public interface OrderDBIF {

	//indsæt funktion fra order
	
	public Order insertOrder(Order order) throws DataAccessException;
	
}
