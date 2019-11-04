////////////////////PROTECTION///////////////////////
function guardup() {
    document.getElementById("mrprotection").style.display = "block";
}
function guarddown() {
    document.getElementById("mrprotection").style.display = "none";
}



function checkExactDrink() {
    let DrinkName = document.getElementById("DN").value;
    submitOK = "true";
    errormessage = "";
    let drinkToSearch = "DRINKNAME=" + DrinkName;
    if (DrinkName.length < 1) {
        errormessage += "Enter an Drink name\n";
        submitOK = "false";
    }
    if (DrinkName.length > 50) {
        errormessage += "Drink name must be less than 50 characters\n";
        submitOK = "false";
    }

    if (submitOK == "false") {
        alert(errormessage)
        return false;
    }

    guardup();
    let xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
    	if (this.readyState == 4 && this.status == 200) {
            console.log("Got here");
            // if (this.responseText != "Nah Dawg"){
            //     console.log("DAWG")
            // 	let jResp = JSON.parse(response);
            // 	if (jResp.hasOwnProperty("ohFarts")){
            // 		document.getElementById("resultDiv").innerHTML = jResp.ohFarts;
            // 	}
            // 	DrinkDetails = "";
            // 	for (var prop in jResp) {
            // 		DrinkDetails += "<p>" + prop + " : " + jResp.prop + "</p><br>" 
            // 	}
			// 	document.getElementById("resultDiv").innerHTML = "<div id=\"DT\"></div><div id=\"DBod\"></div>";
			// 	document.getElementById("DT").innterHTML = "THAT DRINK EXISTS";
			// 	document.getElementById("DBod").innterHTML = DrinkDetails;
            // }
	    }
	};
    xhttp.open("post", "./checkExactDrink.do", true);
    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhttp.send(drinkToSearch);
};

function checkSimilarDrinks() {
	let DrinkName = document.getElementById("DN").value;
    submitOK = "true";
    errormessage = "";
    let drinkToSearch = "DRINKNAME=" + DrinkName;
    if (DrinkName.length < 1) {
        errormessage += "Enter an Drink name\n";
        submitOK = "false";
    }
    if (DrinkName.length > 50) {
        errormessage += "Drink name must be less than 50 characters\n";
        submitOK = "false";
    }

    if (submitOK == "false") {
        alert(errormessage)
        return false;
    }

    guardup();
    let xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            if (this.responseText != "Nah Dawg"){
            	let jResp = JSON.parse(response);
            	if (jResp.hasOwnProperty("ohFarts")){
            		document.getElementById("resultDiv").innerHTML = jResp.ohFarts;
            	}
            	DrinkDetails = "";
            	for (var prop in jResp) {
            		DrinkDetails += "<p>" + prop + " : " + jResp.prop + "</p><br>" 
            	}
//        		let ID = jResp.ID; 
//				let Drink  = jResp.Drink
//				let DES = jResp.DES;
//				let Cat = jResp.Cat;
//				let IBA = jResp.IBA;
//				let Alc = jResp.Alc;
//				let Glass = jResp.Glass;
//				let Ins = jResp.Ins;
//				let I1 = jResp.I1;
//				let I2 = jResp.I2;
//				let I3 = jResp.I3;
//				let I4 = jResp.I4;
//				let I5 = jResp.I5;
//				let M1 = jResp.M1;
//				let M2 = jResp.M2;
//				let M3 = jResp.M3;
//				let M4 = jResp.M4;
//				let M5 = jResp.M5;
				document.getElementById("resultDiv").innerHTML = "<div id=\"DT\"></div><div id=\"DBod\"></div>";
				document.getElementById("DT").innterHTML = "THAT DRINK EXISTS";
				document.getElementById("DBod").innterHTML = DrinkDetails;
            }
	    }
	    guarddown();
	};
    xhttp.open("post", "/DRINKPROJECT/checkExactDrink.do", true);
    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhttp.send(drinkToSearch);
}