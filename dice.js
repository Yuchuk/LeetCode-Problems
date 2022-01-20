//togloomiin buh gazar ashiglagdana
var activePlayer;
var scores;
var roundScore;
var isNewGame; //togloom duussan esehiig haruulna
var diceDom = document.querySelector(".dice");
initGame();
function initGame() {
    isNewGame = true;
    //toglogchiin eelj hadgalah. 1-g 0, 2-g 1 gej temdeglene
    activePlayer = 0;
    //toglogchiin tsugluulsan onoo hadgalah
    scores = [0, 0];
    //toglogchiin eeljiin onoo hadgalah huvisagch
    roundScore = 0;
    //program ehlehed 0 bh yostoi onoo
    document.getElementById('score-0').textContent = '0';
    //document.querySelector('#score-0').textContent = '0';
    document.getElementById('score-1').innerHTML = '0';
    document.getElementById('current-0').textContent = '0';
    document.getElementById('current-1').innerHTML = '0';
    //toglogchiin neriig utsaaj gargana
    document.getElementById("name-0").textContent = "Player 1";
    document.getElementById("name-1").textContent = "Player 2";
    document.querySelector(".player-0-panel").classList.remove("winner");
    document.querySelector(".player-1-panel").classList.remove("winner");
    document.querySelector(".player-0-panel").classList.remove("active");
    document.querySelector(".player-1-panel").classList.remove("active");
    document.querySelector(".player-0-panel").classList.add("active");
    diceDom.style.display = "none";
}
//shoog shideh event listener
document.querySelector(".btn-roll").addEventListener("click", function () {
    if (isNewGame) {
        //1-6 dotor toog sanamsargui avch bga
        var diceNumber = Math.floor(Math.random() * 6) + 1;
        //shoonii zurag gargaj irne
        diceDom.style.display = "block";
        //buusan sanamsargui tond hargalzah zurag haragdana
        diceDom.src = "images//dice-" + diceNumber + ".png";
        //  alert("Шоо нь:" + diceNumber + " буулаа");
        //toglogchiin eeljiin onoog oorchilno. 1-s ylgaatai too buusan bol onoog nemegduulne
        if (diceNumber !== 1) {
            //1-s ylgaatai too buulaa
            roundScore = roundScore + diceNumber;
            document.getElementById("current-" + activePlayer).textContent = roundScore;
        } else {
            switchToNextPlayer();
        }
    } else {
        alert("Тоглоом дууссан байна, Дахин эхлүүлнэ үү");
    }
});
//hold tovchnii event listener
document.querySelector(".btn-hold").addEventListener("click", function () {
    if (isNewGame) {
        scores[activePlayer] = scores[activePlayer] + roundScore;
        //delgets dr toog ni haruulna
        document.getElementById("score-" + activePlayer).textContent = scores[activePlayer];
        //ug toglogch hojson eshiig shalgah 100-s ih
        if (scores[activePlayer] >= 10) {
            //togloom duussan tolovt oruulna
            isNewGame = false;
            // hojson tul neriig yalagch bolgoj haruulna
            document.getElementById("name-" + activePlayer).textContent = "Winner";
            document.querySelector(".player-" + activePlayer + "-panel").classList.add("winner");
            document.querySelector(".player-" + activePlayer + "-panel").classList.remove("active");
        } else {
            //toglogchiin eelj solino
            switchToNextPlayer();
        }
    } else {
        alert("Тоглоом дууссан байна, Дахин эхлүүлнэ үү");
    }
});
//ene function ni daraagiin toglogchid shiljuulne
function switchToNextPlayer() {
    //eeljiin onoog 0 bolgono
    roundScore = 0;
    document.getElementById("current-" + activePlayer).textContent = 0;
    //herev idevhitei toglogch ni 0 bvl idevhitei toglogchiig 1 bolgo ugiu bol idevhitei toglogchiig 0 bolgo
    //toglogchiin eeljig nogoo toglogchid shiljuulne
    activePlayer === 0 ? (activePlayer = 1) : (activePlayer = 0);
    //ulaan ceg shiljuuleh code
    document.querySelector(".player-0-panel").classList.toggle("active");
    document.querySelector(".player-1-panel").classList.toggle("active");
    //shoog tur alga bolgono
    diceDom.style.display = "none";
}
//new game button nii event listener
document.querySelector(".btn-new").addEventListener("click", initGame);
