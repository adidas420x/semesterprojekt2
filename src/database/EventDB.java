package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Event;
import model.Person;

public class EventDB implements EventDBIF {

	private static final String findEventByIDQ = "select eventID, name, cPhoneNo from events where eventID = ?";

	private PreparedStatement findEventByID;

	public EventDB() throws DataAccessException {
		try {
			findEventByID = DBConnection.getInstance().getConnection().prepareStatement(findEventByIDQ);
		} catch (SQLException e) {
			throw new DataAccessException(e, "could not preparestatement");
		}
	}

	@Override
	public Event findEventByID(String eventID) throws DataAccessException {
		try {
			findEventByID.setString(1, eventID);
			ResultSet rs = findEventByID.executeQuery();
			Event ev = null;
			if (rs.next()) {
				ev = buildObject(rs);
			}

			return ev;
		} catch (SQLException e) {
			throw new DataAccessException(e, "could not find event by id");
		}
	}

	private Event buildObject(ResultSet rs) throws SQLException {
		Event ev = new Event(rs.getString("eventID"), rs.getString("name"));
		return ev;
	}
}