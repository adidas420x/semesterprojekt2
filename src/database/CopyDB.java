package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Copy;

public class CopyDB implements CopyDBIF {

	private static final String getAvailCopiesQ = " SELECT copies.eqID, copies.eqAvailability, copies.serialNo, orders.startDate, orders.endDate\r\n"
			+ "from Copies\r\n" + "INNER JOIN specificcopies ON copies.serialNo=specificcopies.serialNo\r\n"
			+ "INNER JOIN orders ON specificcopies.orderID=orders.orderID\r\n" + "\r\n" + "where copies.eqID = ?;";
	private PreparedStatement getAvailCopies;

	public CopyDB() throws DataAccessException {
		try {
			getAvailCopies = DBConnection.getInstance().getConnection().prepareStatement(getAvailCopiesQ);
		} catch (SQLException e) {
			throw new DataAccessException(e, "could not prepare statement");
		}
	}

	@Override
	public Copy getAvailCopies(String eqAvailability) throws DataAccessException {
		try {
			getAvailCopies.setString(2, eqAvailability);
			ResultSet rs = getAvailCopies.executeQuery();
			Copy e = null;
			if (rs.next()) {
				e = buildObject(rs);
			}
			return e;
		} catch (SQLException e) {
			throw new DataAccessException(e, "could not find available copies");
		}
	}

	public List<Copy> getAvailCopies(String eqID, LocalDate startDate, LocalDate endDate) throws DataAccessException {
		List<Copy> availCopies = new ArrayList<Copy>();
		try {
			getAvailCopies.setString(2, eqID);
			ResultSet rs = getAvailCopies.executeQuery();
			while (rs.next()) {
				//.getdate skal parses til localdate
				if(startDate.isAfter(rs.getDate("endDate").toLocalDate())){
					if(endDate.isBefore(rs.getDate("startDate").toLocalDate())) {
						Copy c = buildObject(rs);
						availCopies.add(c);
					}
				}
			}
			return availCopies;
		} catch (SQLException e) {
			throw new DataAccessException(e, "could not find available copies");
		}
	}

	private Copy buildObject(ResultSet rs) throws SQLException {
		Copy e = new Copy(rs.getString("serialNo"), rs.getString("eqAvailablity"));
		return e;
	}

	private List<Copy> buildObjects(ResultSet rs) throws SQLException {
		List<Copy> res = new ArrayList<>();
		while (rs.next()) {
			res.add(buildObject(rs));
		}
		return res;
	}
}
