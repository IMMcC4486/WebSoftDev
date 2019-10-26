package Project2;

// Built in imports
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

// Created Helper Class Import
//import .Drink;

// The below import must be added to build path!!!!!
import org.json.*;

/**
 * The main Info class
 * 
 * @author Ian M McCormick imccor455
 */
public class Info {

	/**
	 * The main executing method
	 * 
	 * @author Ian M McCormick imccor455
	 * @param args The mandatory entry point args
	 * @throws java.io.IOException Exception for when the given URL cannot be read
	 *                             in properly
	 */
	public static void main(String args[]) throws java.io.IOException {

		List<Drink> masterDrinkList = new ArrayList<>();

		while (true) {
			System.out.println("Select 1. Search a drink    2. Drinks searched    3. Exit");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String query = br.readLine();
			try {
				if (query.equals("shootmeinthefaceihatethisclass")) {
					System.out.println();
					System.out.println("Total drinks found : " + masterDrinkList.size());
					System.out.println();
					continue;
				} else if (query.equals("getallthebullshit")) {
					try {
						collegeIsAFuckingJoke(masterDrinkList);
						continue;
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			} catch (Exception e) {
				continue;
			}
			try {
				if (Integer.parseInt(query) == 1) {
					System.out.println("1");
					drinkSearch(masterDrinkList);
				} else if (Integer.parseInt(query) == 2) {
					System.out.println("2");
					printMasterList(masterDrinkList);
				} else if (Integer.parseInt(query) == 3) {
					System.out.println();
					System.out.println("Total drinks found : " + masterDrinkList.size());
					System.out.println();
					System.out.println("Exiting");
					break;
				} else if (query == "shootmeinthefaceihatethisclass") {
					System.out.println();
					System.out.println("Total drinks found : " + masterDrinkList.size());
					System.out.println();
					break;
				} else if (query == "getallthebullshit") {
					try {
						collegeIsAFuckingJoke(masterDrinkList);
						break;
					} catch (Exception e) {
						e.printStackTrace();
					}

				} else {
					System.out.println("Invalid input");
					continue;
				}
			} catch (NumberFormatException nfe) {
				System.out.println("Invalid input");
				continue;
			}
		}
	}

	/**
	 * drinkSearch requests a search criteria from the user, hits the url with query
	 * (with helper method FileURLQuery), converts the response into drink objects
	 * (with helper method), and adds unique drinks to the master drink list.
	 * 
	 * @author Ian M McCormick imccor455
	 * @param masterDrinkList The main table/list object holding all queried drinks.
	 * @throws java.io.IOException Exception for when the given URL cannot be read
	 *                             in properly
	 */
	public static void drinkSearch(List<Drink> masterDrinkList) throws IOException {

		System.out.println("Please enter part of a drink name : ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String drinkQuery = br.readLine();

		URL q = FileURLQuery(drinkQuery);
		String ds = getQueryResult(q);
		System.out.println("Result");
		System.out.println(ds);
		JSONArray da;
		try {
			da = stringToJSONArray(ds);
		} catch (JSONException je) {
			System.out.println("*****************");
			System.out.println("No drinks found");
			System.out.println("*****************");
			return;
		}
		System.out.println(da.toString());
		List<Drink> dlist = drinkArrayToList(da);
		System.out.println("*****************");
		for (Drink d : dlist) {
			System.out.println(d.getName());
			addDrinkToList(d, masterDrinkList);
		}
		System.out.println("*****************");
		System.out.println();

	}

	/**
	 * FileURLQuery takes in the search from the user, hits the URL endpoint with
	 * the query, returns the URL file.
	 * 
	 * @author Ian M McCormick imccor455
	 * @param query The drink query from the user
	 * @return TheFile The URL response file.
	 */
	public static URL FileURLQuery(String query) {
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
	public static String getQueryResult(URL TheFile) throws java.io.IOException {
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
	public static JSONArray stringToJSONArray(String drinkString) throws JSONException {
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
	public static List<Drink> drinkArrayToList(JSONArray drinkList) {
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
	 * addDrinkToList takes in a drink and the master drink list, verifies if the
	 * current drink exists in the master list, if not, it adds the drink to the
	 * list.
	 * 
	 * @author Ian M McCormick imccor455
	 * @param drink      The newly queried drink to be analyzed and potentially
	 *                   added to the master list
	 * @param masterList The main table/list containing all queried drinks.
	 */
	public static void addDrinkToList(Drink drink, List<Drink> masterList) {
		boolean existingDrink = false;
		for (Drink d : masterList) {
			String D = d.getStrDrink();
			String DRINK = drink.getStrDrink();
			if (d.getStrDrink().equals(drink.getStrDrink())) {
				existingDrink = true;
			}
		}
		if (!existingDrink) {
			masterList.add(drink);
		}
	}

	/**
	 * printMasterList prints out all the drinks' name in the master list. will
	 * print that not drinks were found if none were found yet.
	 * 
	 * @author Ian M McCormick imccor455
	 * @param masterList The main table/list containing all found queried drinks at
	 *                   the point of execution.
	 */
	public static void printMasterList(List<Drink> masterList) {
		System.out.println("*****************");
		for (Drink d : masterList) {
			System.out.println(d.getName());
		}
		if (masterList.size() == 0) {
			System.out.println("No drinks found yet");
		}
		System.out.println("*****************");
		System.out.println();
	}

	public static void collegeIsAFuckingJoke(List<Drink> masterDrinkList) throws IOException, JSONException {
		JSONArray da;
		URL q;
		String ds = null;
		List<Drink> dlist;
		char[] alphabet = {'1','2','3','4','5','6','7','8','9','0','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		for (char letter : alphabet) {
			q = FileURLQuery(String.valueOf(letter));
			ds = getQueryResult(q);
			da = stringToJSONArray(ds);
			dlist = drinkArrayToList(da);
			for (Drink d : dlist) {
				System.out.println(d.getName());
				addDrinkToList(d, masterDrinkList);
			}
		}

	}

}
