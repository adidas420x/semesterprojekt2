package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Copy;

public class CopyDB implements CopyDBIF {
	
	private static final String getAvailCopiesQ =
			" select serialNo, eqAvailability from copies where eqAvailability = available";
	
	private PreparedStatement getAvailCopies;
	
	public CopyDB() throws DataAccessException {
		try {
			getAvailCopies = DBConnection.getInstance().getConnection()
					.prepareStatement(getAvailCopiesQ);
		} catch(SQLException e) {
			throw new DataAccessException(e, "could not prepare statement");
		}
	}
	
	@Override
	public Copy getAvailCopies(String eqAvailability) throws DataAccessException {
		try {
			getAvailCopies.setString(2, eqAvailability);
			ResultSet rs = getAvailCopies.executeQuery();
			Copy e = null;
			if(rs.next()) {
				e = buildObject(rs);
			}
			return e;
		} catch(SQLExeption e) {
			throw new DataAccessException(e, "could not find available copies");
		}
	}
	
	private Copy buildObject(ResultSet rs) throws SQLException {
		Copy e = new Copy(
			rs.getString("serialNo"),
			rs.getString("eqAvailablity")
			);
		return e;
	}
	
	private List<Copy> buildObjects(ResultSet rs) throws SQLException {
		List<Copy> res = new ArrayList<>();
		while(rs.next()) {
			res.add(buildObject(rs));
		}
		return res;
	}
}
