package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Equipment;

public class EquipmentDB implements EquipmentDBIF {

	private static final String findEquipmentByIDQ = " select eqName, storageLocation, eqID, description,"
			+ "manufacturer, stock, owner, type from equipments where eqID = ?";
	private static final String findEquipmentByNameQ = " select eqName, storageLocation, eqID, description,"
			+ "manufacturer, stock, owner, type from equipments where eqName = ?";
	private static final String findEquipmentQ = " select eqName, storageLocation, eqID, description,"
			+ "manufacturer, stock, owner, type from equipments where eqID = ?";

	private PreparedStatement findEquipmentByID;
	private PreparedStatement findEquipmentByName;
	private PreparedStatement findEquipment;

	public EquipmentDB() throws DataAccessException {
		try {
			findEquipmentByID = DBConnection.getInstance().getConnection().prepareStatement(findEquipmentByIDQ);
			findEquipmentByName = DBConnection.getInstance().getConnection().prepareStatement(findEquipmentByNameQ);
		} catch (SQLException e) {
			throw new DataAccessException(e, "could not prepare statements");
		}
	}

	@Override
	public List<Equipment> findEquipment(String eqName, String eqID, LocalDate startDate, LocalDate endDate) throws DataAccessException {
		//hvis der bliver indtastet i navn
		if (eqID == null) {
			try {
				findEquipmentByName.setString(1, eqName);
				ResultSet rs = findEquipmentByName.executeQuery();
				List<Equipment> e = null;
				if (rs.next()) {
					e = buildObjects(rs);
			}
			return e;
			} catch (SQLException e) {
				throw new DataAccessException(e, "could not find by equipment name");
			}
		}else {
			try {
				findEquipmentByID.setString(1, eqID);
				ResultSet rs = findEquipmentByID.executeQuery();
				List<Equipment> e = null;
				if (rs.next()) {
				e = buildObjects(rs);
			}
			return e;
			} catch (SQLException e) {
				throw new DataAccessException(e, "could not find by ID");
			}
		}
	}

	private Equipment buildObject(ResultSet rs) throws SQLException {
		Equipment e = new Equipment(rs.getString("eqName"), rs.getString("storageLocation"), rs.getString("eqID"),
				rs.getString("description"), rs.getString("manufacturer"), rs.getInt("stock"), rs.getString("owner"));
		return e;
	}

	private List<Equipment> buildObjects(ResultSet rs) throws SQLException {
		List<Equipment> res = new ArrayList<>();
		while (rs.next()) {
			res.add(buildObject(rs));
		}
		return res;
	}
}