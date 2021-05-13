package controller;

import database.DataAccessException;
import database.EventDB;
import database.EventDBIF;
import model.Event;

public class EventController {

	private EventDBIF eventDB;
	
	public EventController() throws DataAccessException {
		super();
		this.eventDB = new EventDB();
	}

	public Event SearchEvent(String eventID) {
		return eventDB.findEventbyID(eventID);
	}
}
