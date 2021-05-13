package database;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderDB implements OrderDBIF {

	private static final String insertOrderQ = "insert into orders eventstartdate = ?, eventenddate = ?, eventstatus = ?, employeeid = ?";

	private PreparedStatement insertOrder;
}
