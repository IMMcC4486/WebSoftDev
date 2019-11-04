package Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

//create table imcco455Drinks (
//idDrink varchar2 (50) primary key not null,
//strDrink varchar2 (50),
//strDrinkES varchar2 (50),
//strCategory varchar2 (50),
//strIBA varchar2 (50),
//strAlcoholic varchar2 (20),
//strGlass varchar2 (50),
//strInstructions varchar2 (250),
//strIngredientOne varchar2 (50),
//strIngredientTwo varchar2 (50),
//strIngredientThree varchar2 (50),
//strIngredientFour varchar2 (50),
//strIngredientFive varchar2 (50),
//strMeasureOne varchar2 (50),
//strMeasureTwo varchar2 (50),
//strMeasureThree varchar2 (50),
//strMeasureFour varchar2 (50),
//strMeasureFive varchar2 (50)
//);

//create table imcco455ExactDrinks (
//idDrink varchar2 (50) primary key not null,
//strDrink varchar2 (50),
//strDrinkES varchar2 (50),
//strCategory varchar2 (50),
//strIBA varchar2 (50),
//strAlcoholic varchar2 (20),
//strGlass varchar2 (50),
//strInstructions varchar2 (250),
//strIngredientOne varchar2 (50),
//strIngredientTwo varchar2 (50),
//strIngredientThree varchar2 (50),
//strIngredientFour varchar2 (50),
//strIngredientFive varchar2 (50),
//strMeasureOne varchar2 (50),
//strMeasureTwo varchar2 (50),
//strMeasureThree varchar2 (50),
//strMeasureFour varchar2 (50),
//strMeasureFive varchar2 (50)
//);


//javac -cp "WEB-INF/lib/java-json.jar:WEB-INF/lib/ojdbc6.jar:WEB-INF/lib/servlet.jar" WEB-INF/Java/DBconnection.java WEB-INF/Java/Drink.java WEB-INF/Java/Servlet.java -d WEB-INF/classes 
//jar -cvf DRINKPROJECT.war *
//mv DRINKPROJECT.war ../../../webapps
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Servlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println(request.getRequestURI());		
		String uri = request.getRequestURI();
		if(uri.equals("/Drinks/checkExactDrink.do")) {
			// Drink name from front end
			String drinkQuery = request.getParameter("DRINKNAME");
			// Response from drink API
			URL q = FileURLQuery(drinkQuery);
			// Convert API response to a string
			String ds = getQueryResult(q);

			// Turn API string into JSON object
			// for now, let the exception act as a form of no when no results at all are returned.
			JSONArray da;
			try {
				da = stringToJSONArray(ds);
			} catch (JSONException je) {
				response.getWriter().append("Nah Dawg");
				return;
			}
			int drinkExists = drinkInList(da, drinkQuery);
			if (-1 < drinkExists) {
				Drink foundDrink = new Drink();
				JSONObject drinkResult;
				try {
					drinkResult = da.getJSONObject(drinkExists);

				foundDrink.populateFields(drinkResult);
				} catch (JSONException e) {
					response.getWriter().append("{\"ohFarts\":\"We had a JSONException in backend" + e + "\"}");
				}
				response.getWriter().append(foundDrink.toJSON());
			} else if (drinkExists == -2) {
				response.getWriter().append("{\"ohFarts\":\"That drink doesn\'t exist\"}");
			} else if (drinkExists == -3) {
				response.getWriter().append("{\"ohFarts\":\"Come on dawg, don\'t be shady.}");
			} else if (drinkExists == -4) {
				response.getWriter().append("{\"ohFarts\":\"HM. There seemed to be an issue processing your drink search.\"}");
			} else if (drinkExists == -5) {
				response.getWriter().append("{\"ohFarts\":\"How did this happen?????\"}");
			}
		}
		
		if(uri.equals("/Drinks/checkSimilarDrinks.do")) {
			response.getWriter().append("{\"ohFarts\":\"Implement later\"}");
//			DrinkDOA d = new DrinkDOA();
//			// Drink name from front end
//			String drinkQuery = request.getParameter("DRINKNAME");
//			// Response from drink API
//			URL q = FileURLQuery(drinkQuery);
//			// Convert API response to a string
//			String ds = getQueryResult(q);
//
//			// Turn API string into JSON object
//			// for now, let the exception act as a form of no when no results at all are returned.
//			JSONArray da;
//			try {
//				da = stringToJSONArray(ds);
//			} catch (JSONException je) {
//				response.getWriter().append("Nah Dawg");
//				return;
//			}
//			String drinkExists = drinkInList(da, drinkQuery);
//			response.getWriter().append(drinkExists);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	/**
	 * FileURLQuery takes in the search from the user, hits the URL endpoint with
	 * the query, returns the URL file.
	 * 
	 * @author Ian M McCormick imccor455
	 * @param query The drink query from the user
	 * @return TheFile The URL response file.
	 */
	private static URL FileURLQuery(String query) {
		URL TheFile = null;
		try { // Set up a URL to the file
			TheFile = new URL("https://thecocktaildb.com/api/json/v1/1/search.php?s=" + query);
		} catch (Exception e) {
			System.err.println("URL Setup failed...");
			e.printStackTrace();
		}
		return TheFile;
	}
	
	/**
	 * getQueryResult modified version from ReadWeb.java to return a string version
	 * of the URL response.
	 * 
	 * @author Ian M McCormick imccor455
	 * @author Dr. Spiegel
	 * @param TheFile The URL File containing the response.
	 * @return drinkString a string representation of the URL response.
	 * @throws java.io.IOException Exception for when the given URL cannot be read
	 *                             in properly
	 */
	private static String getQueryResult(URL TheFile) throws java.io.IOException {
		InputStream s = null;
		try { // Hook up to the file on the server
			s = TheFile.openStream();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("!! Stream open failed !!");
		}
		BufferedReader Inf = null;
		try {
			Inf = new BufferedReader(new InputStreamReader(s));
		} catch (Exception e) {
			e.printStackTrace();
		}
		int next;
		next = Inf.read();
		String drinkString = "";

		while (next >= 0) {
			drinkString += (char) next;
			next = Inf.read();
		}
		return drinkString;
	}
	
	/**
	 * stringToJSONArray Takes in the full string response from the URL, the string
	 * is converted to a JSONObject, the list of drinks in the object are converted
	 * to a JSONArray.
	 * 
	 * @author Ian M McCormick imccor455
	 * @param drinkString The full string response from the URL containing a main
	 *                    "drinks" key, with a value containing a list of drinks.
	 * @return drinkList A JSONArray version of the URL response containing the
	 *         drinks inside "drinks".
	 * @throws JSONException Exception for when the given string cannot be converted
	 *                       to a JSONObject or JSONArray
	 */
	private static JSONArray stringToJSONArray(String drinkString) throws JSONException {
		JSONArray drinkList = null;
		JSONObject JSONMenu = null;
		JSONMenu = new JSONObject(drinkString);
		drinkList = JSONMenu.getJSONArray("drinks");
		return drinkList;
	}
	
	/**
	 * drinkArrayToList takes in the jsonarray version of the response, parses
	 * through the object to isolate individual drinks, drinks are created into
	 * "Drink" objects, and then added to a Drink List and returned.
	 * 
	 * @author Ian M McCormick imccor455
	 * @param drinkList The jsonarray version of the response containing found
	 *                  drinks.
	 * @return queriedDrinks A list representation of the jsonarray drink list.
	 */
	private static int drinkInList(JSONArray drinkList, String DRINKNAME) {
		int numDrinks = drinkList.length();
		JSONObject drinkResult = null;
		Drink aDrink = new Drink();
		for (int i = 0; i < numDrinks; i++) {
			try {
				drinkResult = drinkList.getJSONObject(i);
				aDrink.populateFields(drinkResult);
				if (aDrink.getStrDrink().equals(DRINKNAME)) {
					String canIAdd = addExactDrinkToList(aDrink);
					if (canIAdd.equals("SUCCESS")) {
						// yes
						return i;
					} else if (canIAdd.equals("FAIL")) {
						// no
						return -2;
					} else if (canIAdd.equals("TOXIC")) {
						// sql trouble
						return -3;
					} else {
						// other
						return -4;
					}
				}
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		// should never get here
		return -5;
	}
	
	/**
	 * drinkArrayToList takes in the jsonarray version of the response, parses
	 * through the object to isolate individual drinks, drinks are created into
	 * "Drink" objects, and then added to a Drink List and returned.
	 * 
	 * @author Ian M McCormick imccor455
	 * @param drinkList The jsonarray version of the response containing found
	 *                  drinks.
	 * @return queriedDrinks A list representation of the jsonarray drink list.
	 */
	private static List<Drink> drinkArrayToList(JSONArray drinkList) {
		int numDrinks = drinkList.length();
		JSONObject drinkResult = null;
		Drink aDrink;
		List<Drink> queriedDrinks = new ArrayList<>();
		for (int i = 0; i < numDrinks; i++) {
			try {
				aDrink = new Drink();
				drinkResult = drinkList.getJSONObject(i);
				aDrink.populateFields(drinkResult);
				queriedDrinks.add(aDrink);
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		return queriedDrinks;
	}
	
	/**
	 * addExactDrinkToList takes in a drink and adds it to the database if not currently there.
	 * list.
	 * 
	 * @author Ian M McCormick imccor455
	 * @param drink      The newly queried drink to be analyzed and potentially
	 *                   added to the DB
	 */
	private static String addExactDrinkToList(Drink drink) {
		boolean addDrink = isDrinkInDB(drink);
		Connection conn = DBconnection.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		if (addDrink) {
				String sql = "insert into imcco455ExactDrinks values ("
								+ "drinkToAdd.idDrink, "
								+ "drinkToAdd.strDrink,"
								+ "drinkToAdd.strDrinkES,"
								+ "drinkToAdd.strCategory,"
								+ "drinkToAdd.strIBA,"
								+ "drinkToAdd.strAlcoholic,"
								+ "drinkToAdd.strGlass,"
								+ "drinkToAdd.strInstructions,"
								+ "drinkToAdd.strIngredient1,"
								+ "drinkToAdd.strIngredient2,"
								+ "drinkToAdd.strIngredient3,"
								+ "drinkToAdd.strIngredient4,"
								+ "drinkToAdd.strIngredient5,"
								+ "drinkToAdd.strMeasure1,"
								+ "drinkToAdd.strMeasure2,"
								+ "drinkToAdd.strMeasure3,"
								+ "drinkToAdd.strMeasure4,"
								+ "drinkToAdd.strMeasure5"
								+ ");";
				System.out.println("insert sql statement is : " + sql);
				// DOING GHETTO SANITATION AGAIN
				/// ///// Although, if it goes into here, respect
				try {
					if (sql.toLowerCase().contains("drop table") || sql.toLowerCase().contains("delete from")) {
						throw new Exception("WTF IS THIS CRAP");
					}
				} catch (Exception e) {
					System.out.println(e);
					System.out.println("I'm searching for this garbage drink name in the database.");
					return "TOXIC";
				}
				try {
					ps = conn.prepareStatement(sql);
					ps.execute();
					return "SUCCESS";
				} catch (Exception e) {
					System.out.println("Failed to add drink");
					e.printStackTrace();
					return "FAIL";
				}
			}
		// Never gonna happen
		return "COMO";
		}
	
	/**
	 * addDrinkToList takes in a drink and adds it to the database if not currently there.
	 * list.
	 * 
	 * @author Ian M McCormick imccor455
	 * @param drink      The newly queried drink to be analyzed and potentially
	 *                   added to the DB
	 */
	private static String addDrinkToList(Drink drink) {
		boolean addDrink = isDrinkInDB(drink);
		Connection conn = DBconnection.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		if (addDrink) {
				String sql = "insert into imcco455Drinks values ("
								+ "drinkToAdd.idDrink, "
								+ "drinkToAdd.strDrink,"
								+ "drinkToAdd.strDrinkES,"
								+ "drinkToAdd.strCategory,"
								+ "drinkToAdd.strIBA,"
								+ "drinkToAdd.strAlcoholic,"
								+ "drinkToAdd.strGlass,"
								+ "drinkToAdd.strInstructions,"
								+ "drinkToAdd.strIngredient1,"
								+ "drinkToAdd.strIngredient2,"
								+ "drinkToAdd.strIngredient3,"
								+ "drinkToAdd.strIngredient4,"
								+ "drinkToAdd.strIngredient5,"
								+ "drinkToAdd.strMeasure1,"
								+ "drinkToAdd.strMeasure2,"
								+ "drinkToAdd.strMeasure3,"
								+ "drinkToAdd.strMeasure4,"
								+ "drinkToAdd.strMeasure5"
								+ ");";
				System.out.println("insert sql statement is : " + sql);
				// DOING GHETTO SANITATION AGAIN
				/// ///// Although, if it goes into here, respect
				try {
					if (sql.toLowerCase().contains("drop table") || sql.toLowerCase().contains("delete from")) {
						throw new Exception("WTF IS THIS CRAP");
					}
				} catch (Exception e) {
					System.out.println(e);
					System.out.println("I'm searching for this garbage drink name in the database.");
					return "TOXIC";
				}
				try {
					ps = conn.prepareStatement(sql);
					ps.execute();
					System.out.println("Added drink");
				} catch (Exception e) {
					System.out.println("Failed to add drink");
					e.printStackTrace();
					return "FAIL";
				}
			}
		// Never gonna happen
		return "COMO";
		}
	
	/**
	 * isDrinkInDB takes in a drink and checks if it's in the DB
	 * list.
	 * 
	 * @author Ian M McCormick imccor455
	 * @param drink      The drink to check if exists in DB
	 */
	private static boolean isDrinkInDB(Drink drink) {
		Connection conn = DBconnection.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from imcco455Drinks where strDrink = " + drink.getStrDrink();
		System.out.println("Drink search sql statement is : " + sql);
		// GHETTO SANITATION
		try {
			if (sql.toLowerCase().contains("drop table") || sql.toLowerCase().contains("delete from")) {
				throw new Exception("WTF IS THIS CRAP");
			}
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("I'm searching for this garbage drink name in the database.");
			return false;
		}
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}

}