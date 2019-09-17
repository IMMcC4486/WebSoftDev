package P1;

import org.json.JSONException;
import org.json.JSONObject;

public class Drink {

	public Drink() {
		super();
	}

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

	public void populateFields(JSONObject drinks) throws JSONException {
		try {
			setIdDrink((String) drinks.get("idDrink"));
		} catch (ClassCastException e) {
			setIdDrink(null);
		}
		try {
			setStrDrink((String) drinks.get("strDrink"));
		} catch (ClassCastException e) {
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

	@Override
	public String toString() {
		return "Drink [idDrink=" + idDrink + ", strDrink=" + strDrink + ", strDrinkAlternate=" + strDrinkAlternate
				+ ", strDrinkES=" + strDrinkES + ", strDrinkDE=" + strDrinkDE + ", strDrinkFR=" + strDrinkFR
				+ ", strDrinkZH_HANS=" + strDrinkZH_HANS + ", strDrinkZH_HANT=" + strDrinkZH_HANT + ", strTags="
				+ strTags + ", strVideo=" + strVideo + ", strCategory=" + strCategory + ", strIBA=" + strIBA
				+ ", strAlcoholic=" + strAlcoholic + ", strGlass=" + strGlass + ", strInstructions=" + strInstructions
				+ ", strInstructionsES=" + strInstructionsES + ", strInstructionsDE=" + strInstructionsDE
				+ ", strInstructionsFR=" + strInstructionsFR + ", strInstructionsZH_HANS=" + strInstructionsZH_HANS
				+ ", strInstructionsZH_HANT=" + strInstructionsZH_HANT + ", strDrinkThumb=" + strDrinkThumb
				+ ", strIngredient1=" + strIngredient1 + ", strIngredient2=" + strIngredient2 + ", strIngredient3="
				+ strIngredient3 + ", strIngredient4=" + strIngredient4 + ", strIngredient5=" + strIngredient5
				+ ", strIngredient6=" + strIngredient6 + ", strIngredient7=" + strIngredient7 + ", strIngredient8="
				+ strIngredient8 + ", strIngredient9=" + strIngredient9 + ", strIngredient10=" + strIngredient10
				+ ", strIngredient11=" + strIngredient11 + ", strIngredient12=" + strIngredient12 + ", strIngredient13="
				+ strIngredient13 + ", strIngredient14=" + strIngredient14 + ", strIngredient15=" + strIngredient15
				+ ", strMeasure1=" + strMeasure1 + ", strMeasure2=" + strMeasure2 + ", strMeasure3=" + strMeasure3
				+ ", strMeasure4=" + strMeasure4 + ", strMeasure5=" + strMeasure5 + ", strMeasure6=" + strMeasure6
				+ ", strMeasure7=" + strMeasure7 + ", strMeasure8=" + strMeasure8 + ", strMeasure9=" + strMeasure9
				+ ", strMeasure10=" + strMeasure10 + ", strMeasure11=" + strMeasure11 + ", strMeasure12=" + strMeasure12
				+ ", strMeasure13=" + strMeasure13 + ", strMeasure14=" + strMeasure14 + ", strMeasure15=" + strMeasure15
				+ ", strCreativeCommonsConfirmed=" + strCreativeCommonsConfirmed + ", dateModified=" + dateModified
				+ "]";
	}

	public String getIdDrink() {
		return idDrink;
	}

	public void setIdDrink(String idDrink) {
		this.idDrink = idDrink;
	}

	public String getStrDrink() {
		return strDrink;
	}

	public void setStrDrink(String strDrink) {
		this.strDrink = strDrink;
	}

	public String getStrDrinkAlternate() {
		return strDrinkAlternate;
	}

	public void setStrDrinkAlternate(String strDrinkAlternate) {
		this.strDrinkAlternate = strDrinkAlternate;
	}

	public String getStrDrinkES() {
		return strDrinkES;
	}

	public void setStrDrinkES(String strDrinkES) {
		this.strDrinkES = strDrinkES;
	}

	public String getStrDrinkDE() {
		return strDrinkDE;
	}

	public void setStrDrinkDE(String strDrinkDE) {
		this.strDrinkDE = strDrinkDE;
	}

	public String getStrDrinkFR() {
		return strDrinkFR;
	}

	public void setStrDrinkFR(String strDrinkFR) {
		this.strDrinkFR = strDrinkFR;
	}

	public String getStrDrinkZH_HANS() {
		return strDrinkZH_HANS;
	}

	public void setStrDrinkZH_HANS(String strDrinkZH_HANS) {
		this.strDrinkZH_HANS = strDrinkZH_HANS;
	}

	public String getStrDrinkZH_HANT() {
		return strDrinkZH_HANT;
	}

	public void setStrDrinkZH_HANT(String strDrinkZH_HANT) {
		this.strDrinkZH_HANT = strDrinkZH_HANT;
	}

	public String getStrTags() {
		return strTags;
	}

	public void setStrTags(String strTags) {
		this.strTags = strTags;
	}

	public String getStrVideo() {
		return strVideo;
	}

	public void setStrVideo(String strVideo) {
		this.strVideo = strVideo;
	}

	public String getStrCategory() {
		return strCategory;
	}

	public void setStrCategory(String strCategory) {
		this.strCategory = strCategory;
	}

	public String getStrIBA() {
		return strIBA;
	}

	public void setStrIBA(String strIBA) {
		this.strIBA = strIBA;
	}

	public String getStrAlcoholic() {
		return strAlcoholic;
	}

	public void setStrAlcoholic(String strAlcoholic) {
		this.strAlcoholic = strAlcoholic;
	}

	public String getStrGlass() {
		return strGlass;
	}

	public void setStrGlass(String strGlass) {
		this.strGlass = strGlass;
	}

	public String getStrInstructions() {
		return strInstructions;
	}

	public void setStrInstructions(String strInstructions) {
		this.strInstructions = strInstructions;
	}

	public String getStrInstructionsES() {
		return strInstructionsES;
	}

	public void setStrInstructionsES(String strInstructionsES) {
		this.strInstructionsES = strInstructionsES;
	}

	public String getStrInstructionsDE() {
		return strInstructionsDE;
	}

	public void setStrInstructionsDE(String strInstructionsDE) {
		this.strInstructionsDE = strInstructionsDE;
	}

	public String getStrInstructionsFR() {
		return strInstructionsFR;
	}

	public void setStrInstructionsFR(String strInstructionsFR) {
		this.strInstructionsFR = strInstructionsFR;
	}

	public String getStrInstructionsZH_HANS() {
		return strInstructionsZH_HANS;
	}

	public void setStrInstructionsZH_HANS(String strInstructionsZH_HANS) {
		this.strInstructionsZH_HANS = strInstructionsZH_HANS;
	}

	public String getStrInstructionsZH_HANT() {
		return strInstructionsZH_HANT;
	}

	public void setStrInstructionsZH_HANT(String strInstructionsZH_HANT) {
		this.strInstructionsZH_HANT = strInstructionsZH_HANT;
	}

	public String getStrDrinkThumb() {
		return strDrinkThumb;
	}

	public void setStrDrinkThumb(String strDrinkThumb) {
		this.strDrinkThumb = strDrinkThumb;
	}

	public String getStrIngredient1() {
		return strIngredient1;
	}

	public void setStrIngredient1(String strIngredient1) {
		this.strIngredient1 = strIngredient1;
	}

	public String getStrIngredient2() {
		return strIngredient2;
	}

	public void setStrIngredient2(String strIngredient2) {
		this.strIngredient2 = strIngredient2;
	}

	public String getStrIngredient3() {
		return strIngredient3;
	}

	public void setStrIngredient3(String strIngredient3) {
		this.strIngredient3 = strIngredient3;
	}

	public String getStrIngredient4() {
		return strIngredient4;
	}

	public void setStrIngredient4(String strIngredient4) {
		this.strIngredient4 = strIngredient4;
	}

	public String getStrIngredient5() {
		return strIngredient5;
	}

	public void setStrIngredient5(String strIngredient5) {
		this.strIngredient5 = strIngredient5;
	}

	public String getStrIngredient6() {
		return strIngredient6;
	}

	public void setStrIngredient6(String strIngredient6) {
		this.strIngredient6 = strIngredient6;
	}

	public String getStrIngredient7() {
		return strIngredient7;
	}

	public void setStrIngredient7(String strIngredient7) {
		this.strIngredient7 = strIngredient7;
	}

	public String getStrIngredient8() {
		return strIngredient8;
	}

	public void setStrIngredient8(String strIngredient8) {
		this.strIngredient8 = strIngredient8;
	}

	public String getStrIngredient9() {
		return strIngredient9;
	}

	public void setStrIngredient9(String strIngredient9) {
		this.strIngredient9 = strIngredient9;
	}

	public String getStrIngredient10() {
		return strIngredient10;
	}

	public void setStrIngredient10(String strIngredient10) {
		this.strIngredient10 = strIngredient10;
	}

	public String getStrIngredient11() {
		return strIngredient11;
	}

	public void setStrIngredient11(String strIngredient11) {
		this.strIngredient11 = strIngredient11;
	}

	public String getStrIngredient12() {
		return strIngredient12;
	}

	public void setStrIngredient12(String strIngredient12) {
		this.strIngredient12 = strIngredient12;
	}

	public String getStrIngredient13() {
		return strIngredient13;
	}

	public void setStrIngredient13(String strIngredient13) {
		this.strIngredient13 = strIngredient13;
	}

	public String getStrIngredient14() {
		return strIngredient14;
	}

	public void setStrIngredient14(String strIngredient14) {
		this.strIngredient14 = strIngredient14;
	}

	public String getStrIngredient15() {
		return strIngredient15;
	}

	public void setStrIngredient15(String strIngredient15) {
		this.strIngredient15 = strIngredient15;
	}

	public String getStrMeasure1() {
		return strMeasure1;
	}

	public void setStrMeasure1(String strMeasure1) {
		this.strMeasure1 = strMeasure1;
	}

	public String getStrMeasure2() {
		return strMeasure2;
	}

	public void setStrMeasure2(String strMeasure2) {
		this.strMeasure2 = strMeasure2;
	}

	public String getStrMeasure3() {
		return strMeasure3;
	}

	public void setStrMeasure3(String strMeasure3) {
		this.strMeasure3 = strMeasure3;
	}

	public String getStrMeasure4() {
		return strMeasure4;
	}

	public void setStrMeasure4(String strMeasure4) {
		this.strMeasure4 = strMeasure4;
	}

	public String getStrMeasure5() {
		return strMeasure5;
	}

	public void setStrMeasure5(String strMeasure5) {
		this.strMeasure5 = strMeasure5;
	}

	public String getStrMeasure6() {
		return strMeasure6;
	}

	public void setStrMeasure6(String strMeasure6) {
		this.strMeasure6 = strMeasure6;
	}

	public String getStrMeasure7() {
		return strMeasure7;
	}

	public void setStrMeasure7(String strMeasure7) {
		this.strMeasure7 = strMeasure7;
	}

	public String getStrMeasure8() {
		return strMeasure8;
	}

	public void setStrMeasure8(String strMeasure8) {
		this.strMeasure8 = strMeasure8;
	}

	public String getStrMeasure9() {
		return strMeasure9;
	}

	public void setStrMeasure9(String strMeasure9) {
		this.strMeasure9 = strMeasure9;
	}

	public String getStrMeasure10() {
		return strMeasure10;
	}

	public void setStrMeasure10(String strMeasure10) {
		this.strMeasure10 = strMeasure10;
	}

	public String getStrMeasure11() {
		return strMeasure11;
	}

	public void setStrMeasure11(String strMeasure11) {
		this.strMeasure11 = strMeasure11;
	}

	public String getStrMeasure12() {
		return strMeasure12;
	}

	public void setStrMeasure12(String strMeasure12) {
		this.strMeasure12 = strMeasure12;
	}

	public String getStrMeasure13() {
		return strMeasure13;
	}

	public void setStrMeasure13(String strMeasure13) {
		this.strMeasure13 = strMeasure13;
	}

	public String getStrMeasure14() {
		return strMeasure14;
	}

	public void setStrMeasure14(String strMeasure14) {
		this.strMeasure14 = strMeasure14;
	}

	public String getStrMeasure15() {
		return strMeasure15;
	}

	public void setStrMeasure15(String strMeasure15) {
		this.strMeasure15 = strMeasure15;
	}

	public String getStrCreativeCommonsConfirmed() {
		return strCreativeCommonsConfirmed;
	}

	public void setStrCreativeCommonsConfirmed(String strCreativeCommonsConfirmed) {
		this.strCreativeCommonsConfirmed = strCreativeCommonsConfirmed;
	}

	public String getDateModified() {
		return dateModified;
	}

	public void setDateModified(String dateModified) {
		this.dateModified = dateModified;
	}

}
