////////////////////PROTECTION///////////////////////
function guardup() {
    document.getElementById("mrprotection").style.display = "block";
}
function guarddown() {
    document.getElementById("mrprotection").style.display = "none";
}



function drinkVerify() {
    let DrinkName = document.getElementById("DN").value;
    submitOK = "true";
    errormessage = "";

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
            if (this.responseText == "Exists") {
                alert("Hooray you found a drink. Here are it's details...")
            } else if (this.responseText == "Exists") {
                alert("Couldn't find that drink, but we found something close...")
            } 
             else if (this.responseText == "Close") {
                alert("Couldn't find that drink, but we found something close...")
            } else if (this.responseText == "Again") {
                alert("You already searched that drink...")
            } else {
                alert("Couldn't find any drink to match your query.")
            }
            guarddown();
        }
    };
    xhttp.open("post", "/Drinks/checkDrink.do", true);
    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhttp.send(checkText);
}