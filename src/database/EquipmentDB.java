package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Copy;
import model.Equipment;

public class EquipmentDB implements EquipmentDBIF {

	private static final String findEquipmentByIDQ = " select eqName, storageLocation, eqID, description,"
			+ "manufacturer, stock, owner, type from equipments where eqID = ?";
	private static final String findEquipmentByNameQ = " select eqName, storageLocation, eqID, description,"
			+ "manufacturer, stock, owner, type from equipments where eqName like ?";
	private static final String findEquipmentQ = " select eqName, storageLocation, eqID, description,"
			+ "manufacturer, stock, owner, type from equipments where eqID = ?";

	private PreparedStatement findEquipmentByID;
	private PreparedStatement findEquipmentByName;
	private PreparedStatement findEquipment;
	private CopyDB copyDB;

	public EquipmentDB() throws DataAccessException {
		try {
			findEquipmentByID = DBConnection.getInstance().getConnection().prepareStatement(findEquipmentByIDQ);
			findEquipmentByName = DBConnection.getInstance().getConnection().prepareStatement(findEquipmentByNameQ);
		} catch (SQLException e) {
			throw new DataAccessException(e, "could not prepare statements");
		}
	}

	@Override
	public List<Equipment> findEquipment(String eqName, String eqID, LocalDate startDate, LocalDate endDate)
			throws DataAccessException {
		// hvis der bliver indtastet i navn
		if (eqID == null) {
			try {
				findEquipmentByName.setString(1, "%" + eqName + "%");
				ResultSet rs = findEquipmentByName.executeQuery();
				List<Equipment> e = null;
				e = buildObjects(rs, startDate, endDate);
				return e;
			} catch (SQLException e) {
				throw new DataAccessException(e, "could not find by equipment name");
			}
		} else {
			try {
				findEquipmentByID.setString(1, eqID);
				ResultSet rs = findEquipmentByID.executeQuery();
				List<Equipment> e = null;
					e = buildObjects(rs, startDate, endDate);
				return e;
			} catch (SQLException e) {
				throw new DataAccessException(e, "could not find by ID");
			}
		}
	}

	private Equipment buildObject(ResultSet rs, LocalDate startDate, LocalDate endDate)
			throws SQLException, DataAccessException {
		Equipment e = new Equipment(rs.getString("eqName"), rs.getString("eqID"), rs.getString("storageLocation"),
				rs.getString("description"), rs.getString("manufacturer"), rs.getInt("stock"), rs.getString("owner"));
		//List<Copy> copies = copyDB.getAvailCopies(e.getEqID(), startDate, endDate);
		return e;
	}

	private List<Equipment> buildObjects(ResultSet rs, LocalDate startDate, LocalDate endDate)
			throws SQLException, DataAccessException {
		List<Equipment> res = new ArrayList<>();
		while (rs.next()) {
			res.add(buildObject(rs, startDate, endDate));
		}
		return res;
	}
}