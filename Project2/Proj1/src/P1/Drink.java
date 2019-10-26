package P1;
import org.json.JSONException;
import org.json.JSONObject;


/** Drink Class
 * @author imccor410
 */
public class Drink {

	/** Constructor for Drink Class
	 * 
	 */
	public Drink() {
		super();
	}
	private String name;
	private String idDrink;
	private String strDrink;
	private String strDrinkAlternate;
	private String strDrinkES;
	private String strDrinkDE;
	private String strDrinkFR;
	private String strDrinkZH_HANS;
	private String strDrinkZH_HANT;
	private String strTags;
	private String strVideo;
	private String strCategory;
	private String strIBA;
	private String strAlcoholic;
	private String strGlass;
	private String strInstructions;
	private String strInstructionsES;
	private String strInstructionsDE;
	private String strInstructionsFR;
	private String strInstructionsZH_HANS;
	private String strInstructionsZH_HANT;
	private String strDrinkThumb;
	private String strIngredient1;
	private String strIngredient2;
	private String strIngredient3;
	private String strIngredient4;
	private String strIngredient5;
	private String strIngredient6;
	private String strIngredient7;
	private String strIngredient8;
	private String strIngredient9;
	private String strIngredient10;
	private String strIngredient11;
	private String strIngredient12;
	private String strIngredient13;
	private String strIngredient14;
	private String strIngredient15;
	private String strMeasure1;
	private String strMeasure2;
	private String strMeasure3;
	private String strMeasure4;
	private String strMeasure5;
	private String strMeasure6;
	private String strMeasure7;
	private String strMeasure8;
	private String strMeasure9;
	private String strMeasure10;
	private String strMeasure11;
	private String strMeasure12;
	private String strMeasure13;
	private String strMeasure14;
	private String strMeasure15;
	private String strCreativeCommonsConfirmed;
	private String dateModified;

	/** Takes in a drink object and populates all fields using the class setter methods
	 * @param drinks The JSONObject version of the drink to be parsed.
	 * @throws JSONException  Exception for when the given string cannot be converted to a JSONObject or JSONArray
	 */
	public void populateFields(JSONObject drinks) throws JSONException {
		try {
			
			setIdDrink((String) drinks.get("idDrink"));
		} catch (ClassCastException e) {
			setIdDrink(null);
		}
		try {
			setStrDrink((String) drinks.get("strDrink"));
			setName((String) drinks.get("strDrink"));
		} catch (ClassCastException e) {
			setName(null);
			setStrDrink(null);
		}
		try {
			setStrDrinkAlternate((String) drinks.get("strDrinkAlternate"));
		} catch (ClassCastException e) {
			setStrDrinkAlternate(null);
		}
		try {
			setStrDrinkES((String) drinks.get("strDrinkES"));
		} catch (ClassCastException e1) {
			setStrDrinkES(null);
		}
		try {
			setStrDrinkDE((String) drinks.get("strDrinkDE"));
		} catch (ClassCastException e) {
			setStrDrinkDE(null);
		}
		try {
			setStrDrinkFR((String) drinks.get("strDrinkFR"));
		} catch (ClassCastException e) {
			setStrDrinkFR(null);
		}
		try {
			setStrDrinkZH_HANS((String) drinks.get("strDrinkZH-HANS"));
		} catch (ClassCastException e) {
			setStrDrinkZH_HANS(null);
		}
		try {
			setStrDrinkZH_HANT((String) drinks.get("strDrinkZH-HANT"));
		} catch (ClassCastException e) {
			setStrDrinkZH_HANT(null);
		}
		try {
			setStrTags((String) drinks.get("strTags"));
		} catch (ClassCastException e) {
			setStrTags(null);
		}
		try {
			setStrVideo((String) drinks.get("strVideo"));
		} catch (ClassCastException e) {
			setStrVideo(null);
		}
		try {
			setStrCategory((String) drinks.get("strCategory"));
		} catch (ClassCastException e) {
			setStrCategory(null);
		}
		try {
			setStrIBA((String) drinks.get("strIBA"));
		} catch (ClassCastException e) {
			setStrIBA(null);
		}
		try {
			setStrAlcoholic((String) drinks.get("strAlcoholic"));
		} catch (ClassCastException e) {
			setStrAlcoholic(null);
		}
		try {
			setStrGlass((String) drinks.get("strGlass"));
		} catch (ClassCastException e) {
			setStrGlass(null);
		}
		try {
			setStrInstructions((String) drinks.get("strInstructions"));
		} catch (ClassCastException e) {
			setStrInstructions(null);
		}
		try {
			setStrInstructionsES((String) drinks.get("strInstructionsES"));
		} catch (ClassCastException e) {
			setStrInstructionsES(null);
		}
		try {
			setStrInstructionsDE((String) drinks.get("strInstructionsDE"));
		} catch (ClassCastException e) {
			setStrInstructionsDE(null);
		}
		try {
			setStrInstructionsFR((String) drinks.get("strInstructionsFR"));
		} catch (ClassCastException e) {
			setStrInstructionsFR(null);
		}
		try {
			setStrInstructionsZH_HANS((String) drinks.get("strInstructionsZH-HANS"));
		} catch (ClassCastException e) {
			setStrInstructionsZH_HANS(null);
		}
		try {
			setStrInstructionsZH_HANT((String) drinks.get("strInstructionsZH-HANT"));
		} catch (ClassCastException e) {
			setStrInstructionsZH_HANT(null);
		}
		try {
			setStrDrinkThumb((String) drinks.get("strDrinkThumb"));
		} catch (ClassCastException e) {
			setStrDrinkThumb(null);
		}
		try {
			setStrIngredient1((String) drinks.get("strIngredient1"));
		} catch (ClassCastException e) {
			setStrIngredient1(null);
		}
		try {
			setStrIngredient2((String) drinks.get("strIngredient2"));
		} catch (ClassCastException e) {
			setStrIngredient2(null);
		}
		try {
			setStrIngredient3((String) drinks.get("strIngredient3"));
		} catch (ClassCastException e) {
			setStrIngredient3(null);
		}
		try {
			setStrIngredient4((String) drinks.get("strIngredient4"));
		} catch (ClassCastException e) {
			setStrIngredient4(null);
		}
		try {
			setStrIngredient5((String) drinks.get("strIngredient5"));
		} catch (ClassCastException e) {
			setStrIngredient5(null);
		}
		try {
			setStrIngredient6((String) drinks.get("strIngredient6"));
		} catch (ClassCastException e) {
			setStrIngredient6(null);
		}
		try {
			setStrIngredient7((String) drinks.get("strIngredient7"));
		} catch (ClassCastException e) {
			setStrIngredient7(null);
		}
		try {
			setStrIngredient8((String) drinks.get("strIngredient8"));
		} catch (ClassCastException e) {
			setStrIngredient8(null);
		}
		try {
			setStrIngredient9((String) drinks.get("strIngredient9"));
		} catch (ClassCastException e) {
			setStrIngredient9(null);
		}
		try {
			setStrIngredient10((String) drinks.get("strIngredient10"));
		} catch (ClassCastException e) {
			setStrIngredient10(null);
		}
		try {
			setStrIngredient11((String) drinks.get("strIngredient11"));
		} catch (ClassCastException e) {
			setStrIngredient11(null);
		}
		try {
			setStrIngredient12((String) drinks.get("strIngredient12"));
		} catch (ClassCastException e) {
			setStrIngredient12(null);
		}
		try {
			setStrIngredient13((String) drinks.get("strIngredient13"));
		} catch (ClassCastException e) {
			setStrIngredient13(null);
		}
		try {
			setStrIngredient14((String) drinks.get("strIngredient14"));
		} catch (ClassCastException e) {
			setStrIngredient14(null);
		}
		try {
			setStrIngredient15((String) drinks.get("strIngredient15"));
		} catch (ClassCastException e) {
			setStrIngredient15(null);
		}
		try {
			setStrMeasure1((String) drinks.get("strMeasure1"));
		} catch (ClassCastException e) {
			setStrMeasure1(null);
		}
		try {
			setStrMeasure2((String) drinks.get("strMeasure2"));
		} catch (ClassCastException e) {
			setStrMeasure2(null);
		}
		try {
			setStrMeasure3((String) drinks.get("strMeasure3"));
		} catch (ClassCastException e) {
			setStrMeasure3(null);
		}
		try {
			setStrMeasure4((String) drinks.get("strMeasure4"));
		} catch (ClassCastException e) {
			setStrMeasure4(null);
		}
		try {
			setStrMeasure5((String) drinks.get("strMeasure5"));
		} catch (ClassCastException e) {
			setStrMeasure5(null);
		}
		try {
			setStrMeasure6((String) drinks.get("strMeasure6"));
		} catch (ClassCastException e) {
			setStrMeasure6(null);
		}
		try {
			setStrMeasure7((String) drinks.get("strMeasure7"));
		} catch (ClassCastException e) {
			setStrMeasure7(null);
		}
		try {
			setStrMeasure8((String) drinks.get("strMeasure8"));
		} catch (ClassCastException e) {
			setStrMeasure8(null);
		}
		try {
			setStrMeasure9((String) drinks.get("strMeasure9"));
		} catch (ClassCastException e) {
			setStrMeasure9(null);
		}
		try {
			setStrMeasure10((String) drinks.get("strMeasure10"));
		} catch (ClassCastException e) {
			setStrMeasure10(null);
		}
		try {
			setStrMeasure11((String) drinks.get("strMeasure11"));
		} catch (ClassCastException e) {
			setStrMeasure11(null);
		}
		try {
			setStrMeasure12((String) drinks.get("strMeasure12"));
		} catch (ClassCastException e) {
			setStrMeasure12(null);
		}
		try {
			setStrMeasure13((String) drinks.get("strMeasure13"));
		} catch (ClassCastException e) {
			setStrMeasure13(null);
		}
		try {
			setStrMeasure14((String) drinks.get("strMeasure14"));
		} catch (ClassCastException e) {
			setStrMeasure14(null);
		}
		try {
			setStrMeasure15((String) drinks.get("strMeasure15"));
		} catch (ClassCastException e) {
			setStrMeasure15(null);
		}
		try {
			setStrCreativeCommonsConfirmed((String) drinks.get("strCreativeCommonsConfirmed"));
		} catch (ClassCastException e) {
			setStrCreativeCommonsConfirmed(null);
		}
		try {
			setDateModified((String) drinks.get("dateModified"));
		} catch (ClassCastException e) {
			setDateModified(null);
		}

	}



	/** The overridden toString method
	 * @return The string of all attributes of the Drink object.
	 */
	@Override
	public String toString() {
		return "Drink [name=" + name + ", idDrink=" + idDrink + ", strDrink=" + strDrink + ", strDrinkAlternate="
				+ strDrinkAlternate + ", strDrinkES=" + strDrinkES + ", strDrinkDE=" + strDrinkDE + ", strDrinkFR="
				+ strDrinkFR + ", strDrinkZH_HANS=" + strDrinkZH_HANS + ", strDrinkZH_HANT=" + strDrinkZH_HANT
				+ ", strTags=" + strTags + ", strVideo=" + strVideo + ", strCategory=" + strCategory + ", strIBA="
				+ strIBA + ", strAlcoholic=" + strAlcoholic + ", strGlass=" + strGlass + ", strInstructions="
				+ strInstructions + ", strInstructionsES=" + strInstructionsES + ", strInstructionsDE="
				+ strInstructionsDE + ", strInstructionsFR=" + strInstructionsFR + ", strInstructionsZH_HANS="
				+ strInstructionsZH_HANS + ", strInstructionsZH_HANT=" + strInstructionsZH_HANT + ", strDrinkThumb="
				+ strDrinkThumb + ", strIngredient1=" + strIngredient1 + ", strIngredient2=" + strIngredient2
				+ ", strIngredient3=" + strIngredient3 + ", strIngredient4=" + strIngredient4 + ", strIngredient5="
				+ strIngredient5 + ", strIngredient6=" + strIngredient6 + ", strIngredient7=" + strIngredient7
				+ ", strIngredient8=" + strIngredient8 + ", strIngredient9=" + strIngredient9 + ", strIngredient10="
				+ strIngredient10 + ", strIngredient11=" + strIngredient11 + ", strIngredient12=" + strIngredient12
				+ ", strIngredient13=" + strIngredient13 + ", strIngredient14=" + strIngredient14 + ", strIngredient15="
				+ strIngredient15 + ", strMeasure1=" + strMeasure1 + ", strMeasure2=" + strMeasure2 + ", strMeasure3="
				+ strMeasure3 + ", strMeasure4=" + strMeasure4 + ", strMeasure5=" + strMeasure5 + ", strMeasure6="
				+ strMeasure6 + ", strMeasure7=" + strMeasure7 + ", strMeasure8=" + strMeasure8 + ", strMeasure9="
				+ strMeasure9 + ", strMeasure10=" + strMeasure10 + ", strMeasure11=" + strMeasure11 + ", strMeasure12="
				+ strMeasure12 + ", strMeasure13=" + strMeasure13 + ", strMeasure14=" + strMeasure14 + ", strMeasure15="
				+ strMeasure15 + ", strCreativeCommonsConfirmed=" + strCreativeCommonsConfirmed + ", dateModified="
				+ dateModified + "]";
	}


	/** getter for name
	 * @return the drink name
	 */
	public String getName() {
		return name;
	}

	/** setter for name
	 * @param name Drink name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/** getter for drink id
	 * @return the drink id
	 */
	public String getIdDrink() {
		return idDrink;
	}

	/** setter for drink id
	 * @param idDrink Drink id
	 */
	public void setIdDrink(String idDrink) {
		this.idDrink = idDrink;
	}

	/** getter for str drink, the drink name
	 * @return strDrink 
	 */
	public String getStrDrink() {
		return strDrink;
	}

	/** setter for strDrink
	 * @param strDrink Drink string name
	 */
	public void setStrDrink(String strDrink) {
		this.strDrink = strDrink;
	}

	/** getter for getStrDrinkAlternate
	 * @return getStrDrinkAlternate
	 */
	public String getStrDrinkAlternate() {
		return strDrinkAlternate;
	}

	/** setter for strDrinkAlternate
	 * @param strDrinkAlternate Drink alternate
	 */
	public void setStrDrinkAlternate(String strDrinkAlternate) {
		this.strDrinkAlternate = strDrinkAlternate;
	}

	/** getter for strDrinkES
	 * @return strDrinkES
	 */
	public String getStrDrinkES() {
		return strDrinkES;
	}

	/** setter for strDrinkES
	 * @param strDrinkES Drink Spanish
	 */
	public void setStrDrinkES(String strDrinkES) {
		this.strDrinkES = strDrinkES;
	}

	/** getter for strDrinkDE
	 * @return strDrinkDE Drink
	 */
	public String getStrDrinkDE() {
		return strDrinkDE;
	}

	/** setter for strDrinkDE
	 * @param strDrinkDE Drink in German
	 */
	public void setStrDrinkDE(String strDrinkDE) {
		this.strDrinkDE = strDrinkDE;
	}

	/** getter for strDrinkFR
	 * @return strDrinkFR
	 */
	public String getStrDrinkFR() {
		return strDrinkFR;
	}

	/** setter for strDrinkFR
	 * @param strDrinkFR Drink in French
	 */
	public void setStrDrinkFR(String strDrinkFR) {
		this.strDrinkFR = strDrinkFR;
	}

	/** getter for strDrinkZH_HANS
	 * @return strDrinkZH_HANS
	 */
	public String getStrDrinkZH_HANS() {
		return strDrinkZH_HANS;
	}

	/** setter for strDrinkZH_HANS
	 * @param strDrinkZH_HANS Drink Chinese (Simplified)
	 */
	public void setStrDrinkZH_HANS(String strDrinkZH_HANS) {
		this.strDrinkZH_HANS = strDrinkZH_HANS;
	}

	/** getter for strDrinkZH_HANT
	 * @return strDrinkZH_HANT
	 */
	public String getStrDrinkZH_HANT() {
		return strDrinkZH_HANT;
	}

	/** setter for strDrinkZH_HANT
	 * @param strDrinkZH_HANT Drink Chinese (Traditional)
	 */
	public void setStrDrinkZH_HANT(String strDrinkZH_HANT) {
		this.strDrinkZH_HANT = strDrinkZH_HANT;
	}

	/** getter for strTags
	 * @return strTags
	 */
	public String getStrTags() {
		return strTags;
	}

	/** setter for strTags
	 * @param strTags Drink Tags
	 */
	public void setStrTags(String strTags) {
		this.strTags = strTags;
	}

	/** getter for strVideo
	 * @return strVideo
	 */
	public String getStrVideo() {
		return strVideo;
	}

	/** setter for strVideo
	 * @param strVideo Drink Video
	 */
	public void setStrVideo(String strVideo) {
		this.strVideo = strVideo;
	}

	/** getter for strCategory
	 * @return strCategory
	 */
	public String getStrCategory() {
		return strCategory;
	}

	/** setter for strCategory
	 * @param strCategory Drink Category
	 */
	public void setStrCategory(String strCategory) {
		this.strCategory = strCategory;
	}

	/** getter for strIBA
	 * @return strIBA
	 */
	public String getStrIBA() {
		return strIBA;
	}

	/** setter for strIBA
	 * @param strIBA Drink IBA
	 */
	public void setStrIBA(String strIBA) {
		this.strIBA = strIBA;
	}

	/** getter for strAlcoholic
	 * @return strAlcoholic
	 */
	public String getStrAlcoholic() {
		return strAlcoholic;
	}

	/** setter for strAlcoholic
	 * @param strAlcoholic Drink Alcoholic
	 */
	public void setStrAlcoholic(String strAlcoholic) {
		this.strAlcoholic = strAlcoholic;
	}

	/** getter for strGlass
	 * @return strGlass
	 */
	public String getStrGlass() {
		return strGlass;
	}

	/** setter for strGlass
	 * @param strGlass Drink Glass
	 */
	public void setStrGlass(String strGlass) {
		this.strGlass = strGlass;
	}

	/** getter for strInstructions
	 * @return strInstructions
	 */
	public String getStrInstructions() {
		return strInstructions;
	}

	/** setter for strInstructions
	 * @param strInstructions Drink Instructions
	 */
	public void setStrInstructions(String strInstructions) {
		this.strInstructions = strInstructions;
	}

	/** getter for strInstructionsES
	 * @return strInstructionsES
	 */
	public String getStrInstructionsES() {
		return strInstructionsES;
	}

	/** setter for strInstructionsES
	 * @param strInstructionsES Drink Instructions in Spanish
	 */
	public void setStrInstructionsES(String strInstructionsES) {
		this.strInstructionsES = strInstructionsES;
	}

	/** getter for strInstructionsDE
	 * @return strInstructionsDE
	 */
	public String getStrInstructionsDE() {
		return strInstructionsDE;
	}

	/** setter for strInstructionsDE
	 * @param strInstructionsDE Drink Instructions in German
	 */
	public void setStrInstructionsDE(String strInstructionsDE) {
		this.strInstructionsDE = strInstructionsDE;
	}

	/** getter for strInstructionsFR
	 * @return strInstructionsFR
	 */
	public String getStrInstructionsFR() {
		return strInstructionsFR;
	}

	/** setter for strInstructionsFR
	 * @param strInstructionsFR Drink Instructions in French
	 */
	public void setStrInstructionsFR(String strInstructionsFR) {
		this.strInstructionsFR = strInstructionsFR;
	}

	/** getter for strInstructionsZH_HANS
	 * @return strInstructionsZH_HANS
	 */
	public String getStrInstructionsZH_HANS() {
		return strInstructionsZH_HANS;
	}

	/** setter for strInstructionsZH_HANS
	 * @param strInstructionsZH_HANS Drink Instructions for Chinese (simplified)
	 */
	public void setStrInstructionsZH_HANS(String strInstructionsZH_HANS) {
		this.strInstructionsZH_HANS = strInstructionsZH_HANS;
	}

	/** getter for strInstructionsZH_HANT
	 * @return strInstructionsZH_HANT
	 */
	public String getStrInstructionsZH_HANT() {
		return strInstructionsZH_HANT;
	}

	/** setter for strInstructionsZH_HANT
	 * @param strInstructionsZH_HANT Drink Instructions for Chinese (Traditional)
	 */
	public void setStrInstructionsZH_HANT(String strInstructionsZH_HANT) {
		this.strInstructionsZH_HANT = strInstructionsZH_HANT;
	}

	/** getter for strDrinkThumb
	 * @return strDrinkThumb
	 */
	public String getStrDrinkThumb() {
		return strDrinkThumb;
	}

	/** setter for strDrinkThumb
	 * @param strDrinkThumb Drink Thumbnail URL
	 */
	public void setStrDrinkThumb(String strDrinkThumb) {
		this.strDrinkThumb = strDrinkThumb;
	}

	/** getter for strIngredient1
	 * @return strIngredient1
	 */
	public String getStrIngredient1() {
		return strIngredient1;
	}

	/** setter for strIngredient1
	 * @param strIngredient1 Drink Ingredient 1
	 */
	public void setStrIngredient1(String strIngredient1) {
		this.strIngredient1 = strIngredient1;
	}

	/** getter for strIngredient2
	 * @return strIngredient2
	 */
	public String getStrIngredient2() {
		return strIngredient2;
	}

	/** setter for strIngredient2
	 * @param strIngredient2 Drink Ingredient 2
	 */
	public void setStrIngredient2(String strIngredient2) {
		this.strIngredient2 = strIngredient2;
	}

	/** getter for strIngredient3
	 * @return strIngredient3
	 */
	public String getStrIngredient3() {
		return strIngredient3;
	}

	/** setter for strIngredient3
	 * @param strIngredient3 Drink Ingredient 3
	 */
	public void setStrIngredient3(String strIngredient3) {
		this.strIngredient3 = strIngredient3;
	}

	/** getter for strIngredient4
	 * @return strIngredient4
	 */
	public String getStrIngredient4() {
		return strIngredient4;
	}

	/** setter for strIngredient4
	 * @param strIngredient4 Drink Ingredient 4
	 */
	public void setStrIngredient4(String strIngredient4) {
		this.strIngredient4 = strIngredient4;
	}

	/** getter for strIngredient5
	 * @return strIngredient5
	 */
	public String getStrIngredient5() {
		return strIngredient5;
	}

	/** setter for strIngredient5
	 * @param strIngredient5 Drink Ingredient 5
	 */
	public void setStrIngredient5(String strIngredient5) {
		this.strIngredient5 = strIngredient5;
	}

	/** getter for strIngredient6
	 * @return strIngredient6
	 */
	public String getStrIngredient6() {
		return strIngredient6;
	}

	/** setter for strIngredient6
	 * @param strIngredient6 Drink Ingredient 6
	 */
	public void setStrIngredient6(String strIngredient6) {
		this.strIngredient6 = strIngredient6;
	}

	/** getter for strIngredient7
	 * @return strIngredient7
	 */
	public String getStrIngredient7() {
		return strIngredient7;
	}

	/** setter for strIngredient7
	 * @param strIngredient7 Drink Ingredient 7
	 */
	public void setStrIngredient7(String strIngredient7) {
		this.strIngredient7 = strIngredient7;
	}

	/** getter for strIngredient8
	 * @return strIngredient8
	 */
	public String getStrIngredient8() {
		return strIngredient8;
	}

	/** setter for strIngredient8
	 * @param strIngredient8 Drink Ingredient 8
	 */
	public void setStrIngredient8(String strIngredient8) {
		this.strIngredient8 = strIngredient8;
	}

	/** getter for strIngredient9
	 * @return strIngredient9
	 */
	public String getStrIngredient9() {
		return strIngredient9;
	}

	/** setter for strIngredient9
	 * @param strIngredient9 Drink Ingredient 9
	 */
	public void setStrIngredient9(String strIngredient9) {
		this.strIngredient9 = strIngredient9;
	}

	/** getter for strIngredient10
	 * @return strIngredient10
	 */
	public String getStrIngredient10() {
		return strIngredient10;
	}

	/** setter for strIngredient10
	 * @param strIngredient10 Drink Ingredient 10
	 */
	public void setStrIngredient10(String strIngredient10) {
		this.strIngredient10 = strIngredient10;
	}

	/** getter for strIngredient11
	 * @return strIngredient11
	 */
	public String getStrIngredient11() {
		return strIngredient11;
	}

	/** setter for strIngredient11
	 * @param strIngredient11 Drink Ingredient 11
	 */
	public void setStrIngredient11(String strIngredient11) {
		this.strIngredient11 = strIngredient11;
	}

	/** getter for strIngredient12
	 * @return strIngredient12
	 */
	public String getStrIngredient12() {
		return strIngredient12;
	}

	/** setter for strIngredient12 
	 * @param strIngredient12 Drink Ingredient 12
	 */
	public void setStrIngredient12(String strIngredient12) {
		this.strIngredient12 = strIngredient12;
	}

	/** getter for strIngredient13
	 * @return strIngredient13
	 */
	public String getStrIngredient13() {
		return strIngredient13;
	}

	/** setter for strIngredient13
	 * @param strIngredient13 Drink Ingredient 13
	 */
	public void setStrIngredient13(String strIngredient13) {
		this.strIngredient13 = strIngredient13;
	}

	/** getter for strIngredient14
	 * @return strIngredient14
	 */
	public String getStrIngredient14() {
		return strIngredient14;
	}

	/** setter for strIngredient14
	 * @param strIngredient14 Drink Ingredient 14
	 */
	public void setStrIngredient14(String strIngredient14) {
		this.strIngredient14 = strIngredient14;
	}

	/** getter for strIngredient15
	 * @return strIngredient15
	 */
	public String getStrIngredient15() {
		return strIngredient15;
	}

	/** setter for strIngredient15
	 * @param strIngredient15 Drink Ingredient 15
	 */
	public void setStrIngredient15(String strIngredient15) {
		this.strIngredient15 = strIngredient15;
	}

	/** getter for strMeasure1
	 * @return strMeasure1
	 */
	public String getStrMeasure1() {
		return strMeasure1;
	}

	/** setter for strMeasure1
	 * @param strMeasure1 Drink ingredient 1 measurement
	 */
	public void setStrMeasure1(String strMeasure1) {
		this.strMeasure1 = strMeasure1;
	}

	/** getter for strMeasure2
	 * @return strMeasure2
	 */
	public String getStrMeasure2() {
		return strMeasure2;
	}

	/** setter for strMeasure2
	 * @param strMeasure2 Drink ingredient 2 measurement
	 */
	public void setStrMeasure2(String strMeasure2) {
		this.strMeasure2 = strMeasure2;
	}

	/** getter for strMeasure3
	 * @return strMeasure3
	 */
	public String getStrMeasure3() {
		return strMeasure3;
	}

	/** setter for strMeasure3
	 * @param strMeasure3 Drink ingredient 3 measurement
	 */
	public void setStrMeasure3(String strMeasure3) {
		this.strMeasure3 = strMeasure3;
	}

	/** getter for strMeasure4
	 * @return strMeasure4
	 */
	public String getStrMeasure4() {
		return strMeasure4;
	}

	/** setter for strMeasure4
	 * @param strMeasure4 Drink ingredient 4 measurement
	 */
	public void setStrMeasure4(String strMeasure4) {
		this.strMeasure4 = strMeasure4;
	}

	/** getter for strMeasure5
	 * @return strMeasure5
	 */
	public String getStrMeasure5() {
		return strMeasure5;
	}

	/** setter for strMeasure5
	 * @param strMeasure5 Drink ingredient 5 measurement
	 */
	public void setStrMeasure5(String strMeasure5) {
		this.strMeasure5 = strMeasure5;
	}

	/** getter for strMeasure6
	 * @return strMeasure6
	 */
	public String getStrMeasure6() {
		return strMeasure6;
	}

	/** setter for strMeasure6
	 * @param strMeasure6 Drink ingredient 6 measurement
	 */
	public void setStrMeasure6(String strMeasure6) {
		this.strMeasure6 = strMeasure6;
	}

	/** getter for strMeasure7
	 * @return strMeasure7
	 */
	public String getStrMeasure7() {
		return strMeasure7;
	}

	/** setter for strMeasure7
	 * @param strMeasure7 Drink ingredient 7 measurement
	 */
	public void setStrMeasure7(String strMeasure7) {
		this.strMeasure7 = strMeasure7;
	}

	/** getter for strMeasure8
	 * @return strMeasure8
	 */
	public String getStrMeasure8() {
		return strMeasure8;
	}

	/** setter for strMeasure8
	 * @param strMeasure8 Drink ingredient 8 measurement
	 */
	public void setStrMeasure8(String strMeasure8) {
		this.strMeasure8 = strMeasure8;
	}

	/** getter for strMeasure9
	 * @return strMeasure9
	 */
	public String getStrMeasure9() {
		return strMeasure9;
	}

	/** setter for strMeasure9
	 * @param strMeasure9 Drink ingredient 9 measurement
	 */
	public void setStrMeasure9(String strMeasure9) {
		this.strMeasure9 = strMeasure9;
	}

	/** getter for strMeasure10
	 * @return strMeasure10
	 */
	public String getStrMeasure10() {
		return strMeasure10;
	}

	/** setter for strMeasure10
	 * @param strMeasure10 Drink ingredient 10 measurement
	 */
	public void setStrMeasure10(String strMeasure10) {
		this.strMeasure10 = strMeasure10;
	}

	/** getter for strMeasure11
	 * @return strMeasure11
	 */
	public String getStrMeasure11() {
		return strMeasure11;
	}

	/** setter for strMeasure11
	 * @param strMeasure11 Drink ingredient 11 measurement
	 */
	public void setStrMeasure11(String strMeasure11) {
		this.strMeasure11 = strMeasure11;
	}

	/** getter for strMeasure12
	 * @return strMeasure12
	 */
	public String getStrMeasure12() {
		return strMeasure12;
	}

	/** setter for strMeasure12
	 * @param strMeasure12 Drink ingredient 12 measurement
	 */
	public void setStrMeasure12(String strMeasure12) {
		this.strMeasure12 = strMeasure12;
	}

	/** getter for strMeasure13
	 * @return strMeasure13
	 */
	public String getStrMeasure13() {
		return strMeasure13;
	}

	/** setter for strMeasure13
	 * @param strMeasure13 Drink ingredient 13 measurement
	 */
	public void setStrMeasure13(String strMeasure13) {
		this.strMeasure13 = strMeasure13;
	}

	/** getter for strMeasure14
	 * @return strMeasure14
	 */
	public String getStrMeasure14() {
		return strMeasure14;
	}

	/** setter for strMeasure14
	 * @param strMeasure14 Drink ingredient 14 measurement
	 */
	public void setStrMeasure14(String strMeasure14) {
		this.strMeasure14 = strMeasure14;
	}

	/** getter for strMeasure15
	 * @return strMeasure15
	 */
	public String getStrMeasure15() {
		return strMeasure15;
	}

	/** setter for strMeasure15
	 * @param strMeasure15 Drink ingredient 15 measurement
	 */
	public void setStrMeasure15(String strMeasure15) {
		this.strMeasure15 = strMeasure15;
	}

	/** getter for strCreativeCommonsConfirmed
	 * @return strCreativeCommonsConfirmed
	 */
	public String getStrCreativeCommonsConfirmed() {
		return strCreativeCommonsConfirmed;
	}

	/** setter for strCreativeCommonsConfirmed
	 * @param strCreativeCommonsConfirmed Drink creative commons confirmed
	 */
	public void setStrCreativeCommonsConfirmed(String strCreativeCommonsConfirmed) {
		this.strCreativeCommonsConfirmed = strCreativeCommonsConfirmed;
	}

	/** getter for dateModified
	 * @return dateModified
	 */
	public String getDateModified() {
		return dateModified;
	}

	/** setter for dateModified
	 * @param dateModified Drink date last modified
	 */
	public void setDateModified(String dateModified) {
		this.dateModified = dateModified;
	}

}
