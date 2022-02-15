/*var p1 = {};
p1.name = "Chuka";
p1.info = function () {
    console.log(this.name + " named woman");
};
p1.info();
*/
//object uusgeh ehnii arga
var materi = {};
var amitan = Object.create(materi);
var hun = Object.create(amitan);
var tsereg = Object.create(hun);

materi.name = "Toosgo";
console.log(tsereg.name);
//object uusgeh daraaiiin arga
function animal(ner) {
    this.name = ner;
}
animal.prototype.hoolloh = function () {
    console.log(this.name + " peded");
}
var a1 = new animal("goat");
a1.hoolloh();
var a2 = new animal("sheep");
a2.hoolloh();

//function zeeleh buyu this-s bind-r solih arga
var img = {
    file: "images/chuka.jpg",
    content: "bag",
    zuragTanih: function (color) {
        console.log("this is" + this.content + this.color + "colored");
    }
}
img.zuragTanih(blue);

var myImg = {
    file: "images/irmuun.jpg",
    content: "car"
}
var mySuperZuragTanihProg = img.zuragTanih.bind(myImg, red);
mySuperZuragTanihProg();

// call ashiglan function duudaj ashiglah
img.zuragTanih.call(myImg, yellow); //bind-s ylgaatai ni shuud ter function-g nereer ni duudaad ashiglaj ba, hrn bind ni oor ner ogch ashigladag

//herev ih hemjeenii ogogdol avdag bol apply-g ashigluul iluu tohiromjtoi
var sanSun = ["pink", "horse"];
img.zuragTanih.apply(myImg, sanSun);