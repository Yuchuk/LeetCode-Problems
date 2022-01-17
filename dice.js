//toglogchiin eelj hadgalah. 1-g 0, 2-g 1 gej temdeglene
var activePlayer = 1;
//toglogchiin tsugluulsan onoo hadgalah
var scores = [0, 0];
//toglogchiin eeljiin onoo hadgalah huvisagch
var roundScore = 0;
//shoonii onoog haruulsan huvisagch. sanamsargui 1-6 utgatai bna
//var diceNumber = Math.floor(Math.random() * 6) + 1;
//document.querySelector('#score-0').textContent = dice;
//document.querySelector('#score-1').innerHTML = dice;
//program ehlehed 0 bh yostoi onoo
document.getElementById('score-0').textContent = '0';
//document.querySelector('#score-0').textContent = '0';
document.getElementById('score-1').innerHTML = '0';
document.getElementById('current-0').textContent = '0';
document.getElementById('current-1').innerHTML = '0';

var diceDom = document.querySelector(".dice");
diceDom.style.display = "none";

document.querySelector(".btn-roll").addEventListener("click", function () {
    var diceNumber = Math.floor(Math.random() * 6) + 1;
    diceDom.style.display = "block";
    diceDom.src = "images//dice-" + diceNumber + ".png";
    //  alert("Шоо нь:" + diceNumber + " буулаа");

});
