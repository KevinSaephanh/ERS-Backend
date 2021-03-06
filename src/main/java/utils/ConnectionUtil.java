package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	private static final String url = "jdbc:postgresql://localhost:5432/postgres";
	private static final String user = System.getenv("ERS_ROLE");
	private static final String password = System.getenv("ERS_PASS");

	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Unable to connect to database");
			return null;
		}
	}
}
