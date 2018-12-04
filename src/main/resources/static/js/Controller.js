/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function deCelsiusAFahrenheit() {
    if (document.getElementById("firstInput").value !== "") {

        axios.get("/api/tofahrenheit/" + document.getElementById("firstInput").value)
                .then(function (response) {
                    document.getElementById("firstResult").value = response.data["Fahrenheit"];
                })
    } else {
        alert("Debe ingresar un valor");
    }
}

function deFahrenheitACelisus() {
    if (document.getElementById("secondInput").value !== ""){
        axios.get("/api/tocelsius/" + document.getElementById("secondInput").value)
                .then(function (response) {
                    document.getElementById("secondResult").value = response.data["Celsius"];
                })
    } else {
        alert("Debe ingresar un valor");
    }
}
