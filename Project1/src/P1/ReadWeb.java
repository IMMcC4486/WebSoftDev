package P1;
// File: ReadWeb.java
// Test reading webpage directly

import java.io.*;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
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
     JSONArray menuArray = null;
     JSONObject JSONMenu = null;
     try {
         JSONMenu = new JSONObject(menu);
         menuArray = JSONMenu.toJSONArray((JSONArray) JSONMenu.get("drinks"));
    }catch (Exception err){
         err.printStackTrace();
    }
     JSONObject newMenu = null;
     System.out.println();
	 System.out.println(JSONMenu.names());

	 System.out.println(JSONMenu);
//    	 menuArry = new JSONArray((JSONArray)JSONMenu.get("drinks"));
//		newMenu = new JSONObject(JSONMenu.get("drinks"));
     System.out.println();
//     System.out.println(newMenu.length());
     
 }

}
