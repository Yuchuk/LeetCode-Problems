function calculateTip() {
	var numSubTotal = parseInt((document.getElementsByName("numSubTotal")[0]).value);
	var numTipPercent = parseInt((document.getElementsByName("numTipPercent")[0]).value);
	var totalAmount = document.getElementsByName("totalAmount")[0];
	var numTipAmount = numSubTotal * numTipPercent / 100;
	totalAmount.innerHTML = numSubTotal + numTipAmount;
}
