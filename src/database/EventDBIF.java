package database;

import model.Event;

public interface EventDBIF {

	Event findEventByID(String eventID) throws DataAccessException;

}
