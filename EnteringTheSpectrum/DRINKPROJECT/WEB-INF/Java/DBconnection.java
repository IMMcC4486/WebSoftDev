package Java;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBconnection {
//  sqlplus imcco455/ruau83AT@//csdb.kutztown.edu/orcl
// create table imcco455Drinks (idDrink varchar2 (20) Primary Key);
//	insert into 
	private static Connection conn;
	private static PreparedStatement ps = null;
	private static boolean psResult;
	private static ResultSet rs = null;
	private static final String URL = "jdbc:oracle:thin:@csdb.kutztown.edu:1521:orcl";
	private static final String USERNAME = "imcco455";
	private static final String PASSWORD = "ruau83AT";
	private static boolean clearDB = true;
	private static boolean prepDB = true;
	private static boolean prepProceure = true;

	public static void main(String[] args) {
		conn = getConnection();
	}

	// Either Acad or myself is having some pretty serious autistic issues.
	// Therefore, just going to to leave the tables open
	public static Connection getConnection() {

		// Focus solely on queries and inserts. Ridiculous.
		doConnection();
//		clearDB();
//		prepDB();
//		prepProcedure();
		return conn;
	}



	// Garbage method. Apparently Acad doesn't allow this.
	private static void prepProcedure() {
		if (prepProceure) {
			System.out.println("Setting up initial DB table.");
			try {
				String sql = "" + "create or replace PROCEDURE imcco455NewDrink(" + "idDrink varchar2"
//						+ "idDrink varchar2, "
//						+ "strDrink varchar2,"
//						+ "strDrinkES varchar2,"
//						+ "strCategory varchar2,"
//						+ "strIBA varchar2,"
//						+ "strAlcoholic varchar2,"
//						+ "strGlass varchar2,"
//						+ "strInstructions varchar2,"
//						+ "strIngredientOne varchar2,"
//						+ "strIngredientTwo varchar2,"
//						+ "strIngredientThree varchar2,"
//						+ "strIngredientFour varchar2,"
//						+ "strIngredientFive varchar2,"
//						+ "strMeasureOne varchar2,"
//						+ "strMeasureTwo varchar2,"
//						+ "strMeasureThree varchar2,"
//						+ "strMeasureFour varchar2,"
//						+ "strMeasureFive varchar2"
						+ ") " + "is" + " begin" + " insert into imcco455Drinks values (" + "idDrink"
//						+ "idDrink, "
//						+ "strDrink,"
//						+ "strDrinkES,"
//						+ "strCategory,"
//						+ "strIBA,"
//						+ "strAlcoholic,"
//						+ "strGlass,"
//						+ "strInstructions,"
//						+ "strIngredientOne,"
//						+ "strIngredientTwo,"
//						+ "strIngredientThree,"
//						+ "strIngredientFour,"
//						+ "strIngredientFive,"
//						+ "strMeasureOne,"
//						+ "strMeasureTwo,"
//						+ "strMeasureThree,"
//						+ "strMeasureFour, "
//						+ "strMeasureFive"
						+ ");" + "end;";
				System.out.println("prepProcedure sql query is : " + sql);
//				ps = conn.prepareStatement(sql);
//				psResult = ps.execute();
//				System.out.println("psResult Status for procedure prep: ");
//				System.out.println(psResult);
			} catch (Exception e) {
				System.out.println("Failed to Prepare Procedure to add Drinks on startup");
				e.printStackTrace();
			}
			prepProceure = false;
			System.out.println("DB Prepare Procedure complete.");
		}
	}

	// Garbage method. Apparently Acad doesn't allow this.
	private static void prepDB() {
		if (prepDB) {
			System.out.println("Setting up initial DB table.");
			try {
				System.out.println("is connection closed?");
				System.out.println(conn.isClosed());
				System.out.println(conn.isReadOnly());
				String sql = "create table imcco455Drinks (" + "idDrink varchar2 (20) NOT NULL"
						+ "CONSTRAINT PK_DRINKS PRIMARY KEY (idDrink)" +
//						"idDrink varchar2 (50) primary key," + 
//						"strDrink varchar2 (50)," + 
//						"strDrinkES varchar2 (50)," + 
//						"strCategory varchar2 (50)," + 
//						"strIBA varchar2 (50)," + 
//						"strAlcoholic varchar2 (20)," + 
//						"strGlass varchar2 (50)," + 
//						"strInstructions varchar2 (250)," + 
//						"strIngredientOne varchar2 (50)," + 
//						"strIngredientTwo varchar2 (50)," + 
//						"strIngredientThree varchar2 (50)," + 
//						"strIngredientFour varchar2 (50)," + 
//						"strIngredientFive varchar2 (50)," + 
//						"strMeasureOne varchar2 (50)," + 
//						"strMeasureTwo varchar2 (50)," + 
//						"strMeasureThree varchar2 (50)," + 
//						"strMeasureFour varchar2 (50)," + 
//						"strMeasureFive varchar2 (50)" + 
						");";
				System.out.println("prepDB sql query is : " + sql);
				ps = conn.prepareStatement(sql);
				psResult = ps.execute();
				System.out.println("psResult Status for preping DB: ");
				System.out.println(psResult);
			} catch (Exception e) {
				System.out.println("Failed to Create Table on startup");
				e.printStackTrace();
			}
			prepDB = false;
			System.out.println("DB Create Table complete.");
		}
	}

	// Garbage method. Apparently Acad doesn't allow this.
	private static void clearDB() {
		if (clearDB) {
			System.out.println("Clearing pre-existing DB table");
			try {
				String sql = "Drop table imcco455Drinks";
				System.out.println("clearDB sql query is : " + sql);
				ps = conn.prepareStatement(sql);
				psResult = ps.execute();
				System.out.println("psResult Status for clearing DB: ");
				System.out.println(psResult);
			} catch (Exception e) {
				System.out.println("Didn't need to clear table");
			}
			clearDB = false;
			System.out.println("DB clearing pre-existing DB table complete.");
		}
	}

	private static void doConnection() {
		if (conn == null) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Established connection to DB");
		}
		try {
			if (conn.isClosed()) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("DB Connection was closed. Made a new DB connection");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}