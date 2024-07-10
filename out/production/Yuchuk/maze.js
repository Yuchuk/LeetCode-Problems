/*
var buruuZam = document.querySelectorAll(".boundary");
console.log(buruuZam);
addEventListenerList(buruuZam);

function addEventListenerList(buruuZam){
	for(var i=0, len = buruuZam.length; i<len; i++){
		buruuZam[i].addEventListener("click", alertFunction);
	}
}
*/

var hulganaOngorsonEseh;
var isPlaying;
var togloomEhellee;
var togloomDuuslaa;
var allArea;

//тоглоом эхэллээ
window.onload = function(){
	togloomEhellee = document.getElementById("start");
	togloomEhellee.addEventListener("click", startGame);
	
	hulganaOngorsonEseh = document.getElementById("boundary1");
	hulganaOngorsonEseh.addEventListener("mouseover", alertFunction);
	hulganaOngorsonEseh = document.getElementById("boundary2");
	hulganaOngorsonEseh.addEventListener("mouseover", alertFunction);
	hulganaOngorsonEseh = document.getElementById("boundary3");
	hulganaOngorsonEseh.addEventListener("mouseover", alertFunction);
	hulganaOngorsonEseh = document.getElementById("boundary4");
	hulganaOngorsonEseh.addEventListener("mouseover", alertFunction);
	hulganaOngorsonEseh = document.getElementById("boundary5");
	hulganaOngorsonEseh.addEventListener("mouseover", alertFunction);
	
	allArea = document.getElementById("maze");
	//allArea.addEventListener("mouseout", alertFunction);
	
	togloomDuuslaa = document.getElementById("end");
	togloomDuuslaa.addEventListener("click", endGame);
}
//mouse over болсон эсэхийг шалгаад хариу үйлдэл хийнэ
function alertFunction(){
		if(isPlaying){
		alert("You clicked wrong way");
		isPlaying = false;
		//зам улаан өнгөтэй болгох
		allArea.style.backgroundColor = "red";
		} else {
		alert("Please click S button to start game");
		}
	}
function startGame() {
	isPlaying = true;
	allArea.style.backgroundColor = "white";
	console.log("You clicked S");
}
//тоглоом дууслаа 
function endGame(){
	if(isPlaying){
	alert("Congratulation! You won");
	isPlaying = false;}
}