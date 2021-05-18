package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Equipment;

public class EquipmentDB implements EquipmentDBIF {

	private static final String findEquipmentByIDQ =
			" select eqName, storageLocation, eqID. description,"
			+ "manufacturer, stock. owner, type from equipments where eqID = ?";
	private static final String findEquipmentByNameQ =
			" select eqName, storageLocation, eqID. description,"
			+ "manufacturer, stock. owner, type from equipments where eqName = ?";
	
	private PreparedStatement findEquipmentByID;
	private PreparedStatement findEquipmentByName;
	
	public EquipmentDB() throws DataAccessException {
		try {
			findEquipmentByID = DBConnection.getInstance().getConnection()
					.prepareStatement(findEquipmentByIDQ);
			findEquipmentByName = DBConnection.getInstance().getConnection()
					.prepareStatement(findEquipmentByNameQ);
		} catch(SQLException e) {
			throw new DataAccessException(e, "could not prepare statements");
		}
	}
	
	@Override
	public Equipment findEquipmentByID(String eqID) throws DataAccessException {
		try {
			findEquipmentByID.setString(3, eqID);
			ResultSet rs = findEquipmentByID.executeQuery();
			Equipment e = null;
			if(rs.next()) {
				e = buildObject(rs);
			}
			return e;
		} catch(SQLException e) {
			throw new DataAccessException(e, "could not find by id");
		}
		
	}
	
	@Override
	public Equipment findEquipmentByName(String eqName) throws DataAccessException {
		try {
			findEquipmentByName.setString(1, eqName);
			ResultSet rs = findEquipmentByName.executeQuery();
			Equipment e = null;
			if(rs.next()) {
				e = buildObject(rs);
			}
			return e;
		} catch(SQLException e) {
			throw new DataAccessException(e, "could not find by name");
		}
	}
	
	private Equipment buildObject(ResultSet rs) throws SQLException {
		Equipment e = new Equipment(
			rs.getString("eqName"),
			rs.getString("storageLocation"),
			rs.getString("eqID"),
			rs.getString("description"),
			rs.getString("manufacturer"),
			rs.getInt("stock"),
			rs.getString("owner")
			);
		return e;
	}
	
	private List<Equipment> buildObjects(ResultSet rs) throws SQLException {
		List<Equipment> res = new ArrayList<>();
		while(rs.next()) {
			res.add(buildObject(rs));
		}
		return res;
	}
}