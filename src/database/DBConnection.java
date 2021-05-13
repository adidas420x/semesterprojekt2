package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	private Connection connection = null;
	private static DBConnection dbConnection;
	
	/* her skal der forbindes til databasen
	 * 
	 * 
	 * 
	 */
	
	private static final String driverClass = "";
	private static final String dbName = "";
	private static final String serverAddress = "";
	//private static final String serverAddress = "192.168.56.2";
	private static final int    serverPort = 1433;
	private static final String userName = "";
	private static final String password = "";
	
	
	
	private DBConnection() {
		String connectionString = String.format("jdbc:sqlserver://%s:%d;databaseName=%s;user=%s;password=%s",
				serverAddress, serverPort, dbName, userName, password);
		try {
			Class.forName(driverClass);
		}
	}
	
}
