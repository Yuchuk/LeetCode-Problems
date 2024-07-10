//эхний даалгуур
function printRudy(){
	var clickMe;
clickMe = document.getElementById("click_me");
clickMe.addEventListener("click", rudyTimer);
function rudyTimer(){ 
setTimeout(delayMsg2, 3000);}
function delayMsg2(){
	document.getElementById("print_here").innerHTML = "Rudy";
}
}
printRudy();

//дараагийн даалгуур
var accountName;
var accountDeposit;
var createAccount;
var textArea;
var textAreaNew;
window.onload = function(){
	createAccount.addEventListener("click", dansUusgeh);
}
function dansUusgeh(){
	accountName = (document.getElementsByName("account_name")[0]).value;
	accountDeposit = parseInt((document.getElementsByName("account_deposit")[0]).value);
	createAccount = document.getElementById("create_account");
	textArea = document.getElementById("text_area");
	if(textArea.value !==""){
		console.log(textArea.value);
	textArea.value = textArea.value + "\n" + accountName + " " + accountDeposit + " үлдэгдэлтэй данс үүслээ";
	}else {
		textArea.value = accountName + " " + accountDeposit + " үлдэгдэлтэй данс үүслээ";
	}
	};
dansUusgeh();

