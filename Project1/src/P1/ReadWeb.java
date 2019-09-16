package P1;
// File: ReadWeb.java
// Test reading webpage directly

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.*;

import P1.Drink;

public class ReadWeb {

 public static void main(String args[]) throws java.io.IOException
 {   URL TheFile=null;
     try {	// Set up a URL to the file
       TheFile=new URL(
//        "https://aa.usno.navy.mil/cgi-bin/aa_rstablew.pl?ID=AA&year=2008&task=0&state=PA&place=Kutztown"
    		   "https://thecocktaildb.com/api/json/v1/1/search.php?s=irish"
    		   );
     }
     catch (Exception e) {
       System.err.println("URL Setup failed...");
       e.printStackTrace();
     }
     InputStream s=null;
     try { // Hook up to the file on the server
       s=TheFile.openStream();
     }
     catch (Exception e)  {
       e.printStackTrace();
       System.err.println("!! Stream open failed !!");
     }
     BufferedReader Inf=null;
     try {
       Inf=new BufferedReader(new InputStreamReader(s));
     }
     catch (Exception e){
       e.printStackTrace();
     }
     int next;
     next=Inf.read();
     String menu = "";
     
     while (next>=0) {
       System.out.print((char)next);
       menu += (char)next;
       next=Inf.read();
     }
     System.out.println();
     System.out.println("Hey");
     System.out.print(menu);
     JSONArray drinkList = null;
     JSONObject JSONMenu = null;
     try {
         JSONMenu = new JSONObject(menu);
         drinkList = JSONMenu.getJSONArray("drinks");
    }catch (Exception err){
         err.printStackTrace();
    }
     
     
     
     int numDrinks = drinkList.length();
     int numDrinkAttributes = 0;
     JSONObject drinkResult = null;
     Drink aDrink;
     List<Drink> queriedDrinks = new ArrayList<>();
     for(int i = 0; i < numDrinks; i++) {
    	 try {
    		 aDrink = new Drink();
			drinkResult = drinkList.getJSONObject(i);
			aDrink.populateFields(drinkResult);
			queriedDrinks.add(aDrink);
			System.out.println(aDrink);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

     }
	 System.out.println();
	 System.out.println(queriedDrinks.size());
	 System.out.println(queriedDrinks);     
 }

} 