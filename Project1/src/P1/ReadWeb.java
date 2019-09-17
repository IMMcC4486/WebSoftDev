package P1;
// File: ReadWeb.java

// Test reading webpage directly
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.*;

public class ReadWeb {

	public static void main(String args[]) throws java.io.IOException {
		List<Drink> masterDrinkList = new ArrayList<>();
		System.out.println("Please enter drink search : ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String drinkQuery = br.readLine();

		URL q = FileURLQuery(drinkQuery);
		String ds = getQueryResult(q);
		JSONArray da = stringToJSONArray(ds);
		List<Drink> dlist = drinkArrayToList(da);

		for (Drink d : dlist) {
			addDrinkToList(d, masterDrinkList);
		}
		System.out.println("Master List size : " + masterDrinkList.size());
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
			System.out.print((char) next);
			drinkString += (char) next;
			next = Inf.read();
		}
		return drinkString;
	}

	public static JSONArray stringToJSONArray(String drinkString) {
		JSONArray drinkList = null;
		JSONObject JSONMenu = null;
		try {
			JSONMenu = new JSONObject(drinkString);
			drinkList = JSONMenu.getJSONArray("drinks");
		} catch (Exception err) {
			err.printStackTrace();
		}
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

}