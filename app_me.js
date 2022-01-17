// console.log('testing')
// //энэ хэсэгт тайлбар оруулж байна
// var a;
// var b = 15;
// var c = "aav";
// var a = c + b;
// console.log("энэ бол үр дүн:" + a);
// var date = prompt("Таны төрсөн он?");
// if (date !== null) {
//     var now = new Date().getFullYear();
//     var messege = "Сайн байна уу, \nТаны нас:" + (now - age);
//     var age = now - date;
//     if (age > 18) {
//         console.log("Та насанд хүрсэн байна");
//     }
//     else {
//         console.log("Та насанд хүрээгүй байна");
//     }
// }
// else {
//     alert("Та насаа оруулна уу");
// }

//хүний мэргэжил тодорхойлох кэйсийг switch function ашигласан жишээ
// var job = "programist";
// var name = "Чука";
// switch (job) {
//     case "багш":
//         console.log(name + " " + "Багш хүний хүүхэд юм");
//         break;
//     case "programist":
//         console.log(name + " " + "can write code");
//         break;
//     default: console.log(name + " " + "Another wonderful person");
// }
// function twins() {
//     console.log("how to be twins");
//     console.log("if you try, you can caught it");
// }
// twins();
// var torol;
// var name;
// var foryear;
// todorhoilolt("Chuka", 5, "salary");

// function todorhoilolt(name, foryear, torol) {
//     switch (torol) {
//         case "jobdesc":
//             console.log(name + " " + "нь GCM-д ажилдаг нь үнэн болно");
//             break;
//         case "salary":
//             console.log(name + " " + "200.000 долларын цалинтай ажил хийдэг");
//             break;
//         case "firedoff":
//             console.log(name + " " + "нь өөрийн хүсэлтээр ажлаас гарч бгаа болно");
//             break;
//         default: console.log(name + " " + "нь шилдэг ажилтан юм");
//     }
//     switch (true) {
//         case foryear > 10:
//             console.log(name + " " + "Маш өндөр туршлагатай ажилтан юм.");
//             break;
//         case foryear <= 10 && foryear >= 5:
//             console.log(name + " " + "туршлагатай ажилтан юм.");
//             break;
//         default: console.log(name + " " + "junior байнаа");
//     }
// }
// var module = function (too) {
//     var mod;
//     if (too < 0) mod = -too;
//     else mod = too;
//     return mod;
// }
// var addModules = function (x, y, z) {
//     var niilber = module(x) + module(y) + module(z);
//     return niilber;
// }
// var sum = addModules(-1, -2, -3);
// console.log(sum);
// var bbtfamily = {
//     dad: "Bayarbat",
//     mom: "Chuka",
//     son: "Irmuuhen",
//     location: "Fairfield"
// }
// var vision2022 = {
//     dadvision: "havecar",
//     momvision: "writecode",
//     sonvision: "learnenglish",
//     familyMembers: bbtfamily,
//     visionfunc: function () {
//         console.log(this.dadvision + this.momvision + this.sonvision);
//     }
// }
// console.log(vision2022.visionfunc());

// console.log(vision2022.familyMembers.location + "-d amidardag" + bbtfamily.dad + "-iin ger buliin 2022 onii zorilgo bol" + bbtfamily.dad + ": " + vision2022.dadvision + ", " + bbtfamily.mom + ": " + vision2022.momvision + ", " + bbtfamily.son + ": " + vision2022.sonvision + " yum. Husel buhen biyleh boltugai");
/*******huvisagchid object-n utga damjuulah**** */
// var chuka = "familymembers";
// var irmuun = "son";
// console.log(vision2022[chuka][son] + "bol manai huu ym");
/*********massive-n tuhai hicheel */
// var chuka = ['havetwins', 'becoder', 'beyoga', 'bewonderwoman', 'belovedwoman'];
// console.log(chuka[1]);
// chuka[2] = 'beslimbody';
// chuka[chuka.length] = 'beoptimisticwoman';
// chuka.push('behealthy'); //hamgiin suuld element nemeh
// chuka.unshift('befullenergy');
// //chuka.shift();
// // console.log(chuka[chuka.length - 1]);
// console.log(chuka.pop()); //hamgiin suuliin emement avah
// console.log(chuka);
// console.log(chuka.indexOf('bewonderwoman'));//massive-n utga dotor hailt hiigeed index-n butsaah
// if (chuka.indexOf('beoptimisticwoman') === -1) console.log('Таны оруулсан утга массивд байхгүй');
// else
//     console.log('Танай оруулсан утга массивын ' + chuka.indexOf('beoptimisticwoman') + '-дахь утга байна');
// var month = ['Jan', 'Feb', 'March', 'April', 'May', 'June', 'July', 'August', 'Sep', 'Dec'];
// // month.splice(1, 2); //hesgiig delete hiih
// var x = month.slice(1, 5);
// console.log(x);
// console.log(month);
// var course = {
//     Name: 'Biye daan surah',
//     Price: 5000,
//     Lesson: [
//         { Title: 'Ooriigoo hirhen sonsoh tuhai', Time: '05:00' },
//         { Title: 'Tuslah tooluud', Time: '05:00' }
//     ]
// }
// console.log('Ta ooriigoo olohiig husvel ' + course.Name + ' hicheeliig ' + course.Price + ' -iin unetei avsnaar ' + course.Lesson[0].Title + ' hicheel ni ' + course.Lesson[0].Time + ' hugatsaand ooriigoo olohdoo tuslaarai');
/*****davtalt tuhai hicheel */
// for (var i = 1; i < 11; i++) {
//     console.log(i);
// }
// var i = 1;
// while (i < 101) {
//     console.log(i);
//     i = i + 1;
// }

// var cmd = '';
// while (cmd !== 'quit') {
//     cmd = prompt('Comandaa oruulna uu ');
//     console.log('Tanii bichsn command: ' + cmd);
// }
// console.log('Davtalt duuslaa');

// do {
//     cmd = prompt('Comandaa oruulna uu ');
//     console.log('Tanii bichsn command: ' + cmd);
// } while (cmd !== 'quit');
// console.log('Davtalt duuslaa');
// var too = [45, 10, 8, 9, 15, 21, 54, 63];
// for (var i = 0; i < too.length; i++) {
//     if (too[i] % 7 !== 0) continue;
//     console.log(too[i]);
//     break;
// }
/*****try catch */
try {
    console.log('Program starting...');
    var x = prompt('Please insert one of 1 - 100 number');
    console.log('Your inserted number is ' + x);
} catch (error) {
    if (error.message === 'prompt is not defined') {
        console.log("Please use any browser");
    } else if (error.message === 'defined') {
        console.log('please wait for me');
    }
}