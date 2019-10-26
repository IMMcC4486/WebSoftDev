package P1;
// File: ReadWeb.java

// Test reading webpage directly
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.*;

public class ReadWeb {

/** The main executing method
	@author	
	@version	
	@since
	@param
	@return	
	@throws
	@deprecated
	*/
	public static void main(String args[]) throws java.io.IOException {
				
		List<Drink> masterDrinkList = new ArrayList<>();

		while (true) {
			System.out.println("Select 1. Search a drink    2. Drinks found    3. Exit");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String query = br.readLine();
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
			} else {
				System.out.println("Invalid input, enter 1, 2 or 3");
				continue;
			}
			} catch (NumberFormatException nfe) {
				System.out.println("Invalid input, enter 1, 2, or 3");
				continue;
			}
		}
	}
	
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

	
	public static JSONArray stringToJSONArray(String drinkString) throws JSONException {
		JSONArray drinkList = null;
		JSONObject JSONMenu = null;
		JSONMenu = new JSONObject(drinkString);
		drinkList = JSONMenu.getJSONArray("drinks");
		return drinkList;
	}

	
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

	
	public static void addDrinkToList(Drink drink, List<Drink> masterList) {
		boolean existingDrink = false;
		for (Drink d : masterList) {
			if (d.getStrDrink() == drink.getStrDrink()) {
				existingDrink = true;
			}
		}
		if (!existingDrink) {
			masterList.add(drink);
		}
	}
	
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

}