package Project2;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBconnection {

	private static Connection conn;
	private static final String URL = "jdbc:oracle:thin:@csdb.kutztown.edu:1521:orcl";
	private static final String USERNAME = "spiegel";
	private static final String PASSWORD = "legeips";
	public static void main(String[] args) {
		conn = getConnection();
	}

	public static Connection getConnection() {
		if (conn == null) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} 
		try {
			if (conn.isClosed()) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("MADE A CONNECTION");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}