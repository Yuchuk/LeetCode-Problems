var bigDeco;
var sampleItem1;
var checkBox;
var checkBoxText;
var bodyImage;

window.onload = function(){ //DOM-d achaallah zohitsuulagch
	//button-ны ажиллах хэсэг
	bigDeco = document.getElementById("Big_Deco");
	bigDeco.addEventListener("click", myFunction);
	
	sampleItem1 = document.getElementById("Sample_Item1");
	
	//checkBox-ийн ажиллах хэсэг
	checkBox = document.getElementById("checkbox");
	checkBox.addEventListener("change", checkBoxFunction);

	checkBoxText = document.getElementById("checkBoxText");
	
	//body-н зургийг солих утга авах хэсэг
	bodyImage = document.getElementById("divArea");
};
function myFunction(){
	alert("Hello World");
	sampleItem1.style.fontSize = "xx-large";
};
function checkBoxFunction(){
	if(checkBox.checked == true){
	checkBoxText.style.fontWeight = "bold";
	checkBoxText.style.Color = "green";
	checkBoxText.style.textDecoration = "underline";
	bodyImage.style.backgroundImage = "images/pie.jpg"
	}else {
		checkBoxText.style.fontWeight = "normal";
	}
}

